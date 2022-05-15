package Java基础编程练习题50道答案.Test21到30;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-21 20:37
 * @Description:
 **/
/*
给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
 */
public class Test24 {
    public static void main(String[] args) {
        System.out.println("请输入一个数:");
        //键盘输入
        Scanner scan=new Scanner(System.in);
        int temp= scan.nextInt();
        //范围的判断 不能大于5位数
        if (temp>99999){
            System.out.println("请重新输入数字:");
        }
        //将temp转换为字符串
        String str=String.valueOf(temp);
        //str.length() 获取长度
        System.out.println("输入的数是"+str.length()+"位数");
        //toCharArray() 方法将字符串转换为字符数组。
        char c[]=str.toCharArray();
        //for循环遍历数组从最后一位循环到第一个
        for (int i=c.length-1;i>=0;i--)
        {
            System.out.print(c[i]);
        }
    }
}
