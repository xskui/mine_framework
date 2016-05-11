package com.kui.common.cache;

/**
 * author: xingshukui.
 * date:2016/4/2.
 */
public class cache {
    private cache() {}

    /**
     * 类级内部类，也就是静态的成员式内部类，该内部类的实例与外部类的加载没有绑定关系
     * 它只有被调用到时才会被加载，从而实现延迟加载
     */
    private static class cacheHodler{
        private static final cache Instance = new cache();
    }

    public static cache getCacheInstance(){
        return cacheHodler.Instance;
    }
}
