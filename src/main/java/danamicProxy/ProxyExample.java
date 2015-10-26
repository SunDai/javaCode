package danamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by xh on 2015/10/19.
 *
 * 代理类一定要持有对象的，其实这样还是生成了一个对象，也看不出有多好
 *
 */
public class ProxyExample implements InvocationHandler {

    private Object target;

    public Object bind(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object o = null;
        System.out.println(" start !!!!!!!");
        o = method.invoke(target,args);
        System.out.println(" finish");
        return o;
    }
}
