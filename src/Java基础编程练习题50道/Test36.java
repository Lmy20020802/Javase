package Java基础编程练习题50道;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-22 19:13
 * @Description:
 **/
/*
题目：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
 */
public class Test36 {
    public static void main(String[] args) {

      /*
        思路:
        1.键盘输入Scanner num个数
        2.新建一个动态数组arr  int[] arr=new int [num]
        3.for循环给动态数组赋值
        4.遍历数组
        5.请输入你要后移的位数m
        6.新建一个动态数组 arr1 int[] arr1=new int[m]
        7.分情况讨论 i>m时 i<m时
        例如num=5 m=2
        1	2	3	4	5	  4	 5	1	2	3
        当i<m时 arr1[i]=arr[num-m-i]  arr1[0]=arr[5-2-0]=arr[3] arr[1]=arr[4]
        当i>m时 arr[5-1]=arr[5-m]     arr[4]=arr[3]
        8.遍历
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入个数:");
        int num = scan.nextInt();
        int[] arr = new int[num];
        System.out.println("请输入" + num + "个数");
        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("你输入的数组为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println("请输入你要后移多少位:");
        int m = scan.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = arr[num - m + i];
        }
        for (int i = num - 1; i >= m; i--) {
            arr[i] = arr[i - m];
        }
        for (int i = 0; i < m; i++) {
            arr[i] = arr1[i];
        }
        System.out.println("后移后的数组为:");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
