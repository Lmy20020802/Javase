package Java基础编程练习题50道.Test11到20;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-20 19:28
 * @Description:
 **/
/*
题目：输入某年某月某日，判断这一天是这一年的第几天？
 */
/*
思路:
1.定义一个求天数总和的变量
2.键盘输入 年 月 日
3.Switch-case 循环
4.判断闰年的条件 如果是闰年+29  如果不是+28
5.打印输出
 */
public class Test14 {
    public static void main(String[] args) {
        int days=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入年份:");
        int year=scan.nextInt();
        System.out.println("请输入月份:");
        int month=scan.nextInt();
        System.out.println("请输入日:");
        int day=scan.nextInt();
        switch (month){
            case 12:
                days+=30;
            case 11:
                days+=31;
            case 10:
                days+=30;
            case 9:
                days+=31;
            case 8:
                days+=31;
            case 7:
                days+=30;
            case 6:
                days+=31;
            case 5:
                days+=30;
            case 4:
                days+=31;
            case 3:
                if ((year%4==0&&year%100!=0)||year%400==0)
                {
                    days+=29;
                }else{
                    days+=28;
                }
            case 2:
                days+=31;
            case 1:
                days+=day;
        }
        System.out.println(year+"年"+month+"月"+day+"日"+"是"+year+"年的第"+days+"天");
    }
}
