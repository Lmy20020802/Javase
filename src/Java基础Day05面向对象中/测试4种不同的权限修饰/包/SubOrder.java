package Java基础Day05面向对象中.测试4种不同的权限修饰.包;

import Java基础Day05面向对象中.测试4种不同的权限修饰.Order;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-06 10:43
 * @Description:
 **/
public class SubOrder extends Order {
    public void method() {
        orderProtected = 1;
        orderPublic = 2;
        methodProtected();
        methodPublic();
        //在不同包的子类中，不能调用Order类中声明为private和缺省权限的属性,方法
//        orderPrivate = 1;
//        orderDefault = 2;
//        order.methodDefault();
//        order.methodPrivate
    }
}
