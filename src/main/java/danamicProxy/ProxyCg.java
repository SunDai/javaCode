package danamicProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by xh on 2015/10/19.
 */
public class ProxyCg implements MethodInterceptor {

    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(" cglib start ");
        methodProxy.invokeSuper(o, objects);//因为你设置了 super class，然后你调用的也是super？如果不调用super而是调用 invoke为啥会悲剧？
        System.out.println(" cglib stop");
        return o;
    }
}
