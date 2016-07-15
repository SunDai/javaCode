package leetcode;

import com.xinhuanet.reviewer.service.RequestService;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by xh on 2016/4/25.
 */
public class LengthOfLongestSubstring3 {
    public int lengthOfLongestSubstring(String s) {
        int reuslt = 0;
        char[] arr = s.toCharArray();
        Set<Character> set = new HashSet<Character>();
        int beginIndex = 0;
        for (beginIndex = 0;beginIndex<arr.length;beginIndex++){
            int ss = 0;
            set.clear();
            for (int i = beginIndex;i<arr.length;i++ ){

                if ((arr.length - beginIndex)<=reuslt){
                    break;
                }
                if (!set.contains(arr[i])){
                    set.add(arr[i]);
                    ss++;
                    if (reuslt<ss){
                        reuslt = ss;
                    }
                }else {
                    break;
                }
            }
        }

        return reuslt;
    }
}
