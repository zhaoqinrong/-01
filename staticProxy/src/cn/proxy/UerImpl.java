package cn.proxy;

/**
 * 目标对象
 */
public class UerImpl implements Iuser{
    @Override
    public void adduser() {
        System.out.println("add");
    }
}
