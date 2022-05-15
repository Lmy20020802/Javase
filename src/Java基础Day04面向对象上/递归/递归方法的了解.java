package Java基础Day04面向对象上.递归;
/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-02 15:25
 * @Description:
 **/
/*
 * 递归方法的使用（了解）
 * 1.递归方法：一个方法体内调用它自身。
 * 2. 方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执行无须循环控制。
 * 递归一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死循环。

 *
 *
 *
 *
 */
public class 递归方法的了解 {
    public static void main(String[]args)
    {
        // 例1：计算1-100之间所有自然数的和
        // 方式一：
//        int sum=0;
//        for (int i=1;i<=100;i++)
//        {
//            sum+=i;
//        }
//        System.out.println(sum);

        //方式二
        递归方法的了解 test=new 递归方法的了解();
        int sum=test.getSum(100);
        System.out.println(sum);
        int sum1=test.getSum1(5);
        System.out.println(sum1);
        int value=test.f(10);
        System.out.println(value);
//        int value1=test.f1(4);
//        System.out.println(value1);
        int a=1;
        int b=1;
        int c=0;
        System.out.print(a+"\t"+b+"\t");
        for (int i=3;i<=20;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+"\t");
        }
    }
    // 例1：计算1-n之间所有自然数的和
    public int getSum(int n){
        if(n==1){
            return 1;
        }else {
            return n+getSum(n-1);
        }
    }
    // 例2：计算1-n之间所有自然数的乘积
    public int getSum1(int n)
    {
        if (n==1){
            return 1;
        }else {
            return n*getSum1(n-1);
        }
    }

//    例3：已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),其中n是大于0
//    的整数，求f(10)的值。
    public  int f(int n){
        if(n==0)
        {
            return 1;
        }else if(n==1)
        {
            return 4;
        }else {
            return 2*f(n-1)+f(n-2);
        }
    }
//    输入一个数据n，计算斐波那契数列(Fibonacci)的第n个值
//    1 1 2 3 5 8 13 21 34 55
//    规律：一个数等于前两个数之和
//    要求：计算斐波那契数列(Fibonacci)的第n个值，并将整个数列打印出来

//    public int f1(int n)
//    {
//        System.out.println(n);
//        if (n==0)
//        {
//            return 1;
//        }else  if(n==1)
//        {
//            return 1;
//        }else {
//
//            return f1(n-2)+f1(n-1);
//        }
//    }


}
