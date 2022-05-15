package Java小白编程题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-05 20:28
 * @Description:
 **/
/*
某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：
​ 存期 年利率（%）
​ 一年 2.25
​ 两年 2.7
​ 三年 3.25
​ 五年 3.6
请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。
提示：
​ 存入金额和存入年限均由键盘录入
​ 本息计算方式：本金+本金×年利率×年限
 */
public class Test16 {
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入存入金额:");
        int num=scan.nextInt();

        if (num<1000)
        {
            System.out.println("请重新输入!");
        }
        System.out.println("请输入存放年数:");
        int num1=scan.nextInt();
        switch (num1){
            case 1:
                System.out.println(num+num*0.0225);
                break;
            case 2:
                System.out.println(num+num*0.027);
                break;
            case 3:
                System.out.println(num+num*0.0325);
                break;
            case 5:
                System.out.println(num+num*0.036);
                break;
            default:
                System.out.println("请重新输入存放年数!");
        }
    }
}
