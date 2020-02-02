package DesignPattern.proxy;

public class User {


    public static void main(String[] args) {
        Target target = new Target();

        TargetInterface proxy = (TargetInterface)ProxyFactory.getProxy(target);

        proxy.method1();
        System.out.println("-------------------------");
        proxy.method2();
        System.out.println("-------------------------");
        int i = proxy.method3(100);
        System.out.println(i);

    }




}
