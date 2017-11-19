package cn.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 */
public class JdkProxy {
    public static void main(String[] args) {
        //目标对象创建
        final UserImpl dao=new UserImpl();
        //通过Proxy的静态方法构建出一个接口的代理对象
    /*
     public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)
        throws IllegalArgumentException
     */
       Iuser udao= (Iuser) Proxy.newProxyInstance(dao.getClass().getClassLoader(),dao.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //前置增强
                System.out.println("前置增强");
                //动态代理的方法执行,并返回结构
                Object result = method.invoke(dao, args);
                //后置增强
                System.out.println("后置增强");
                return result;
            }
        });
       udao.add();
       udao.delte();

    }

}
