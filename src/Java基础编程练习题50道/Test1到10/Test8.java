package Java基础编程练习题50道.Test1到10;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-19 19:19
 * @Description:
 **/
/*
题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，
几个数相加有键盘控制。
 */

/*
思路：
1.定义求和变量sum
2.键盘输入循环的次数 输入数字 例如num=5 n=2
3.for循环遍历次数  for(int i=1;i<=5;i++)
4.如果i!=num的时候则输出 n+
5.如果i==num的时候则输出 n 代表为最后一个数
6.sum+=n
7.n=2 n=22 n=222  n=n*10+2
8.打印输出sum
 */
public class Test8 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入需要循环的次数:");
        int num=scan.nextInt();
        System.out.println("请输入数字:");
        int n=scan.nextInt();
        for (int i=1;i<=num;i++)
        {
            if (i!=num)
            {
                System.out.print(n+"+");
            }else {
                System.out.print(n);
            }
            sum+=n;
            n=n*10+2;
        }
        System.out.println("="+sum);
    }
}
