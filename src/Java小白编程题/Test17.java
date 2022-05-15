package Java小白编程题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-06 19:06
 * @Description:
 **/
/*
2019年1月1日起，国家推出新的个人所得税政策，起征点上调值5000元。也就是说税前工资扣除三险一金（三险一金数额假
设是税前工资的10%）后如果不足5000元，则不交税。如果大于5000元，那么大于5000元的部分按梯度交税，具体梯度比例如下：
​ 0 ~ 3000元的部分，交税3%
​ 3000 ~ 12000元的部分，交税10%
​ 12000 ~ 25000的部分 ， 交税20%
​ 25000 ~ 35000的部分，交税25%
​ 35000 ~ 55000的部分，交税30%
​ 55000 ~ 80000的部分，交税35%
​ 超过80000的部分，交税45%
比如：小蓝入职一家企业后，税前工资是18000，则他每月该交个税的部分是18000-1800-5000=11200元，个税缴纳
数额是3000×3%+8200×10%=910元。税后工资15290元。
请完成一个个税计算程序，在用户输入税前工资后，计算出他对应的纳税数额，以及税后工资为多少？
 */
public class Test17 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入税前工资:");
        //2.键盘录入税前工资
        int money=scan.nextInt();
        //3.计算应纳税部分的工资
        double before=money-(money*0.1)-5000;
        //3.计算应纳税部分的工资
        double shui=0;
        if (before>=0&&before<=3000)
        {
            shui=before*0.03;
        }else if(before>=3000&&before<=12000)
        {
            shui=3000*0.03+(before-3000)*0.1;
        }
        else if(before>=12000&&before<=25000)
        {
            shui=3000*0.03+9000*0.1+(before-12000)*0.2;
        }
        else if(before>=25000&&before<=35000)
        {
            shui=3000*0.03+9000*0.1+13000*0.2+(before-25000)*0.25;
        }
        else if(before>=35000&&before<=55000)
        {
            shui=3000*0.03+9000*0.1+13000*0.2+10000*0.25+(before-35000)*0.3;
        }
        else if(before>=55000&&before<=80000)
        {
            shui=3000*0.03+9000*0.1+13000*0.2+10000*0.25+20000*0.3+(before-55000)*0.35;
        }
        else if(before>80000)
        {
            shui=3000*0.03+9000*0.1+13000*0.2+10000*0.25+20000*0.3+25000*0.35+(before-80000)*0.45;
        }
        //计算税后工资
        double after=money-(money*0.1)-shui;
        System.out.println("个人所得税:"+shui);
        System.out.println("税后工资:"+after);
    }
}
