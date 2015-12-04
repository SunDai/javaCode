package crawler;

import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by xh on 2015/12/3.
 */
public class Download {
    public static String downloadAsString(String url){
        String result = "";
        HttpClient client = new HttpClient();
        GetMethod getMethod = new GetMethod(url);
        getMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
                new DefaultHttpMethodRetryHandler(3, false));
        try {
           int status = client.executeMethod(getMethod);
           if (status != HttpStatus.SC_OK){
               System.err.println("Method failed: " + getMethod.getStatusLine());
           }else {
               String charset = getMethod.getResponseCharSet();
//               System.out.println(charset);
               byte[] body = getMethod.getResponseBody();
               String defaultBody = new String(body,charset);
//               charset = getResponseBodyCharset(defaultBody,url);
//               result = new String(body,charset);
               result = new String(body,"gbk");
           }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(result);
        return result;
    }

    private static String getResponseBodyCharset(String html,String url){
        String bodyCharset ="";
        Document root =  Jsoup.parse(html, url);
        Element contentType = root.select("meta[http-equiv=Content-Type]").first();
        bodyCharset = contentType.attr("content").split(";")[1].split("=")[1];

        return bodyCharset;
    }
}
