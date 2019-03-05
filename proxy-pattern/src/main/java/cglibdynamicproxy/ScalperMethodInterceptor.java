package cglibdynamicproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ScalperMethodInterceptor implements MethodInterceptor {

    private Object target;

    /**
     * 创建代理对象
     * @param target
     * @return
     */
    public Object getInstance(Object target){
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        // 回掉方法
        enhancer.setCallback(this);
        // 创建代理对象
        return enhancer.create();
    }

    /**
     * 回调方法，增加额外的功能
      */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("我是黄牛B");
        methodProxy.invokeSuper(o, objects);
        System.out.println("我是黄牛B, 给你票");
        return null;
    }
}
