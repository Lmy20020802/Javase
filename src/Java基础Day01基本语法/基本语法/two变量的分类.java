package Java基础Day01基本语法.基本语法;

/*
Java定义的数据类型
		一、变量按照数据类型来分：
		基本数据类型：
		整型：byte \ short \ int \ long
		浮点型：float \ double
		字符型：char
		布尔型：boolean

		引用数据类型：
		类(class)
		接口(interface)
		数组(array)

		二、变量在类中声明的位置：
		成员变量  vs  局部变量
		*/
public class two变量的分类 {
    public static void main(String[]args)
    {
//        1.整型：byte（1字节=8bit) \ short(2字节) \ int(4字节) \ long(8字节)
//        1.1byte范围:-128~127
        byte b1= 12;
        byte b2= -128;
//        b2=128; 编译不通过
        System.out.println(b1);
        System.out.println(b2);
//        1.2声明long型变量 必须以"l" 或"L“ 结尾
//        1.3通常定义整形变量时，使用int型
        short s1=128;
        int i1=1234;
        long l1=3431231L;
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);
//        2.浮点型：float(4字节) \ double(8字节)
//        2.1 浮点型,表示带小数点的数值
//        2.2 float表示数值的范围比long还大
        double d1=123.3;
        System.out.println(d1+1);
//        2.3定义float变量时，变量要以”f"或"F"结尾
        float f1=12.3f;
        System.out.println(f1);
//        2.4通常，定义浮点型 变量时,使用double类型

//        3.字符型：char(1字符=2字节)
//        3.1定义char型变量,通常使用一对'' 内部只能写一个字符
        char c1='a';
        c1='A';
//        编译不通过
//        c1='AB'
        System.out.println(c1);
        char c2='1';
        char c3='中';
        char c4='@';
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
//        3.2 表示方式：1.声明一个字符 2.转义字符
        char c5='\n'; //换行符
        c5='\t'; //制表符
        System.out.print("hello" +c5);  //print 输出不换行 println 输出且换行
        System.out.println("world");

        char c6='\u0043';
        System.out.println(c6);
//        4.布尔型:boolean
//        4.1 只能取两个值之一：true false
//        4.2 常常在条件判断或者循环结构中使用
        boolean bb1=true;
        System.out.println(bb1);
        boolean isMarried=true;
        if(isMarried)
        {
            System.out.println("你就不能单身了参加单身party了！\n很遗憾");
        }else
        {
            System.out.println("你可以多谈谈女朋友");
        }
    }
}
