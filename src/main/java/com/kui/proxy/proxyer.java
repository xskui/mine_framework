package com.kui.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * author: xingshukui.
 * date:2016/4/1.
 */
public class proxyer implements InvocationHandler {

    private Object o;

    public proxyer(Object o) {
        this.o = o;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        if (!(o instanceof proxyInter)){
            System.out.println("不能代理该对象");
        }else if(!((proxyImpl)o).ownMethod().equals("admin")){
            System.out.println("权限不足");
        }
        result = method.invoke(o,args);
        return result;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(o.getClass().getClassLoader(),o.getClass().getInterfaces(),this);
    }
}
