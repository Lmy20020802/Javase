package Java小白编程题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-08 22:54
 * @Description:
 **/
/*
需求:接收用户输入的行数,打印对应的全三角形,如图所示:
 */
public class Test33 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入行数");
        int num=scan.nextInt();
        for (int i=1;i<=num;i++)
        {
            for (int j=1;j<=num-i;j++){
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
