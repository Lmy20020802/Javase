package Java小白编程题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-05 19:57
 * @Description:
 **/
//练习题: 接收用户输入的3个整数,并将它们的最大值作为结果输出
public class Test9 {
    public static void main(String[]args)
    {
        Scanner  scan=new Scanner(System.in);
        System.out.println("请输入A");
        int a=scan.nextInt();
        System.out.println("请输入B");
        int b=scan.nextInt();
        System.out.println("请输入C");
        int c=scan.nextInt();
        int max=(a>b)?a:b;
        int max1=(max>c)?max:c;
        System.out.println("最大值:"+max1);
    }
}
