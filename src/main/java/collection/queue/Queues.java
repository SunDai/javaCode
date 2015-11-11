package collection.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.DelayQueue;

/**
 * Created by xh on 2015/11/9.
 */
public class Queues {
    Queue<Object> arrayDeque = new ArrayDeque<Object>() ;
    Queue<Object> priorityQueue = new PriorityQueue<Object>();
    Queue<Object> delayQueue = new DelayQueue();
}
