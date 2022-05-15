package Java基础Day01基本语法.基本语法;

public class six变量运算规则的两个特殊情况 {
    public static void main(String[]args)
    {
//     1.编码情况
     long l=123123;
     System.out.println(l);
//     编译失败：过大的整数
//     long l1=21314154125151;
       long l1=21314154125151l;
//     ****************
//     编译失败
//     float f1=12.3;
     float f1 =(float)12.3;
     System.out.println(f1);
//     2.编码情况2
     byte b=12;
//     byte b1=b+1; 编译失败
//     float f1 = b+12.3; 编译失败
     int i1=b+1;
     System.out.println(i1);
    }
}
