package Java基础编程练习题50道;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-22 15:54
 * @Description:
 **/
/*
题目：输入3个数a,b,c，按大小顺序输出。
 */
public class Test34 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入a:");
        int a=scan.nextInt();
        System.out.println("请输入b:");
        int b=scan.nextInt();
        System.out.println("请输入c:");
        int c=scan.nextInt();
        if (a>b){
            if (c>a)
            {
                System.out.println(b+"\t"+a+"\t"+c);
            }else if(c>b)
            {
                System.out.println(b+"\t"+c+"\t"+a);
            }else {
                System.out.print(c+"\t"+b+"\t"+a);
            }
        }else if(a<b)
        {
            if (c>b)
            {
                System.out.print(a+"\t"+b+"\t"+c);
            }else if(c>a)
            {
                System.out.print(a+"\t"+c+"\t"+b);
            }else {
                System.out.print(c+"\t"+a+"\t"+b);
            }
        }
    }
}
