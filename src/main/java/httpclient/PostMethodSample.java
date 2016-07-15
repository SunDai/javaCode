package httpclient;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;

/**
 * Created by xh on 2016/3/28.
 */
public class PostMethodSample {

    public static void main(String[] args) throws UnsupportedEncodingException {
        HttpClient client = new HttpClient();
//        String str = "{'downloader/response_status_count/404': 10, 'spider_exceptions/DropItem': 20, 'log_count/INFO': 11, 'downloader/response_count': 150, 'downloader/response_bytes': 789866, 'finish_reason': 'finished', 'log_count/ERROR': 42, 'log_count/DEBUG': 485, 'scheduler/dequeued': 150, 'log_count/WARNING': 20, 'request_depth_max': 2, 'start_time': 1459206303L, 'siteId': '67', 'downloader/request_method_count/GET': 150, 'downloader/request_bytes': 81178, 'downloader/response_status_count/200': 139, 'response_received_count': 149, 'scheduler/enqueued/memory': 150, 'finish_time': 1459206381L, 'item_scraped_count': 108, 'scheduler/dequeued/memory': 150, 'scheduler/enqueued': 150, 'projectId': '2', 'downloader/request_count': 150, 'downloader/response_status_count/302': 1}";
//        String str = "{}";
//        String str = "{'projectId':'2','siteId':'109','finishTime':0}";
        String str = "{'group':'DEFAULT','name':'site:xinhua:2:3'}";
//        String str = "{'finish_time':1559206381}";
//        String str = "{\"spider_exceptions/DropItem\": 7, \"log_count/INFO\": 57, \"downloader/response_count\": 308, \"downloader/response_bytes\": 2483923, \"finish_reason\": \"finished\", \"log_count/ERROR\": 7, \"log_count/DEBUG\": 940, \"scheduler/dequeued\": 308, \"log_count/WARNING\": 7, \"request_depth_max\": 3, \"start_time\": 1459386242, \"siteId\": \"49\", \"downloader/request_method_count/GET\": 308, \"dupefilter/filtered\": 45, \"downloader/request_bytes\": 126100, \"downloader/response_status_count/200\": 308, \"response_received_count\": 308, \"scheduler/enqueued/memory\": 308, \"finish_time\": 1459386409, \"item_scraped_count\": 210, \"scheduler/dequeued/memory\": 308, \"scheduler/enqueued\": 308, \"projectId\": \"2\", \"downloader/request_count\": 308}";
        JSONObject jo = JSON.parseObject(str);

//        String str = "I am a biggest man in the space llalal";

        PostMethod method = new PostMethod("http://172.18.24.237:8081/scheduler/stopJob");
        NameValuePair[] data = {new NameValuePair("group","DEFAULT"),new NameValuePair("name","site:xinhua:1:0")};
//        StringRequestEntity entity = new StringRequestEntity(jo.toJSONString(),"application/json","utf-8");

        method.setRequestBody(data);

//        method.setRequestEntity(entity);
        int code = 0;
        try {
            code = client.executeMethod(method);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(code);
//        long time = 1459232466000l;
//    Timestamp timestamp = new Timestamp(time);
//    System.out.println(timestamp);
}
}
