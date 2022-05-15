package Java基础编程练习题50道答案.Test21到30;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-21 22:21
 * @Description:
 **/
public class Test28 {
    public static void main(String[] args) {
        //键盘输入
        Scanner scan=new Scanner(System.in);
        //动态数组
        int [] arr=new int[10];
        //遍历数组的长度
        for (int i=0;i<arr.length;i++)
        {
            //提示语句
            System.out.println("请输入"+(i+1)+"个数：");
            //键盘输入值赋给数组的每一个元素
            arr[i]=scan.nextInt();
        }
        //冒泡排序
        for (int i=0;i<arr.length-1;i++)
        {
            for (int j=0;j<arr.length-i-1;j++)
            {
                //如果前一个大于后一个 交换位置
                if (arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //遍历数组
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
