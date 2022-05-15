package Java小白编程题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-05 20:00
 * @Description:
 **/

//练习题：接收用户输入的数据，判断是奇数还是偶数
public class Test10 {
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入一个数:");
        int num=scan.nextInt();
        if(num%2==0){
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }
    }
}
