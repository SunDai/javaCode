package collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * Created by xh on 2015/11/9.
 */
public class Sets {
    public static Set<Object> hashSet = new HashSet<Object>();
    public static Set<Object> linkedHashSet = new LinkedHashSet<Object>();
    public static Set<Object> treeSet = new TreeSet<Object>();
    public static Set<Object> concurrentSkipListSet = new ConcurrentSkipListSet<Object>();
    public static void main(String[] args){

    }
}
