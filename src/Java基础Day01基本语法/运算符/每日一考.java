package Java基础Day01基本语法.运算符;

public class 每日一考 {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        short z = 40;
        /*
        1. 设置x=true y=false z=40
        2. 判断z++是不是等于40 z=40所以 为true 判断完成 z+1=41
        3. y=true
        4. && 左右两边 都是true 所以进入 if 后面的代码 z+1=42
         */
        if ((z++ == 40) && (y = true)) {
            z++;
        }
        /*
           1.x=false 为false
           2.++z==43 为true
           3.||左右一边为true 则为true z+1=44
         */
        if ((x = false) || (++z == 43)) {
            z++;
        }
        System.out.println("z = " + z);

//      定义三个int型变量并赋值，使用三元运算符或者if-else获取这三个数中的较大数的实现
        int i = 12;
        int i1 = 5;
        int i2 = 10;
        //方法一 三元运算符
        int i3 = (i > i1) ? i : i1;
        int i4 = (i3 > i2) ? i3 : i2;
        System.out.println(i4);

        //方法二 if-else
        if (i > i1 && i > i2) {
            System.out.println(i);
        } else if (i1 > i && i1 > i2) {
            System.out.println(i1);
        } else {
            System.out.println(i2);
        }

//        编写程序，声明2个double型变量并赋值。判断第一个数大于10.0，且第2个数小于20.0，打印两数之和。否则，打印两数的乘积。
        double d1=12;
        double d2=20;
        if (d1>10.0 &&d2<20.0){
            System.out.println(d1+d2);
        }else {
            System.out.println(d1*d2);
        }

//        交换两个变量值的代码的实现
        int num1=10;
        int num2=20;
        System.out.println("num1="+num1+",num2="+num2);

//      方法一 定义临时变量
//        int temp;
//        temp=num1;
//        num1=num2;
//        num2=temp;
//        System.out.println("num1="+num1+",num2="+num2);

//        方法二 位运算符
//        num1=num1^num2;
//        num2=num1^num2;
//        num1=num1^num2;
//        System.out.println("num1="+num1+",num2="+num2);

//        方法三 相加 好处不用定义临时变量
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("num1="+num1+",num2="+num2);
    }
}
