package Java小白编程题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-05 20:17
 * @Description:
 **/
/*
练习题：求数字的绝对值
绝对值是指一个数在数轴上所对应点到原点的距离，用“| |”来表示。负数的绝对值是他
去掉负号以后的值，而非负数（0和正数）的绝对值是他本身。请定义一个方法，接收用户输入的数字，输出绝对值结果。
 */
public class Test14 {
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入一个数:");
        int area=scan.nextInt();
        if (area>=0)
        {
            area=area;
        }else {
            area=-area;
        }
        System.out.println(area);
    }
}
