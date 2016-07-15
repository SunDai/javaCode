import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xh on 2016/3/29.
 */
public class Test {
    public static void main(String[] args){
//        Integer i = 5;
//        System.out.println(i.getClass().getName());
//        String  str = "downloader/exception_type_count/twisted.internet.error.DNSLookupError";
//        System.out.println(str.replaceAll("/","_").replaceAll("\\.","_"));
        Date date = new Date(1459939031000l);
//        Date date = new Date();
//        date.getTime();


//        date
        System.out.println(date);
        System.out.println(System.currentTimeMillis());

        System.out.println(Long.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);


        Map<String,Object> map = new HashMap<String, Object>();
        map.put("int",8);
        map.put("str","lllll");
        System.out.println(map.toString());

    }
}
