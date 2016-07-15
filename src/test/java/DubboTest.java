import com.xinhuanet.reviewer.service.RequestService;
import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.*;

/**
 * Created by xh on 2016/5/4.
 */
//@SpringApplicationConfiguration(CommonApplication.class)
//@RunWith(SpringJUnit4ClassRunner.class)
public class DubboTest {

    @Test
    public void consumerTest(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context-consumer.xml");
        RequestService requestService = context.getBean("requestService",RequestService.class);
        System.out.println("-------------start-----------------");
        List<Map<String,Object>> contest = new ArrayList<Map<String,Object>>();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id",30808082);
        map.put("title", "testTitlesdfsdfsdf");
        map.put("type", 3);
        map.put("keywords", "key,test,sss,mini,werjwkerwlekrj");
        map.put("last_edit_time", new Date(System.currentTimeMillis()));
        map.put("article_property","河北省");
        map.put("site_id",13);
        contest.add(map);
        String insertResult = requestService.batchSendReviewRequest(contest, "请求者23", "fromUsersss", "接收者32", "toUseqqqqr", "Please,reviewsd","172.18.88.77");
//        String insertResult  = requestService.sendRevieweRequest();
//        String updateResult = requestService.update(2690011,"测试修改title lalalla",new Date(System.currentTimeMillis()+1000000),"新七天加班");
        System.out.println(insertResult);
        System.out.println("-------------end-----------------");

    }
}
