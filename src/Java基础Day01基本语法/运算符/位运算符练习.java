package Java基础Day01基本语法.运算符;

public class 位运算符练习 {
    public static void main(String[]args)
    {
        //Java基础Day04面向对象上.练习:交换两个变量的值
        int num1=10;
        int num2=20;
        System.out.println("num1="+num1+",num2="+num2);
        //方法一 定义临时变量
//        int temp;
//        temp=num1;
//        num1=num2;
//        num2=temp;
//        System.out.println("num1="+num1+",num2="+num2);

        //方法二  好处不用定义临时变量
        //弊端 ①相加操作可能超出存储范围　②有局限性：
//        num1=num1+num2;
//        num2=num1-num2;
//        num1=num1-num2;
//        System.out.println("num1="+num1+",num2="+num2);
        //方法三: 使用位运算符
        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        System.out.println("num1="+num1+",num2="+num2);
    }
}
