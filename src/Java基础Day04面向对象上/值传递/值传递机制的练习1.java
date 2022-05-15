package Java基础Day04面向对象上.值传递;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-02 09:26
 * @Description:
 **/
public class 值传递机制的练习1 {
    public static void main(String[]args)
    {
        int a=10;
        int b=10;
        值传递机制的练习1 test=new 值传递机制的练习1();
        test.method(a,b);
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    public void method(int a,int b){
        a=a*10;
        b=b*20;
        System.out.println(a);
        System.out.println(b);
        System.exit(0);
    }
}
