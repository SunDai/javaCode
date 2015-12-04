package crawler.util;

import crawler.Chapter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by xh on 2015/12/3.
 */
public class WriteUtil {
    public static void WriteChapter2Book(List<Chapter> chapters,String target,String name){
        try {
            FileWriter writer = new FileWriter(target+name);
            for (Chapter c:chapters){
                String title ="第"+c.getIndex()+"章 "+c.getTitle()+"\n";
                title = new String(title.getBytes(),"gbk");
                writer.write(title);
                writer.write(c.getContent()+"\n");
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String string = new String("你谁人了咖啡的".getBytes(),"gbk");
        System.out.println(string);
    }
}
