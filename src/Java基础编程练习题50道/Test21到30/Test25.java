package Java基础编程练习题50道.Test21到30;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-21 15:33
 * @Description:
 **/
/*
一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 */
public class Test25 {
    public static void main(String[] args) {
        //版本1 限制输入位数
//        int count=0;
//        System.out.println("5位数的回文数有:");
//        for (int i=10000;i<=99999;i++){
//            int wan=i/10000;
//            int qian=i%10000/1000;
//            int bai=i%1000/100;
//            int shi=i%100/10;
//            int ge=i%10;
//            if (wan==ge&&qian==shi){
//                System.out.print(i+" ");
//                count++;
//                if (count%5==0){
//                    System.out.println();
//                }
//            }
//        }

        //限制输入位数
//        Scanner scan=new Scanner(System.in);
//        int num;
//        do {
//            System.out.println("请输入一个五位数：");
//            num=scan.nextInt();
//            if (num<10000||num>99999){
//                System.out.println("请重新输入！");
//            }
//        }while (num<10000||num>99999);
//        //将int类型的整数转换为字符串
//        String str = String.valueOf(num);
//        //将字符串转换为字符数组
//        char[] chs = str.toCharArray();
//        if (chs[0]==chs[4]&&chs[1]==chs[3])
//        {
//            System.out.println("是回文数");
//        }else {
//            System.out.println("不是回文数");
//        }
    }
}
