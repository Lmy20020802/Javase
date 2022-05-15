package Java小白编程题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-06 20:01
 * @Description:
 **/
public class Test22 {
    public static void main(String[] args) {
//        练习题:求数字阶乘(for循环版)
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个数:");
        int num = scan.nextInt();
        Test22 test = new Test22();
        System.out.println(test.fun(5));
    }
    int sum=0;
    int fun(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            sum = num * fun(num - 1);
            return sum;
        }
    }
}
