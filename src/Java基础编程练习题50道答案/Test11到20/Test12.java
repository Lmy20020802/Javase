package Java基础编程练习题50道答案.Test11到20;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-20 16:20
 * @Description:
 **/
public class Test12 {
    //分级计算奖金
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入当月利润：");
        double profit = sc.nextFloat();
        sc.close();
        System.out.printf("当月发放利润是%f4元！", caculate_prize(profit));
    }
    private static double caculate_prize(double profit){

        double prize =0;
        if(profit<=100000)
            prize = profit*0.1;
        else if(profit<=200000)
            prize = (profit-100000)*0.075 + caculate_prize(100000);//调用递归分级计算
        else if(profit<=400000)
            prize = (profit-200000)*0.05 + caculate_prize(200000);
        else if(profit<=600000)
            prize = (profit-400000)*0.03 + caculate_prize(400000);
        else if(profit<=1000000)
            prize = (profit-600000)*0.015 + caculate_prize(600000);
        else
            prize = (profit-1000000)*0.01 + caculate_prize(1000000);
        return prize;
    }
}
