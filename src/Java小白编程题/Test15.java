package Java小白编程题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-05 20:21
 * @Description:
 **/
//练习题：求指定两个数的最大公约数和最小公倍数
public class Test15 {
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int num1=scan.nextInt();
        System.out.println("请输入第二个数:");
        int num2=scan.nextInt();
        int max=(num1>num2)?num1:num2;
        int min=(num1<num2)?num1:num2;
        for (int i=min;i>=1;i--)
        {
            if(num1%i==0&&num2%i==0)
            {
                System.out.println("最大公倍数:"+i);
                break;
            }
        }
        for (int i=max;;i++)
        {
            if (i%num1==0&&i%num2==0)
            {
                System.out.println("最小公约数:"+i);
                break;
            }
        }
    }
}
