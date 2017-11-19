package cn.proxy;

public class UserImpl implements Iuser {
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void delte() {
        System.out.println("delte");
    }
}
