package swx.excel.utils;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import swx.excel.excel.ExcelModel;
import swx.excel.excel.ExcelModelRepository;
import swx.excel.pojo.PcxflVo;

import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @caomin
 * @create 2017-12-25 11:17
 **/
@Component
public class ExcelUtils {

    @Autowired
    ExcelModelRepository excelModelRepository;

    /**
     * 批量操作excel，将数据导入mongodb
     * @param
     */
    public List<String> readExcelToObj(List<File> files)throws Exception {
        List<String>collectionNames= new ArrayList<>();
        Workbook wb = null;
        if (!CollectionUtils.isEmpty(files)){
            for (File file : files) {
                wb = WorkbookFactory.create(file);
                //数据存放的分组名，一个文件一个分组
                String collectionName=file.getName();
                //将顶级本配置存进去
                String pclbpzbmb = getPclbpzbmb(file.getAbsolutePath());
                ExcelModel excelModel = new ExcelModel();
                excelModel.setPclb("lbpzb");
                excelModel.setPcnr(pclbpzbmb);
                collectionNames.add(collectionName);
                excelModelRepository.save(excelModel,collectionName);
                int sheetCount = wb.getNumberOfSheets();
                for (int i = 0; i < sheetCount; i++) {
                    readExcelToMongoDb(wb, i, 0, 0,collectionName);
                }
            }
        }
       return collectionNames;
    }



    /**
     * 获取类别配置表 模板数据
     * @param path
     * @return
     * @throws Exception
     */
    private String getPclbpzbmb(String path)throws Exception{

        Workbook   wb = WorkbookFactory.create(new File(path));
        int sheetCount = wb.getNumberOfSheets();
        for (int i = 0; i < sheetCount; i++) {
            HashSet arrayList = readExcelToList(wb, i, 1, 2);
          if (!arrayList.isEmpty()){
              if (arrayList.iterator().hasNext()){
                  return (String) arrayList.iterator().next();
              }
          }
        }
         return null;
    }


    /**
     * 读取excel文件
     * @param wb
     * @param sheetIndex sheet页下标：从0开始
     * @param startReadLine 开始读取的行:从0开始
     * @param tailLine 去除最后读取的行
     */
    private void readExcelToMongoDb(Workbook wb, int sheetIndex, int startReadLine, int tailLine, String collectionName) {
        Sheet sheet = wb.getSheetAt(sheetIndex);
        Row row = null;
        ArrayList<ExcelModel> result = new ArrayList<>();
        for(int i=startReadLine; i<sheet.getLastRowNum()-tailLine+1; i++) {
            row = sheet.getRow(i);
            if (row==null){
                continue;
            }
            ExcelModel model = new ExcelModel();
            for(Cell c : row) {
                /**
                 * 单元格值
                 */
                String cellVaule=null;
                if (c==null){
                    System.out.print("null");
                }
                boolean isMerge = isMergedRegion(sheet, i, c.getColumnIndex());
                //判断是否具有合并单元格
                if(isMerge) {
                    cellVaule = getMergedRegionValue(sheet, row.getRowNum(), c.getColumnIndex());
                }else {
                    cellVaule=getCellValue(c);
                }
                setModelValue(model,c,cellVaule);
            }
            String xh = model.getXh();
            try {
                NumberFormat.getInstance().parse(xh);
                excelModelRepository.save(model,collectionName);
            }catch (Exception e){
                System.out.println("非法数据，不做处理");
            }
            result.add(model);
        }
        System.out.println(result);
    }

    /**
     * 读取excel文件
     * @param wb
     * @param sheetIndex sheet页下标：从0开始
     * @param startReadLine 开始读取的行:从0开始
     * @param
     */
    public HashSet readExcelToList(Workbook wb,int sheetIndex, int startReadLine, int endReadLine) {
        Sheet sheet = wb.getSheetAt(sheetIndex);
        Row row = null;
        HashSet<String> result = new HashSet<>();
        for(int i=startReadLine; i<endReadLine; i++) {
            row = sheet.getRow(i);
            if (row==null){
                continue;
            }
            for(Cell c : row) {
                /**
                 * 单元格值
                 */
                String cellVaule=null;
                if (c==null){
                    System.out.print("null");
                }
                boolean isMerge = isMergedRegion(sheet, i, c.getColumnIndex());
                //判断是否具有合并单元格
                if(isMerge) {
                    cellVaule = getMergedRegionValue(sheet, row.getRowNum(), c.getColumnIndex());
                }else {
                    cellVaule=getCellValue(c);
                }
                if (cellVaule!=null){
                    if (!StringUtils.isEmpty(cellVaule)){
                        result.add(cellVaule);
                    }
                }
            }
        }
        return result;
    }

    /**
     * 获取合并单元格的值
     * @param sheet
     * @param row
     * @param column
     * @return
     */
    public String getMergedRegionValue(Sheet sheet ,int row , int column){
        int sheetMergeCount = sheet.getNumMergedRegions();

        for(int i = 0 ; i < sheetMergeCount ; i++){
            CellRangeAddress ca = sheet.getMergedRegion(i);
            int firstColumn = ca.getFirstColumn();
            int lastColumn = ca.getLastColumn();
            int firstRow = ca.getFirstRow();
            int lastRow = ca.getLastRow();

            if(row >= firstRow && row <= lastRow){

                if(column >= firstColumn && column <= lastColumn){
                    Row fRow = sheet.getRow(firstRow);
                    Cell fCell = fRow.getCell(firstColumn);
                    return getCellValue(fCell) ;
                }
            }
        }

        return null ;
    }

    /**
     * 判断合并了行
     * @param sheet
     * @param row
     * @param column
     * @return
     */
    private boolean isMergedRow(Sheet sheet,int row ,int column) {
        int sheetMergeCount = sheet.getNumMergedRegions();
        for (int i = 0; i < sheetMergeCount; i++) {
            CellRangeAddress range = sheet.getMergedRegion(i);
            int firstColumn = range.getFirstColumn();
            int lastColumn = range.getLastColumn();
            int firstRow = range.getFirstRow();
            int lastRow = range.getLastRow();
            if(row == firstRow && row == lastRow){
                if(column >= firstColumn && column <= lastColumn){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 判断指定的单元格是否是合并单元格
     * @param sheet
     * @param row 行下标
     * @param column 列下标
     * @return
     */
    private boolean isMergedRegion(Sheet sheet,int row ,int column) {
        int sheetMergeCount = sheet.getNumMergedRegions();
        for (int i = 0; i < sheetMergeCount; i++) {
            CellRangeAddress range = sheet.getMergedRegion(i);
            int firstColumn = range.getFirstColumn();
            int lastColumn = range.getLastColumn();
            int firstRow = range.getFirstRow();
            int lastRow = range.getLastRow();
            if(row >= firstRow && row <= lastRow){
                if(column >= firstColumn && column <= lastColumn){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 判断sheet页中是否含有合并单元格
     * @param sheet
     * @return
     */
    private boolean hasMerged(Sheet sheet) {
        return sheet.getNumMergedRegions() > 0 ? true : false;
    }

    /**
     * 合并单元格
     * @param sheet
     * @param firstRow 开始行
     * @param lastRow 结束行
     * @param firstCol 开始列
     * @param lastCol 结束列
     */
    private void mergeRegion(Sheet sheet, int firstRow, int lastRow, int firstCol, int lastCol) {
        sheet.addMergedRegion(new CellRangeAddress(firstRow, lastRow, firstCol, lastCol));
    }

    /**
     * 获取单元格的值
     * @param cell
     * @return
     */
    public String getCellValue(Cell cell){

        if(cell == null) return  "";

        if(cell.getCellType() == Cell.CELL_TYPE_STRING){

            return cell.getStringCellValue();

        }else if(cell.getCellType() == Cell.CELL_TYPE_BOOLEAN){

            return String.valueOf(cell.getBooleanCellValue());

        }else if(cell.getCellType() == Cell.CELL_TYPE_FORMULA){

            return cell.getCellFormula() ;

        }else if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC){

            return String.valueOf(cell.getNumericCellValue());

        }
        return "";
    }


    /**
     * 设置值
     * @param model
     * @param cell
     * @param value
     */
    public void setModelValue(ExcelModel model, Cell cell, String value){
        int columnIndex = cell.getColumnIndex();
        if (columnIndex==0){
            model.setXh(value);
        }else if (columnIndex==1){
            model.setPclb(value);
        }else if (columnIndex==2){
            model.setPcnr(value);
        }else if (columnIndex==3){
            model.setZlbz(value);
        }else if (columnIndex==4){
            model.setPcbz(value);
        }else if (columnIndex==5){
            model.setKfz(value);
        }else if (columnIndex==6){
            model.setFlyj(value);
        }else if (columnIndex==7){
            model.setCwdj(value);
        }else if (columnIndex==8){
            model.setXtsfkysx(value);
        }else if (columnIndex==9){
            model.setXxsm(value);
        }else if (columnIndex==10){
            model.setPcyj(value);
        }else if (columnIndex==11){
            model.setWsbm(value);
        }else if (columnIndex==12){
            model.setCcgc(value);
        }else if (columnIndex==13){
            model.setCcgcmc(value);
        }
    }
    /**
     * 读取某个文件夹下的所有文件
     */
    public  List<File> readfile(String filepath,List<File> result) throws  Exception {
        if (result==null){
            result=new ArrayList<>();
        }
        File file = new File(filepath);
        if (file.isFile()) {
            result.add(file);
        }else if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                readfile(file1.getAbsolutePath(),result);
            }
        }
        return result;
    }


    /**
     * 读取excel文件
     * @param wb
     * @param sheetIndex sheet页下标：从0开始
     * @param startReadLine 开始读取的行:从0开始
     * @param
     */
    public  ArrayList<PcxflVo> readPcxExcel(Workbook wb,int sheetIndex, int startReadLine, int endReadLine) {
        Sheet sheet = wb.getSheetAt(sheetIndex);
        Row row = null;
        ArrayList<PcxflVo> result = new ArrayList<>();
        for(int i=startReadLine; i<=endReadLine; i++) {
            row = sheet.getRow(i);
            if (row==null){
                continue;
            }
            PcxflVo pcxflVo=new PcxflVo();
            pcxflVo.setId(UUID.randomUUID().toString());
            for(Cell c : row) {
                /**
                 * 单元格值
                 */
                String cellVaule=null;
                if (c==null){
                    System.out.print("null");
                }
                boolean isMerge = isMergedRegion(sheet, i, c.getColumnIndex());
                //判断是否具有合并单元格
                if(isMerge) {
                    cellVaule = getMergedRegionValue(sheet, row.getRowNum(), c.getColumnIndex());
                }else {
                    cellVaule=getCellValue(c);
                }
                if (cellVaule!=null){
                    if (!StringUtils.isEmpty(cellVaule)){
                        if (c.getColumnIndex()==0){
                            pcxflVo.setParent(cellVaule);
                        }
                        else if (c.getColumnIndex()==1){
                            pcxflVo.setPcxflmc(cellVaule);
                        }else if (c.getColumnIndex()==2){
                            pcxflVo.setPcxmc(cellVaule);
                        }else if (c.getColumnIndex()==3){
                            pcxflVo.setXh(cellVaule);
                        }
                    }
                }
            }
            if (StringUtils.isEmpty(pcxflVo.getPcxmc())){
                pcxflVo.setPcxmc("empty");
            }
            result.add(pcxflVo);
        }
        return result;
    }
}
