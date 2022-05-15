package Java小白编程题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-08 20:32
 * @Description:
 **/
//练习题:求任意自然数各位数之和
public class Test30 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入自然数:");
        int num=scan.nextInt();
        int sum=0;
        while (num!=0){
            sum=sum+(num%10);
            num=num/10;
        }
        System.out.println("总和为:"+sum);
    }
}
