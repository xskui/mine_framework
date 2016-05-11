package com.kui.common.cache.interceptor;

import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.io.Serializable;

/**
 * author: xingshukui.
 * date:2016/4/2.
 */
@Component
public class methodCacheInterceptor implements MethodInterceptor,InitializingBean {

    private Cache cache;

    public void setCache(Cache cache) {
        this.cache = cache;
    }

    public methodCacheInterceptor() {
        super();
    }

    /**
     * ����ָ�����������һ����Ƿ���ڣ����ڵĻ����ظ�ֵ�������ڵĻ���ѯ���ݿ⣬���ؽ����������ѯ����浽cache
     * @param methodInvocation
     * @return
     * @throws Throwable
     */
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        String targetName = methodInvocation.getThis().getClass().getName();
        String methodName = methodInvocation.getMethod().getName();
        Object[] agrs = methodInvocation.getArguments();
        Object result;

        String cacheKey = getCacheKey(targetName,methodName,agrs);
        Element element = cache.get(cacheKey);

        if (element == null){
            result = methodInvocation.proceed();
            element = new Element(cacheKey, (Serializable)result);
            cache.put(element);
        }
        return element.getObjectValue();
    }

    /**
     * ��ȡcache key�ķ���
     * @param targetName
     * @param methodName
     * @param args
     * @return
     */
    private String getCacheKey(String targetName,String methodName,Object[] args){

        StringBuffer sb = new StringBuffer();
        sb.append(targetName).append(".").append(methodName);
        if (args!=null&&args.length!=0){
            for (int i = 0; i < args.length; i++) {
                sb.append(".").append(args[i]);
            }
        }
        return sb.toString();
    }

    /**
     * ���cache�Ƿ�Ϊ��
     * @throws Exception
     */
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(cache,"need a cache");
    }
}
