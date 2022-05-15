package Java基础编程练习题50道;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-22 13:09
 * @Description:
 **/
/*
题目：取一个整数a从右端开始的4～7位。
 */
public class Test32 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入一个不小于7位数的整数:");
        int num=scan.nextInt();
        if (num<1000000)
        {
            System.out.println("请重新输入:");
        }else {
            System.out.println(num/1000%10);
            System.out.println(num/10000%10);
            System.out.println(num/100000%10);
            System.out.println(num/1000000%10);
        }
    }
}
