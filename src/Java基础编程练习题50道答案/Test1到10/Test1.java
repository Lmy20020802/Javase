package Java基础编程练习题50道答案.Test1到10;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-19 14:32
 * @Description:
 **/
public class Test1 {
    public static void main(String args[]) {
        //方法一
        //i是表示月份的，这里计算了36个月，也就是三年，兔子的数量
//        int i;
//        long arr[] = new long[36];   //这个数组时用来计算每月有兔子的对数
//        arr[0] = arr[1] = 1;
//        System.out.println("第1个月有兔子1对" + ", " + "总数是" + 2);
//        System.out.println("第2个月有兔子1对" + ", " + "总数是" + 2);
//        for (i = 2; i < 35; i++) {
//            arr[i] = arr[i - 1] + arr[i - 2];
//            System.out.println("第" + (i+1) + "个月有兔子" + arr[i] + "对" + ", " + "总数是" + 2 * arr[i]);
//            //规律是 每个数字都是前面两个数字之和
//        }

        //方法二
        System.out.println("请输入月份：");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("第" + n + "个月有" + Fib1(n) + "对兔子");
    }

    private static int Fib1(int n) {//递归实现
        if (n == 1 || n == 2)
            return 1;
        else
            return Fib1(n - 1) + Fib1(n - 2);
    }
}


