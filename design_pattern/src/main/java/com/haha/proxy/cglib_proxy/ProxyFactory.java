package com.haha.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 鑫星世界
 * @version 1.0.0
 * @description:
 * 使用CGlibe步骤
 * 第一步，创建Enhancer类对象，该类有点类似于咱们JDK动态代理中的Proxy类。那么很明显，该类就是用来获取代理对象的。注意了，该类是属于CGLIB里面的，所以我们要导入相对应的包哟😁
 * 第二步，设置父类的字节码对象。为啥子要这样做呢？因为使用CGLIB生成的代理类是属于目标类的子类的，也就是说代理类是要继承自目标类的。
 * 第三步，设置回调函数。
 * @ClassName ProxyFactory.java
 * @createTime 2023年08月11日 22:13
 */
public class ProxyFactory implements MethodInterceptor {
    private Landlord landlord = new Landlord();
    /**
     *使用Enhancer需要注意
     * 指定父类（代理类的父类哟~）的字节码对象
     * 当我们通过代理对象调用方法时，其本质调用的是MethodInterceptor规范接口里面的intercept方法。在以上案例中，我们通过代理对象调用具体的sell方法时，实际上执行的就是intercept方法
     */
    public Landlord getProxyFactory(){
        //创建Enhancer
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(Landlord.class);
        //调用回调函数  回调MethodInterceptor接口，但是当前类是InvocationHandler接口的实现类，所以可以直接写this。
        enhancer.setCallback(this);
        //创建代理对象
        Landlord landlord = (Landlord) enhancer.create();
        return landlord;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("中介收取一定的服务费用（CGLIB动态代理）");
        //通过反射调用目标对象方法
        Object invoke = method.invoke(landlord, args);
        return invoke;
    }
}
