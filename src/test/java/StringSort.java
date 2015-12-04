import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by xh on 2015/11/27.
 */
public class StringSort {
    public static void main(String[] args) throws Exception{
        String path = "C:\\Users\\xh\\Desktop\\new4.txt";
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String line="";
        List<Url> urls = new ArrayList<Url>();
        while ((line =br.readLine() )!= null){
            Url url = new Url(line);
            urls.add(url);
        }
        Collections.sort(urls, new Comparator<Url>() {
            public int compare(Url o1, Url o2) {
                if (!o1.channel.equals(o2.channel)){
                    return o1.channel.compareTo(o2.channel);
                }else {
                    return o1.titleEmpty+o1.contentEnmpty+o1.pubStrEmpty-(o2.titleEmpty+o2.contentEnmpty+o2.pubStrEmpty);
                }
            }
        });
        FileWriter fw = new FileWriter("C:\\Users\\xh\\Desktop\\sortedUrls.txt");
        for (Url url:urls){
            fw.write(url.msg);
            fw.write("\n");
        }
        fw.flush();
        fw.close();
        System.out.println("done!");
//        Url url = new Url("http://world.people.com.cn/n/2012/1022/c1002-19341197.html title is empty content is empty pubDate String is empty");
//        System.out.println("url is "+url.url);
//        System.out.println("title is "+url.titleEmpty);
//        System.out.println("content is "+url.contentEnmpty);
//        System.out.println("pubDate is "+url.pubStrEmpty);
//        System.out.println("channel is "+url.channel);
    }

    static class Url{
        private String url;
        private int titleEmpty;
        private int contentEnmpty;
        private int pubStrEmpty;

        private String channel;
        private String msg;

        public Url(String msg) {
            this.msg = msg;
            this.titleEmpty = msg.indexOf("title")>=0?1:0;
            this.contentEnmpty = msg.indexOf("content")>=0?1:0;
            this.pubStrEmpty = msg.indexOf("pubDate")>=0?1:0;
            int blankIndex = msg.indexOf(" ");
            this.url = msg.substring(0,blankIndex);
            int firstComma = url.indexOf(".");
            this.channel = url.substring(7,firstComma);
        }

        public String getChannel() {
            return channel;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getTitleEmpty() {
            return titleEmpty;
        }

        public void setTitleEmpty(int titleEmpty) {
            this.titleEmpty = titleEmpty;
        }

        public int getContentEnmpty() {
            return contentEnmpty;
        }

        public void setContentEnmpty(int contentEnmpty) {
            this.contentEnmpty = contentEnmpty;
        }

        public int getPubStrEmpty() {
            return pubStrEmpty;
        }

        public void setPubStrEmpty(int pubStrEmpty) {
            this.pubStrEmpty = pubStrEmpty;
        }
    }
}
