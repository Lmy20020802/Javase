package Java基础Day06面向对象下.代码块;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-13 15:03
 * @Description:
 **/
/*
 * 对属性可以赋值的位置：
 * ①默认初始化
 * ②显式初始化/⑤在代码块中赋值
 * ③构造器中初始化
 * ④有了对象以后，可以通过"对象.属性"或"对象.方法"的方式，进行赋值
 *
 *
 * 执行的先后顺序：① - ② / ⑤ - ③ - ④
 */


public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.orderId);
    }
}

class Order{


    int orderId = 3;
    {
        orderId = 4;
    }


}