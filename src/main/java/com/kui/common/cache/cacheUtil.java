package com.kui.common.cache;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;

/**
 * author: xingshukui.
 * date:2016/4/2.
 */
public class cacheUtil {
    private static final CacheManager cacheManager = CacheManager.create();
    private Ehcache cache;
    //private Ehcache ehcache;

    public cacheUtil() {
        //this.cache = cacheManager.getCache("mineCache");
        this.cache = cacheManager.getEhcache("mineCache");
    }

    /**
     * 通过名称取缓存数据
     * @param cacheKey
     * @return
     */
    public Object getCacheElement(String cacheKey){
        Element element = cache.get(cacheKey);
        if (element==null)
            return null;
        return element.getObjectValue();
    }

    public void addToCache(String cacheKey,Object result){
        Element element = new Element(cacheKey,result);
        cache.put(element);
    }

    public Ehcache getCache() {
        return cache;
    }

    public void setCache(Ehcache cache) {
        this.cache = cache;
    }
}
