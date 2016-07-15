package crawler.importNew;

import crawler.Download;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Created by xh on 2016/5/10.
 */
public class ImportNewMain {
    public static void main(String[] args) throws IOException {
        String baseUrl = "http://www.importnew.com/all-posts/page/";
        List<Article> articles = new ArrayList<Article>();
        Set<String> urls = new HashSet<String>();
        for (int i = 1;i<=69;i++){
            String url = baseUrl+i;
            String page = Download.downloadAsString(url);
            Document root = Jsoup.parse(page);
            Elements chaptersElements = root.getElementsByClass("meta-title");
            Iterator<Element> iterator = chaptersElements.iterator();
            while (iterator.hasNext()){
                Element  e = iterator.next();
                Article article = new Article();
                article.setUrl(e.attr("href"));
                article.setTitle(e.text());
                if (!urls.contains(article.getUrl())){
                    articles.add(article);
                    urls.add(article.getUrl());
                }

            }
        }
        Collections.sort(articles, new Comparator<Article>() {
            @Override
            public int compare(Article o1, Article o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        FileWriter writer = new FileWriter("C:\\Users\\xh\\Desktop\\ImportNew.txt");
        for (Article article:articles){
//            String title = new String(article.getTitle().getBytes(),"utf-8");
            writer.write(article.getTitle()+"\n");
            writer.write(article.getUrl()+"\n");
        }
        writer.flush();
        writer.close();
    }
}
