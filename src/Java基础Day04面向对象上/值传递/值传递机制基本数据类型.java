package Java基础Day04面向对象上.值传递;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-01 22:50
 * @Description:
 **/
public class 值传递机制基本数据类型 {
    public static void main(String[]args)
    {
        //交换两个变量的值
        int m=10;
        int n=20;
        System.out.println("m="+m+",n="+n);
//        int temp=n;
//        n=m;
//        m=temp;
        值传递机制基本数据类型 test=new 值传递机制基本数据类型();
        test.swap(m,n);
        System.out.println("m="+m+",n="+n);
    }
    public void swap(int m,int n)
    {
        int temp=m;
        m=n;
        n=temp;
    }
}
