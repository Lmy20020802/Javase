package Java小白编程题;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-08 10:33
 * @Description:
 **/
public class Test26 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i=0;i< arr.length;i++)
        {
            System.out.println("请输入第"+(i+1)+"个值");
            arr[i]=scan.nextInt();
        }
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        for (int i=0;i<arr.length;i++)
        {
            int j=new Random().nextInt(arr.length);
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}
