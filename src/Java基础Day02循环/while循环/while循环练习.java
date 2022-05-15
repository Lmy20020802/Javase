package Java基础Day02循环.while循环;
import java.util.Scanner;
public class while循环练习 {
    public static void main(String[]args)
    {
//        从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入
//        为0时结束程序。
        /*
        思路：
        1.Scanner 键盘输入一个数
        2.定义存放正数和负数的变量
        3.for(;;)或 while(true)一直循环
        4.if条件判断三种情况 >0 正数+1 <0 负数+1 =0 break 结束循环
        5.打印正数和负数的个数
         */
        Scanner scan=new Scanner(System.in);
        int positiveNumber=0;
        int minusNumber=0;
//        for(;;){
          while(true){
            System.out.println("请输入一个数:");
            int number=scan.nextInt();
            if (number>0)
            {
                positiveNumber++;
            }else if(number<0)
            {
                minusNumber++;
            }else {
                break;
            }
        }
        System.out.println("正数的个数为:"+positiveNumber);
        System.out.println("负数的个数为:"+minusNumber);
    }
}
