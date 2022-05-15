package Java基础编程练习题50道.Test11到20;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-20 22:37
 * @Description:
 **/
/*
题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
 */
public class Test20 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double fenzi=2;
        double fenmu=1;
        double sum=0;
        System.out.println("请输入前多少项:");
        int num=scan.nextInt();
        for (int i=1;i<=num;i++)
        {
            sum+=fenzi/fenmu;
            fenzi=fenzi+fenmu;
            fenmu=fenzi-fenmu;
        }
        System.out.println("前"+num+"项的和为:"+sum);
    }
}
