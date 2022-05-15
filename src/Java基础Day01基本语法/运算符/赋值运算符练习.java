package Java基础Day01基本语法.运算符;
public class 赋值运算符练习 {
    public static void main(String[]args)
    {
        short s = 3;
//      s = s+2;  编译不通过
        s += 2;

        int i = 1;
        i *= 0.1;
        System.out.println(i);//0
        i++;
        System.out.println(i);//1

        int m = 2;
        int n = 3;
        n *= m++;
        System.out.println("m=" + m); //3
        System.out.println("n=" + n); //6

        int n1 = 10;
        n1 += (n1++) + (++n1);  //10+11+11=32
        System.out.println(n1);
    }
}
