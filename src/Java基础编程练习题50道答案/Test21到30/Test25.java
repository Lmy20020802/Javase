package Java基础编程练习题50道答案.Test21到30;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-21 21:51
 * @Description:
 **/
public class Test25 {
    public static void main(String[] args) {
        System.out.println("请输入一个5位数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (9999 < num && num < 100000) {
            int num1 = num / 10000;
            int num2 = num / 1000 % 10;
            int num3 = num / 100 % 10;
            int num4 = num / 10 % 10;
            int num5 = num % 10;
            if (num1 == num5 && num2 == num4) {
                System.out.println(num + "是回文数");
            } else {
                System.out.println(num + "不是回文数。");
            }
        } else {
            System.out.println("输入错误：请输入一个5位数");
        }
    }
}
