package crawler;

import crawler.util.WriteUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * Created by xh on 2015/12/3.
 */
public class ChapterDownLoad implements Runnable{

    private LinkedList<Chapter> chapters = new LinkedList<Chapter>();

    private Map<Integer,Chapter> map = new HashMap<Integer, Chapter>();

    private int chapterSize = 0;

    public ChapterDownLoad(List<Chapter> chapters){
        this.chapters.addAll(chapters);
        this.chapterSize = this.chapters.size();
    }


    public void run() {
        while (chapters.size() != 0){
            Chapter c = chapters.remove();
            try {

                System.out.println("=== start to download chapter"+c.getIndex());
                String html = Download.downloadAsString(c.getUrl());
                if (org.jsoup.helper.StringUtil.isBlank(html)){
                    System.out.println("============= no content "+c.getIndex()+" "+c.getTitle()+" "+c.getUrl());
                    return;
                }
                Document chap = Jsoup.parse(html);
                String content = getContent(chap);
                c.setContent(content);


            }catch (Exception eee){
                System.out.println(c.getIndex()+" "+c.getTitle()+" "+c.getUrl());
            }finally {
                try {
                    put(c);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }


        }
    }

    String getContent(Document d){
        String content = "";
        Element e = d.getElementById("contents");
        List<Node> children = e.childNodes();
        for (Node cc: children){
            if (cc.getClass().getSimpleName().equals("TextNode")){
                TextNode ct = (TextNode) cc;
                content = content.concat(ct.text());
            }else if (cc.getClass().getSimpleName().equals("Element")){
                Element ce = (Element) cc;
                if (ce.tagName().equals("br")){
                    content = content.concat("\n");
                }
            }
        }
        return content;
    }

    void put(Chapter c) throws UnsupportedEncodingException {
        map.put(c.getIndex(),c);
        if (map.size() == this.chapterSize){
            List<Chapter> list = new ArrayList<Chapter>(map.values());
            Collections.sort(list, new Comparator<Chapter>() {
                public int compare(Chapter o1, Chapter o2) {
                    return o1.getIndex()-o2.getIndex();
                }
            });
            String target = "C:\\Users\\xh\\Desktop\\";
            target = new String(target.getBytes(),"gbk");
            String name = "lingjianshan.txt";
            name = new String(name.getBytes(),"gbk");
            WriteUtil.WriteChapter2Book(list,target,name);
        }
    }
}
