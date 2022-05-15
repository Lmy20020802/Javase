package Java基础编程练习题50道.Test1到10;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-19 15:54
 * @Description:
 **/
/*
输入两个正整数m和n，求其最大公约数和最小公倍数
 */
/*
思路：
1.键盘输入 m和n 两个数
2.定义一个变量max 和一个变量min  三元运算符获取较大值  较小值
3.最大公约数 获取方法 for循环从较小值一直循环到1 如果有m%i==0&&n%i==0 输出结果 break跳出循环
4.最小公倍数 获取方法 for循环从最大值一直循环到无限大 如果i%m==0&&i%n==0 输出结果 break跳出循环
 */
public class Test6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int n=scan.nextInt();
        System.out.println("请输入第二个数:");
        int m=scan.nextInt();
        int max=(n>m)?n:m;
        int min=(n<m)?n:m;
        for (int i=min;i>=1;i--)
        {
            if (n%i==0&&m%i==0)
            {
                System.out.println("最大公约数:"+i);
                break;
            }
        }
        for (int i=max;;i++)
        {
            if (i%n==0&&i%m==0)
            {
                System.out.println("最小公倍数:"+i);
                break;
            }
        }
    }
}
