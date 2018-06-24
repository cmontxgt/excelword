package swx.excel.word;

import org.apache.poi.xwpf.usermodel.*;
import org.joda.time.DateTime;
import org.junit.Test;
import swx.excel.utils.JacobOperaword;

import java.io.*;
import java.util.*;

/**
 * Created by Administrator on 2018/3/31.
 */
public class test1 {

/*
    public static void main(String[] args) throws IOException {
        InputStream input = null;
        File docFile = new File( "e://test.doc" );
        File target = new File( "e://test1.doc" );

        FileCopyUtils.copy(docFile,target);
        HWPFDocument document = null;
        try{
            input = new FileInputStream(target);//加载 doc 文档
            document = new HWPFDocument(input);//文件流方式创建hwpf
            Bookmarks bookmarks =  document.getBookmarks();//文档书签
            for(int i=0;i<bookmarks.getBookmarksCount();i++){
                Range range= document.getRange();
                Bookmark bookmark = bookmarks.getBookmark(i);
               // Range range=new Range(bookmark.getStart(),bookmark.getEnd(),document);
               // range.replaceText("cm",false);
                System.out.println(range.text());
            }
        }catch( Exception e){
            e.printStackTrace();
        }finally{
            //document.write(target);
            if( null != input )
                input.close();
        }
    }*/
    public static void main(String[] args) throws IOException {

        String srcPath = "E:\\test.docx";
        String destPath = "E:\\testRepacetest.doc";

        InputStream in = new FileInputStream(srcPath);
        FileOutputStream out = new FileOutputStream(destPath);
        Map<String, String> map = new HashMap<>();
        map.put("DWMC", "上海市人民检察院");
        map.put("DATE", DateTime.now().toString());
        map.put("FAMC", "2018年第一季度专项评查方案");

        replaceText(in, out, map);
        in.close();
        out.close();

    }



    public static void replaceText(InputStream inputStream, OutputStream outputStream, Map<String, String> map) {
        try {
            XWPFDocument document;//= new XWPFDocument(POIXMLDocument.openPackage(srcPath));
            document = new XWPFDocument(inputStream);
            //1. 替换段落中的指定文字
            Iterator<XWPFParagraph> itPara = document.getParagraphsIterator();
            String text;
            Set<String> set;
            XWPFParagraph paragraph;
            List<XWPFRun> run;
            String key;
            while (itPara.hasNext()) {
                paragraph = itPara.next();
                set = map.keySet();
                Iterator<String> iterator = set.iterator();
                while (iterator.hasNext()) {
                    key = iterator.next();
                    run = paragraph.getRuns();
                    for (int i = 0, runSie = run.size(); i < runSie; i++) {
                        text = run.get(i).getText(run.get(i).getTextPosition());
                        if (text != null && text.equals(key)) {
                            run.get(i).setText(map.get(key), 0);
                        }
                    }
                }
            }
            //2. 替换表格中的指定文字
            Iterator<XWPFTable> itTable = document.getTablesIterator();
            XWPFTable table;
            int rowsCount;
            while (itTable.hasNext()) {
                table = itTable.next();
                rowsCount = table.getNumberOfRows();
                for (int i = 0; i < rowsCount; i++) {
                    XWPFTableRow row = table.getRow(i);
                    List<XWPFTableCell> cells = row.getTableCells();
                    for (XWPFTableCell cell : cells) {
                        for (Map.Entry<String, String> e : map.entrySet()) {
                            if (cell.getText().equals(e.getKey())) {
                                cell.removeParagraph(0);
                                cell.setText(e.getValue());
                            }
                        }
                    }
                }
            }
            //3.输出流
            document.write(outputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void test()throws Exception{
        JacobOperaword jacobOperaword=new JacobOperaword(false);

        jacobOperaword.openDocument("E://评查流转单.doc");
        jacobOperaword.intoValueBookMark("AJMC","案件名称");
        jacobOperaword.intoValueBookMark("BZXX","备注信息");
        jacobOperaword.intoValueBookMark("PCYYJ","合格案件");

        jacobOperaword.save("e:/jacobTest.doc");
        jacobOperaword.setSaveOnExit(true);
        jacobOperaword.closeDocumentWithoutSave();
        jacobOperaword.closeDocument();
        jacobOperaword.close();



    }

}
