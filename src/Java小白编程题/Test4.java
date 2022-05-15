package Java小白编程题;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-05 19:31
 * @Description:
 **/

import java.util.Scanner;
//练习题：定义两个整数，计算这两个整数加减乘除运算的结果，并把结果打印到控制台
public class Test4 {
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入第一个数");
        int num1=scan.nextInt();
        System.out.println("请输入第二个数");
        int num2=scan.nextInt();
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
    }
}
