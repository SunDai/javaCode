/**
 * Created by xh on 2015/10/26.
 */
package collection.list;
/*
* 这个包用来整理集合类的相关知识
*
*
* */

//ArrayList 和 LinkeList
//        最上层的接口都是 List
//        但是父类不同 A 的父类是 AbstractList ，  L的父类是AbstractSequencialList 光从这点上看，LinkedList就是对顺序是很强调的
//
//        ArrayList 里面是数据默认容量是10，有一个显示数量的值 int size，所以size()方法是没有损耗的
//        arrayList add的时候要先检查容量，不够的话进行扩容，然后再把这个元素 add进去，所说的性能损耗其实就是在这一点上面
//
//        LinkedList 本身的设计是一个链表，那肯定就没有默认容量这个鬼了，但是还是有 int size 这个值的，所以size()函数你可以放心大胆的用
//        LinkedList 有内部类 Node<E> 用来包裹添加进来的对象 定义了first作为头，last作为尾巴
//        Node类里面没啥别的东西，一个当前对象，一个pre，一个next，还有一个构造器，构造器需要的参数是 pre current next，来生成一个Node
//        然后剩下的就是捣鼓前中后的过程 LinkedList 的性能消耗反而在get上面，因为需要一个一个倒腾到当前的index，但是能够快速的添加删除


//CopyOnWriteArrayList  实现了 RandomAccess 接口 这个接口是很屌哒
//
//public interface RandomAccess
//        List 实现所使用的标记接口，用来表明其支持快速（通常是固定时间）随机访问。此接口的主要目的是允许一般的算法更改其行为，从而在将其应用到随机或连续访问列表时能提供良好的性能。
//        将操作随机访问列表的最佳算法（如 ArrayList）应用到连续访问列表（如 LinkedList）时，可产生二次项的行为。如果将某个算法应用到连续访问列表，那么在应用可能提供较差性能的算法前，鼓励使用一般的列表算法检查给定列表是否为此接口的一个 instanceof，如果需要保证可接受的性能，还可以更改其行为。
//
//
//        这个CopyOnWriteArrayList 比较屌，set的时候是线程安全的，因为人家加锁了，ReentrantLock  在set的时候，先复制一个新的原数组，然后把新数组的index的位置替换成新元素，这个会不会开销有点大啊
//
//        然后add也是一个尿性，这特么的，直接复制一个length+1的新数组，然后把末尾的空加上去，这特么的，简直是不太能忍，基于什么原因，要这么设计啊？难道copy一个新数组真的开销很小么？
//
//        当遍历的量很大，而可变的操作量很少时，这个还是值得称赞的   By the way，这个在修改的时候都加了锁，肯定是线程安全的


//Vector
//        因为Stack 继承了 Vector，所以我们先说Vector。Vector里面保存元素是用的数组，默认容量是10，而且其他构造函数可以定义初始容量和每次快到达容量后，容量的增加值，这个有点人性化啊。基本上所有的方法都加了synchronized 关键字，这个太特么无脑了，剩下的没啥有意思的，也就是图个线程安全，但是都这么粗粒度的加锁，估计性能高不了

//Stack
//
//        Stack继承了 Vector ，所以首先，他的存取操作肯定是线程安全的。而且内部的数据结构应该也是数组。
//        push的时候在尾部添加元素，pop的时候也从尾部减少元素，LIFO(last in first out),其他的没啥了


//Collections.synchronizedList(arrayList);
//        这个方法返回的list类型要看你传进去的list是否实现了 RandomAccess 接口，如果实现了，那么返回的是一个SynchronizedRandomAccessList,否则返回SynchronizedList
//        就是看你传进去是否支持快速随机访问喽。
//        SynchronizedRandomAccessList继承了SynchronizedList，SynchronizedList继承了SynchronizedCollection，SynchronizedCollection里面的方法基本上都是加了synchronized关键字的，SynchronizedCollection 里面有一个对象用来加锁，获得了这个对象，才能对元素进行修改



