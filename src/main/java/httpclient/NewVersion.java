//package httpclient;
//
//import org.apache.http.HttpEntity;
//import org.apache.http.HttpResponse;
//import org.apache.http.client.ClientProtocolException;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.ResponseHandler;
//import org.apache.http.client.methods.CloseableHttpResponse;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.entity.ContentType;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.util.EntityUtils;
//
//import java.io.IOException;
//import java.nio.charset.Charset;
//
///**
// * Created by xh on 2015/12/9.
// *
// * demo for new version httpclient
// *
// *
// */
//public class NewVersion {
//    public static void main(String[] args) {
//        CloseableHttpClient httpClient = HttpClients.createDefault();
//        HttpGet get = new HttpGet("www.baidu.com");
//        try {
//            CloseableHttpResponse response = httpClient.execute(get);
//            int code = response.getStatusLine().getStatusCode();
//            System.out.println("code is "+code);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
