package jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ScalperInvocationHandler implements InvocationHandler{
    private Object target;

    public ScalperInvocationHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Begin，我是黄牛A，你向我买票");
        Object result = method.invoke(target, args);
        System.out.println("End,我是黄牛A，这是你要买的票");
        return result;
    }

    /**
     * 生成代理对象
     * @return
     */
    public Object getProxy() {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        return Proxy.newProxyInstance(loader, interfaces, this);
    }
}
