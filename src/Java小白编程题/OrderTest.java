package Java小白编程题;

import Java基础Day05面向对象中.测试4种不同的权限修饰.Order;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-06 10:46
 * @Description:
 **/
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderPublic = 1;
        order.methodPublic();

        /*
        不同包下的普通类(非子类)要使用Order类不可以调用声明为private、缺省、protected权限的属性、方法
        orderPrivate=1;
        orderDefault=2;
        orderProtected=3;
        order.methodPrivate
        order.methodDefault();
        order.methodProtected();
         */
    }
}
