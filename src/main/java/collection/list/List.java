package collection.list;


import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by xh on 2015/10/26.
 */
public class List {
    ArrayList<Object> arrayList = new ArrayList<Object>();
    LinkedList<Object> linkedList = new LinkedList<Object>();
    CopyOnWriteArrayList<Object> copyOnWriteArrayList = new CopyOnWriteArrayList<Object>();
    Vector<Object> vector = new Vector<Object>();
    Stack<Object> stack = new Stack<Object>();
    java.util.List<Object> synchronizedList = Collections.synchronizedList(arrayList);

}
