package Java基础Day05面向对象中.测试4种不同的权限修饰;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-06 10:39
 * @Description:
 **/
public class OrderTest {
    public static void main(String[]args)
    {
        Order order=new Order();
        order.orderDefault=1;
        order.orderProtected=2;
        order.orderPublic=3;
        order.methodDefault();
        order.methodProtected();
        order.methodPublic();

        //同一个包中的其他类，不可以调用Order类中私有的属性、方法
//        order.orderPrivate=4
//        order.methodPrivate
    }
}
