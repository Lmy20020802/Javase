package Java基础Day01基本语法.运算符;
/*
运算符之二：赋值运算符
=  +=  -=  *=  /=  %=

*/
public class 赋值运算符 {
    public static void main(String[]args)
    {
//        赋值符号：=
        int i1=10;
        int j1=10;
        int i2,j2;
//        连续赋值
        i2=j2=10;
        int i3=10,j3=20;
        System.out.println(i1);
        System.out.println(j1);
        System.out.println(i2);
        System.out.println(j2);
        System.out.println(i3);
        System.out.println(j3);

//        *********************
        int num1=10;
        num1+=20;//num1=num1+20
        System.out.println(num1);//30

        int num2=12;
        num2%=5;  //num2=num2%5
        System.out.println(num2);

        int num3=10;
        num3-=2; //num3=num3-2
        System.out.println(num3);

        short s1=10;
//        s1=s1+2 编译失败
        s1+=2;
        System.out.println(s1);

//        开发中,如果希望变量实现+2的操作,有几种方式
        int num=10;
//        方法一
        num=num+2;
        System.out.println(num);
//        方法二
        num+=2;
        System.out.println(num);
//        开发中,如果希望变量实现+1的操作,有几种方式
        int num4=10;
//        方法一
        num4=num4+1;
        System.out.println(num4);
//        方法二
        num4+=1;
        System.out.println(num4);
//        方法三
        num4=num4++;
        System.out.println(num4);
    }
}
