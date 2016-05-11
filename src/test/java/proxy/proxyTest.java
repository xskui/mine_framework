package proxy;

import com.kui.proxy.proxyImpl;
import com.kui.proxy.proxyInter;
import com.kui.proxy.proxyer;

/**
 * author: xingshukui.
 * date:2016/4/1.
 */
public class proxyTest {

    public static void main(String[] args) {
        proxyImpl proxy = new proxyImpl();
        proxyer proxyer = new proxyer(proxy);
        proxyInter inter = (proxyInter)proxyer.getProxyInstance();
        inter.method_1();
        inter.method_2();
    }
}
