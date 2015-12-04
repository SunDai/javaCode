package httpclient;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

import java.io.IOException;

/**
 * Created by xh on 2015/11/30.
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        HttpClient client = new HttpClient();
        GetMethod method = new GetMethod("http://opinion.people.com.cn/n/2012/0717/c1003-18532518.html");
        method.setFollowRedirects(false);
//        method.getParams().setParameter("",);
//        HttpMethod method = new PostMethod("http://opinion.people.com.cn/n/2012/0717/c1003-18532518.html");
        method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
                new DefaultHttpMethodRetryHandler(3, false));
        int code = client.executeMethod(method);
        System.out.println("result code is " + code);
        String responseBody = method.getResponseBodyAsString();
        System.out.println("response body is " + responseBody);
        Header[] headers = method.getResponseHeaders();
        for (int i = 0;i<headers.length;i++){
            System.out.println(headers[i].getName()+"========"+headers[i].getValue());
        }
        method.releaseConnection();
    }
}
