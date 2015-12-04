import java.util.HashMap;
import java.util.Map;

/**
 * Created by xh on 2015/11/27.
 */
public class MapSequence {


    public static void main(String[] args){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("1","");
        map.put("aaa","");
        map.put("中文","");
        map.put("啦啦啦啦","");
        map.put("ssdf你妹","");
        map.put("ssdf1111","");
        for (String key:map.keySet()){
            System.out.println(key);
        }
    }

}
