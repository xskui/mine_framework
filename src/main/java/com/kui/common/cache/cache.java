package com.kui.common.cache;

/**
 * author: xingshukui.
 * date:2016/4/2.
 */
public class cache {
    private cache() {}

    /**
     * �༶�ڲ��࣬Ҳ���Ǿ�̬�ĳ�Աʽ�ڲ��࣬���ڲ����ʵ�����ⲿ��ļ���û�а󶨹�ϵ
     * ��ֻ�б����õ�ʱ�Żᱻ���أ��Ӷ�ʵ���ӳټ���
     */
    private static class cacheHodler{
        private static final cache Instance = new cache();
    }

    public static cache getCacheInstance(){
        return cacheHodler.Instance;
    }
}
