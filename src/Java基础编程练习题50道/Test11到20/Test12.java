package Java基础编程练习题50道.Test11到20;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-20 14:45
 * @Description:
 **/
/*
题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；利润高于10万元，低于20万
元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；20万到40万之间时，高于20万元的部
分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；60万到100万之间时，高于60万元的部分，可
提成1.5%，高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？
 */
/*
思路:
1.键盘输入利润
2.定义一个方法
3.定义一个变量 利润变量 prize
4.if 判断 如果利润在100000之内*0.1 200000之内 (利润-100000)*0.075+100000*0.1 以此类推
5.返回prize
 */
public class Test12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入当月利润:");
        double profit=scan.nextDouble();
        scan.close();
        System.out.println("当月发放利润是"+caculate_profit(profit));
    }
    private static double  caculate_profit(double profit){
        double prize=0;
        if (profit<=100000)
        {
            prize=profit*0.1;
        }else if (profit<=200000)
        {
            prize=(profit-100000)*0.075+caculate_profit(100000);
        }
        else if (profit<=400000)
        {
            prize=(profit-200000)*0.05+caculate_profit(200000);
        }
        else if (profit<=600000)
        {
            prize=(profit-400000)*0.03+caculate_profit(400000);
        }
        else if (profit<=1000000)
        {
            prize=(profit-600000)*0.015+caculate_profit(600000);
        }else {
            prize=(profit-1000000)*0.01+caculate_profit(1000000);
        }
        return prize;
    }
}
