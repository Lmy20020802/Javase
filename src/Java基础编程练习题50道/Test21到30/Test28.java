package Java基础编程练习题50道.Test21到30;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-21 22:13
 * @Description:
 **/
/*
题目：对10个数进行排序
 */
public class Test28 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int [] arr=new int[10];
        for (int i=0;i<arr.length;i++)
        {
            System.out.println("请输入"+(i+1)+"个数：");
            arr[i]=scan.nextInt();
        }
        for (int i=0;i<arr.length-1;i++)
        {
            for (int j=0;j<arr.length-i-1;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
