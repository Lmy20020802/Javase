package Java小白编程题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-05 20:03
 * @Description:
 **/
//练习题：输入数字1~7，输出对应星期几
public class Test11 {
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入数字:");
        int num=scan.nextInt();
        switch (num)
        {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("请重新输入");
                break;
        }
    }
}
