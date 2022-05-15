package Java基础Day05面向对象中.测试4种不同的权限修饰;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-06 10:36
 * @Description:
 **/
/*
 * 体会4种不同的权限修饰
 *
 *
 */
public class Order {
    private int orderPrivate;
    int orderDefault;
    protected int orderProtected;
    public int  orderPublic;
    private void methodPrivate(){
        orderPrivate=1;
        orderDefault=2;
        orderProtected=3;
        orderPublic=4;
    }
    void methodDefault(){
        orderPrivate=1;
        orderDefault=2;
        orderProtected=3;
        orderPublic=4;
    }
    protected void  methodProtected(){
        orderPrivate=1;
        orderDefault=2;
        orderProtected=3;
        orderPublic=4;
    }
    public void methodPublic(){
        orderPrivate=1;
        orderDefault=2;
        orderProtected=3;
        orderPublic=4;
    }
}
