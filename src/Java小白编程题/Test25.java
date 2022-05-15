package Java小白编程题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-08 10:29
 * @Description:
 **/
public class Test25 {
    public static void main(String[] args) {
//        练习题:求质数:接收用户输入的数字,判断是否为质数
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入一个数");
        int num=scan.nextInt();
        int x=0;
        for (int i=2;i<num-1;i++)
        {
            if(num%i==0)
            {
                x++;
            }
        }
        if (x==0)
        {
            System.out.println("是质数");
        }else{
            System.out.println("不是质数");
        }
    }
}
