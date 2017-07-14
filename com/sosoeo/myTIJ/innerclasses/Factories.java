package com.sosoeo.myTIJ.innerclasses;

/**
 * Created by sky on 17-7-11.
 */

interface Service{
    void method1();
    void method2();
}

interface ServiceFactory{
    Service getService();
}
class implement1 implements Service{
    private implement1(){}

    @Override
    public void method1() {
        System.out.println("implement1 method1");
    }

    @Override
    public void method2() {
        System.out.println("implement1 method2");
    }
    public static ServiceFactory factory =
            new ServiceFactory() {
                @Override
                public Service getService() {
                    return new implement1();
                }
            };
}

class implement2 implements Service{
    private implement2(){}

    @Override
    public void method1() {
        System.out.println("implement2 method1");
    }

    @Override
    public void method2() {
        System.out.println("implement2 methond2");
    }

    public static ServiceFactory factory =
            new ServiceFactory() {
                @Override
                public Service getService() {
                    return new implement2();
                }
            };
}
public class Factories {
    public static void serviceConsumer(ServiceFactory fact) {
        Service t = fact.getService();
        t.method1();
        t.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(implement1.factory);
        serviceConsumer(implement2.factory);
    }
}

