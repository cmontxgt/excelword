import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import swx.excel.App;
import swx.excel.dao.word.QueryMapper;
import swx.excel.pojo.WordDto;
import swx.excel.utils.JacobOperaword;

import java.util.List;

/**
 * @author caomin
 * @date 2018/5/7
 * @说明
 */
@WebAppConfiguration
@SpringBootTest(classes = App.class)
@RunWith(value= SpringJUnit4ClassRunner.class)
public class TestWord {


    @Autowired
    QueryMapper queryMapper;

    @Test
    public void  test()throws Exception{
        JacobOperaword jacobOperaword = new JacobOperaword(true);
        //创建文档
        //jacobOperaword.moveDown(10);
        jacobOperaword.createNewDocument();

        List<String> zlpc = queryMapper.getTables("ZLPC");
        for (int i = 0; i < zlpc.size(); i++) {
            String tableName = zlpc.get(i);
            List<WordDto> wordList = queryMapper.getColumns(StringUtils.upperCase(tableName));
            List<String> columnsbz = queryMapper.getColumnsbz(StringUtils.upperCase(tableName));
            int tableIndex=i+1;
            int cols=4,rows=wordList.size()+1;
            String text=tableName+"表详细设计";
            jacobOperaword.insertText(tableName+"表详细设计");
            jacobOperaword.moveDown(2);
            jacobOperaword.moveRight(2);
            jacobOperaword.createTable(text,cols,rows);

            jacobOperaword.putTxtToCell(tableIndex,1,1,"代码");
            jacobOperaword.putTxtToCell(tableIndex,1,2,"名称");
            jacobOperaword.putTxtToCell(tableIndex,1,3,"数据类型");
            jacobOperaword.putTxtToCell(tableIndex,1,4,"注释");
            for (int j = 0; j < wordList.size(); j++) {
                jacobOperaword.putTxtToCell(tableIndex,j+2,1,wordList.get(j).getColumnName());
                jacobOperaword.putTxtToCell(tableIndex,j+2,2,columnsbz.get(j));
                jacobOperaword.putTxtToCell(tableIndex,j+2,3,wordList.get(j).getColumnType()+"("+wordList.get(j).getColumnLength()+")");
                jacobOperaword.putTxtToCell(tableIndex,j+2,4,columnsbz.get(j));
            }
            jacobOperaword.moveDown(3);
            jacobOperaword.insertText("我是华丽的分隔线");
        }
        jacobOperaword.save("d:/test.doc");
        jacobOperaword.setSaveOnExit(true);
        jacobOperaword.closeDocumentWithoutSave();
        jacobOperaword.closeDocument();
        jacobOperaword.close();
    }



    }



