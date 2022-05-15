package Java基础Day04面向对象上.重载;

import java.net.PortUnreachableException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-01 19:19
 * @Description:
 **/
public class 重载的练习 {
    public static void main(String[]args) {
        重载的练习 test=new 重载的练习();
        test.mol(2);
        test.mol(2,4);
        test.mol("hello world");
        System.out.println(test.max(5,4));
        System.out.println( test.max(5.5,4,5));
        System.out.println(test.max(5.5,5));

    }
//    2.编写程序，定义三个重载方法并调用。方法名为mOL。
//    三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别
//    执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
//    在主类的main ()方法中分别用参数区别调用三个方法。


    //如下的三个方法构成重载
    public void mol(int i){
        System.out.println(i*i);
    }
    public void mol(int i,int j)
    {
        System.out.println(i*j);
    }
    public void mol(String str)
    {
        System.out.println(str);
    }

//    3.定义三个重载方法max()，第一个方法求两个int值中的最大值，第二个方
//    法求两个double值中的最大值，第三个方法求三个double值中的最大值，
//    并分别调用三个方法。
//    如下的三个方法构成重载

    public int max(int a,int b)
    {
     return (a>b)?a:b;
    }
    public double max(double a,double b)
    {
        return (a>b)?a:b;
    }
    public double max(double a,double b,double c)
    {
        double max=(a>b)?a:b;
        return (max>c)?max:c;
    }
}
