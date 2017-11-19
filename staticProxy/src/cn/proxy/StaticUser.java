package cn.proxy;

/**
 * 代理对象
 */
public class StaticUser  implements Iuser{
    private UerImpl uer;

    public UerImpl getUer() {
        return uer;
    }

    public void setUer(UerImpl uer) {
        this.uer = uer;
    }

    @Override
    public void adduser() {
        System.out.println("增强");
        uer.adduser();
    }
}
