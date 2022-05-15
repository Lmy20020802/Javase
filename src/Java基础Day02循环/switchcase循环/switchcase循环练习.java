package Java基础Day02循环.switchcase循环;
import java.util.Scanner;
/*
从键盘分别输入年、月、日，判断这一天是当年的第几天

   注：判断一年是否是闰年的标准：
       1）可以被4整除，但不可被100整除
	或
       2）可以被400整除


说明：
1. 凡是可以使用switch-case的结构，都可以转换为if-else。反之，不成立。
2. 我们写分支结构时，当发现既可以使用switch-case,（同时，switch中表达式的取值情况不太多），
  又可以使用if-else时，我们优先选择使用switch-case。原因：switch-case执行效率稍高。

*/
public class switchcase循环练习 {
    public static void main(String[]args)
    {
        /*
        使用 switch 把小写类型的 char型转为大写。只转换 a, b, c, d, e. 其它的输出 “other”。
        1.键盘输入一个字符
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        char c=str.charAt(0);
        2.运用switch-case循环 把a,b,c,d,e五个值分别写入输出语句和break
         */
//        Scanner scanner=new Scanner(System.in);
//        String str=scanner.next();
//        char c=str.charAt(0);
//        switch (c){
//            case 'a':
//                System.out.println('A');
//                break;
//            case 'b':
//                System.out.println('B');
//                break;
//            case 'c':
//                System.out.println('C');
//                break;
//            case 'd':
//                System.out.println('D');
//                break;
//            case 'e':
//                System.out.println('E');
//                break;
//            default:
//                System.out.println("other");
//                break;
//        }

        /*
        2.对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。
        说明：如果switch-case结构中的多个case的执行语句相同，则可以考虑进行合并。
        1.键盘输入成绩
        2.1-100一个一个写太麻烦 我们除10 以后就只剩0-10了
        3.分别写出0-5 为不及格  6-10为及格 break

        更优方案 除60 0为不及格 1为及格
         */
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入你的成绩:");
//        int score=scanner.nextInt();
//        switch (score/10){
//            case 0:
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("不及格");
//                break;
//            case 6:
//            case 7:
//            case 8:
//            case 9:
//            case 10:
//                System.out.println("及格");
//                break;
//        }

//        switch (score/60){
//            case 0:
//                System.out.println("不及格");
//            case 1:
//                System.out.println("及格");
//        }

        /*
        3.根据用于指定月份，打印该月份所属的季节。
        3,4,5 春季 6,7,8 夏季 9,10,11 秋季 12, 1, 2 冬季
        思路：
        1.键盘输入月份
        2.月份/3 分五种情况 0,1,2,3,4
        3.分别写入对应的语句 break
        4.default 输出其他的值返回语句
        */
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入月份:");
//        int month=scanner.nextInt();
//        switch (month/3){
//            case 0:
//                System.out.println("冬季");
//                break;
//            case 1:
//                System.out.println("春季");
//                break;
//            case 2:
//                System.out.println("夏季");
//                break;
//            case 3:
//                System.out.println("秋季");
//                break;
//            case 4:
//                System.out.println("冬季");
//                break;
//            default:
//                System.out.println("请重新输入月份");
//                break;
//        }

        /*
        编写程序：从键盘上输入2019年的“month”和“day”，要求通过程序输出输入的日期为2019年的第几天。
        思路：
        1.键盘输入 年、月、日 定义一个存放天数的变量
        2.运用switch-case循环 写入每个月需要的天数 例如 2月1日=31+1=32
        3.判断是否为闰年 如果是闰年二月则有29天 否则为28天
         */
        int sumDays=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入年");
        int year=scanner.nextInt();
        System.out.println("请输入月份");
        int month=scanner.nextInt();
        System.out.println("请输入天数");
        int day=scanner.nextInt();

        switch (month){
            case 12:
                sumDays+=30;
            case 11:
                sumDays+=31;
            case 10:
                sumDays+=30;
            case 9:
                sumDays+=31;
            case 8:
                sumDays+=31;
            case 7:
                sumDays+=30;
            case 6:
                sumDays+=31;
            case 5:
                sumDays+=30;
            case 4:
                sumDays+=31;
            case 3:
                if ((year%4==0 && year%100!=0)|year%400==0)
                {
                    sumDays+=29;
                }else {
                    sumDays+=28;
                }
            case 2:
                sumDays+=31;
            case 1:
                sumDays+=day;
        }
        System.out.println("2019年"+month+"月"+day+"日是当年的第"+sumDays+"天");
    }
}
