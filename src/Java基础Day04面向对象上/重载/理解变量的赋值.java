package Java基础Day04面向对象上.重载;
/*
 *
 * 关于变量的赋值：
 *
 *  如果变量是基本数据类型，此时赋值的是变量所保存的数据值。
 *  如果变量是引用数据类型，此时赋值的是变量所保存的数据的地址值。
 *
 */
/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-01 20:32
 * @Description:
 **/
public class 理解变量的赋值 {
    public static void main(String[]args)
    {
        System.out.println("**********基本数据类型**********");
        int m=10;
        int n=m;
        System.out.println("m="+m+",n="+n);
        n=20;
        System.out.println("m="+m+",n"+n);

        System.out.println("**********引用数据类型**********");
        Order o1=new Order();
        o1.orderId=1001;
        Order o2=o1;// 赋值以后 o1和o2地址值相同 指向同一个
        System.out.println(o1.orderId);
        System.out.println(o2.orderId);
        o2.orderId=1002;
        System.out.println(o1.orderId);
        System.out.println(o2.orderId);
    }
}
class  Order{
    int orderId;
}