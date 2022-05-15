package Java基础Day01基本语法.运算符;
/*
运算符之三：比较运算符
==  !=  >  <  >= <=  instanceof

结论：
1.比较运算符的结果是boolean类型
2.区分 ==  和  =
*/
public class 比较运算符 {
    public static void main(String[]args)
    {
        int i=10;
        int j=20;
        System.out.println(i==j);//false
        System.out.println(i=j);//20

        boolean b1=true;
        boolean b2=false;
        System.out.println(b2==b1);
        System.out.println(b2=b1);


        boolean b3=false;
        if (b3==true)
            System.out.println("真");
        else
            System.out.println("假");
    }
}
