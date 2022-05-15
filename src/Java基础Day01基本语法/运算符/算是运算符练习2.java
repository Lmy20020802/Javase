package Java基础Day01基本语法.运算符;

/*
Java基础Day04面向对象上.练习:随便给出一个整数打印显示它的个位数，十位数，百位数的值。
格式如下：
数字xxx的情况如下：
个位数：3
十位数：5
百位数：1
 */
public class 算是运算符练习2 {
    public static void main(String[]args)
    {
        int number=351;
        int b=number/100;
        int s=number%100/10;
        int g=number%10;
        System.out.println("百位数:"+b);
        System.out.println("十位数:"+s);
        System.out.println("个位数:"+g);
    }
}
