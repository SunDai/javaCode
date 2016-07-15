package crawler.util;

/**
 * Created by xh on 2015/12/3.
 */
public class StringUtil {
    public static String[] String2StringArr(String str){
        char[] chars = str.toCharArray();
        String[] arr = new String[str.length()];
        for (int i = 0;i<chars.length;i++){
            String s = String.valueOf(chars[i]);
            arr[i] = s;
        }
        return arr;
    }

//    public static String changeIntToChineseNum(int i){
//        String result = "";
//        return result;
//    }
}
