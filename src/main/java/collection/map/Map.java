package collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * Created by xh on 2015/11/3.
 */
public class Map {
    java.util.Map<Object,Object> hashMap = new HashMap<Object, Object>();
    java.util.Map<Object,Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    java.util.Map<Object,Object> treeMap = new TreeMap<Object, Object>();
    java.util.Map<Object,Object> concurrentHashMap = new ConcurrentHashMap<Object, Object>();
    java.util.Map<Object,Object> concurrentSkipListMap = new ConcurrentSkipListMap<Object, Object>();

}
