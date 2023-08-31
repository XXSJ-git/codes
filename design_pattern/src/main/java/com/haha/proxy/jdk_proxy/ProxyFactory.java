package com.haha.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description: 代理对象的工厂类
 *              ProxyFactory并不是代理模式中所说的代理类，它只是一个工厂类，而该工厂类提供了一个获取代理对象的方法。
 * @ClassName ProxyFactory.java
 * @createTime 2023年08月11日 20:58
 */
public class ProxyFactory {
    //声明目标对象，目标对象就是房东类对象
    private Landlord landlord = new Landlord();

    //获取代理对象的方法
    public RentHouse getProxyObject(){
        //返回代理对象
        /*
         * Proxy类中的newProxyInstance方法所需要的三个参数：
         *      ClassLoader loader：实例化一个对象，必然会调用类的构造器，运行第一次调用构造器，必定导致类的加载，而加载类的时候，
         *                              就是jvm拿着classloader去加载类的字节码的，把字节码加载到内存中，才能进一步实例化对象
                                    简单来说：只要实例化的对象，一定要加载类的字节码，加载字节码就一定要类的加载器。
         *      Class<?>[] interfaces：实例化某一个类的对象，那是哪个类呢？这个类是在内存中，由动态代理生成的，这个对象会自动实现参数2的指定接口，
         *                                  生成的对象，必定能转成指定的接口类型。拥有接口中的方法
         *      InvocationHandler h：每次对动态代理对象方法的调用，都是一个假对象，虽然实现了接口方法，但没有任何内容，
         *                          所以，调用方法会进入第三个参数的invoke方法中，第三个参数，是interfacehadle，通过类实现这个接口重写invoke方法
         */
        RentHouse rentAHouse = (RentHouse) Proxy.newProxyInstance(
                landlord.getClass().getClassLoader(),
                landlord.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * @param proxy 代理对象
                     * @param method 调用的接口方法
                     * @param args 调用的接口方法的参数
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        /**
                         * 我们通过代理对象调用sell方法时是没有返回值的，所以此时invoke方法的返回值就是一个null。如果通过代理对象调用sell方法时是有返回值的，
                         *  那么该返回值就是由invoke方法返回的具体的值。
                         */
                        System.out.println("中介收取一定的服务费用（JDK动态代理）");
                        //在invoke方法中通过反射调用目标对象的方法
                        // 执行目标对象（即火车站类对象）的方法
                        Object obj = method.invoke(landlord, args);
                        return obj;
                    }
                }
        );
        return rentAHouse;
    }

}
