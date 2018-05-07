package swx.excel.word;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Bookmarks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2018/3/31.
 */
public class test1 {


    public static void main(String[] args) throws IOException {
        InputStream input = null;
        File docFile = new File( "" );
        HWPFDocument document = null;
        try{
            input = new FileInputStream(docFile);//加载 doc 文档
            document = new HWPFDocument(input);//文件流方式创建hwpf
            Bookmarks bookmarks =  document.getBookmarks();//文档书签
            for(int i=0,length=bookmarks.getBookmarksCount();i<length;i++){

            }

        }catch( Exception e){

        }finally{
            if( null != input )
                input.close();
        }
    }
}
