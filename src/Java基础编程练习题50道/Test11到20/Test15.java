package Java基础编程练习题50道.Test11到20;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-20 19:47
 * @Description:
 **/
/*

 */
public class Test15 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int x=scan.nextInt();
        System.out.println("请输入第二个数:");
        int y=scan.nextInt();
        System.out.println("请输入第三个数:");
        int z=scan.nextInt();
        int max=(x>y)?x:y;
        int max1=(max>z)?max:z;
        System.out.println("三个数中最大的为:"+max1);
    }
}
