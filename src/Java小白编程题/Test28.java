package Java小白编程题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-08 20:17
 * @Description:
 **/
/*
练习题:打印全三角形
 */
public class Test28 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入您要输出星星的行数");
        int num=scan.nextInt();
        for (int i=1;i<=num;i++) {
            for (int j=1;j<=num-i;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
