package com.kui.common.cache.interceptor;

import net.sf.ehcache.Cache;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

import java.lang.reflect.Method;
import java.util.List;

/**
 * author: xingshukui.
 * date:2016/4/3.
 */
public class MethodCacheAfterAdvice implements AfterReturningAdvice,InitializingBean {

    private Cache cache;

    public void setCache(Cache cache) {
        this.cache = cache;
    }

    public MethodCacheAfterAdvice() {
        super();
    }

    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        String className = o1.getClass().getName();
        List list = cache.getKeys();
        for (int i = 0; i < list.size(); i++) {
            String cacheKey = String.valueOf(list.get(i));
            if (cacheKey.startsWith(className)){
                cache.remove(cacheKey);
                System.out.println("remove "+ cacheKey);
            }
        }
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("test");
        Assert.notNull(cache,"need a cache");
    }
}
