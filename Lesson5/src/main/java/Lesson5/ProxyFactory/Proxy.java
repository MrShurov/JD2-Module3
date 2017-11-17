package Lesson5.ProxyFactory;

import org.springframework.aop.framework.ProxyFactory;

public class Proxy {
    private static TransferService target;
    private static TransferService proxy;

    public static void init() {
        target = new TransferService();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.addAdvice(new Sniffer());
        proxyFactory.setTarget(target);
        proxy = (TransferService) proxyFactory.getProxy();
    }

    public static void main(String[] args) {
        init();
        process(new Data("Egor Shurov","123456789","123"));
        System.out.println("----- BACK DOOR -----");
        processProxy(new Data("Egor Sov","1256789","183"));
        processProxy(new Data("disable","12345","113"));

    }

    public static void process(Data data) {
        target.transfer(data);
    }

    public static void processProxy(Data data) {
        proxy.transfer(data);
    }
}
