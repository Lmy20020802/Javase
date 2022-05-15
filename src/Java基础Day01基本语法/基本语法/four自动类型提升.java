package Java基础Day01基本语法.基本语法;
/*
基本数据类型之间的运算规则：

前提：这里讨论只是7种基本数据类型变量间的运算。不包含boolean类型的。

1. 自动类型提升：
    结论：当容量小的数据类型的变量与容量大的数据类型的变量做运算时，结果自动提升为容量大的数据类型。
	byte 、char 、short --> int --> long --> float --> double

	特别的：当byte、char、short三种类型的变量做运算时，结果为int型

2. 强制类型转换：见强制类型转换.java


说明：此时的容量大小指的是，表示数的范围的大和小。比如：float容量要大于long的容量
*/
public class four自动类型提升 {
    public static void main(String[]args){
        byte b1=2;
        int i1=12;
//        编译不通过
//        byte b2=b1+i1;
        int i2=b1+i1;
        System.out.println(i2);
        float f=b1+i1;
        System.out.println(f);
        short s1=123;
        double d1=s1;
        System.out.println(d1);

//        ****************************
        char c1='a';  //a=97 A=65
        int i3=10;
        int i4=i3+c1;
        System.out.println(i4);
        short s2=10;
//        short s3=c1+s2; 编译不通过
//        char c2=c1+s2;  编译不通过
        int i5=c1+s2;
        System.out.println(i5);
        byte b2=10;
//        byte b3=b2+c1; 编译不通过
//        char c2=c1+b2; 编译不通过
//        short s3=c1+b2; 编译不通过
        int i6=c1+b2;
    }
}
