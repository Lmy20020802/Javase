package Java基础编程练习题50道.Test1到10;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-19 15:09
 * @Description:
 **/
/*
题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
(1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
(2)如果n<>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数你n,重复执行第一步。
(3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
 */
/*
思路:
1.键盘输入一个正整数 Scanner
2.输入格式 num=
3.定义一个变量i=2 从2开始
4.while循环如果i<=num的时候执行循环
5.第一种情况 当这个数没有因数，只有1和它自己到时候我们直接输出i
6.第二种情况 if(num%i)==0 我们就输出这个因数 格式为i* num/i
7.第三种情况 继续循环下一个数 i=2 i=3 i=4 i=5
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int num=scan.nextInt();
        System.out.print(num+"=");
        int i=2;
        while(i<=num){		//使用循环来找到可以被整除的数，然后通过out函数输出
            if(i == num){		//如果相等的话，就说明这个数没有因数，只有1和它自己；
                System.out.println(i);
                break;
            }else if(num% i ==0){		//如果这个数有因数，然后找到除去这个因数后的值，继续循环
                System.out.print(i+"*");
                num=num/i;
            }else{			//如果都不满足，则继续循环
                i++;
            }
        }
    }
}
