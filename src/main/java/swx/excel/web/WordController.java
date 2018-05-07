package swx.excel.web;

import org.springframework.beans.factory.annotation.Autowired;
import swx.excel.dao.word.QueryMapper;
import swx.excel.utils.JacobOperaword;

import java.util.List;

/**
 * @author caomin
 * @date 2018/5/7
 * @说明 word
 */
public class WordController {

    @Autowired
    QueryMapper queryMapper;

    public void  test()throws Exception{

        List<String> zlpc = queryMapper.getTables("ZLPC");
        zlpc.clear();
        zlpc.add("BDCS_QL_XZ");
        zlpc.add("BDCS_QL_XZ");


        for (String s : zlpc) {
            //List<WordDto> wordList = queryMapper.getWordList(StringUtils.upperCase(s));
        }

        JacobOperaword jacobOperaword = new JacobOperaword(true);
        jacobOperaword.createNewDocument();
        jacobOperaword.moveDown(10);

        jacobOperaword.createTable("",4,5);
        jacobOperaword.moveRight(3);
        jacobOperaword.moveDown(5);
        jacobOperaword.insertText("test");
        jacobOperaword.moveDown(2);
        jacobOperaword.moveRight(4);
        jacobOperaword.createTable("",4,5);

        jacobOperaword.moveRight(3);
        jacobOperaword.moveDown(5);
        jacobOperaword.insertText("test2");
        jacobOperaword.save("d:/test.doc");
        jacobOperaword.setSaveOnExit(true);
        jacobOperaword.closeDocumentWithoutSave();
        jacobOperaword.closeDocument();
        jacobOperaword.close();
    }
}
