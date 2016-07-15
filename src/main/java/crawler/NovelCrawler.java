package crawler;

import crawler.util.StringUtil;
import crawler.util.WriteUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.*;

/**
 * Created by xh on 2015/12/2.
 */
public class NovelCrawler {

    static String[] str = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "零", "一", "二", "三", "四", "五", "六", "七", "八", "九", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖", "个", "十", "百", "千", "万", "十", "百", "千", "亿"};

    static Set<String> numChars = new HashSet<String>(Arrays.asList(str));


    public static void main(String[] args) throws IOException, InterruptedException {
        String baseUrl = "http://www.23wx.com/html/49/49803/";
        String baseBody = Download.downloadAsString(baseUrl);
        Document root = Jsoup.parse(baseBody, baseUrl);
        List<Chapter> chapters = getBookChapters(root);
        ChapterDownLoad run = new ChapterDownLoad(chapters);
        for (int i = 0;i<20;i++){
            Thread t = new Thread(run,"thread-"+(i+1));
            t.start();
        }
//        for (Chapter c :chapters){
//            System.out.println("=== start to download chapter"+c.getIndex());
//            String html = Download.downloadAsString(c.getUrl());
//            if (org.jsoup.helper.StringUtil.isBlank(html)){
//                System.out.println("============= no content "+c.getIndex()+" "+c.getTitle()+" "+c.getUrl());
//                continue;
//            }
//            Document chap = Jsoup.parse(html);
//            String content = getContent(chap);
//            c.setContent(content);
//            System.out.println();
//        }
//        String target = "C:\\Users\\xh\\Desktop\\";
//        String name = "暗夜君王";
//        WriteUtil.WriteChapter2Book(chapters,target,name);

        System.out.println("========= done ===============");
    }

    static String getContent(Document d){
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

    static List<Chapter> getBookChapters(Document root) {
        List<Chapter> chapters = new ArrayList<Chapter>();
        Elements chaptersElements = root.getElementsByClass("L");
        Iterator<Element> iter = chaptersElements.iterator();
        int index = 1;
        while (iter.hasNext()) {
            Chapter c = new Chapter();
            Element chapterElement = null;
            Element e = iter.next();
            if (e.children().size() > 0) {
                chapterElement = e.child(0);
            }
            if (chapterElement == null) {
                continue;
            }
            c.setIndex(index);
            String url = root.baseUri() + chapterElement.attr("href");
            String title = chapterElement.text();
            title = handleTitle(title);
            c.setUrl(url);
            c.setTitle(title);
            chapters.add(c);
            index++;
        }
        return chapters;
    }

    static String handleTitle(String title) {

        if (title.indexOf(" ") >= 0) {
            return title.split(" ")[1];
        } else {
            String[] arr = StringUtil.String2StringArr(title);
            for (int i = arr.length - 2; i >= 0; i--) {
                if (numChars.contains(arr[i])) {
                    String result = title.substring(i + 1);
                    System.out.println("origin title is " + title + " and title is " + result);
                }
            }
            return title;
        }

    }




    static Chapter downloadChapter(Chapter chapter) {
        String url = chapter.getUrl();
        return chapter;
    }


}
