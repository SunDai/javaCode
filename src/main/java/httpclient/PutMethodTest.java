package httpclient;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PutMethod;

import java.io.IOException;

/**
 * Created by xh on 2016/3/9.
 */
public class PutMethodTest {
    public static void main(String[] args){
        HttpClient client = new HttpClient();
        PutMethod method = new PutMethod("http://localhost:8081/scheduler/reload");
        int code = 0;
        try {
            code = client.executeMethod(method);
            String  a = method.getResponseBodyAsString();
            System.out.println("a is "+a);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("code is "+code);
    }
}
