package Java基础编程练习题50道;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-22 15:01
 * @Description:
 **/
/*
题目：打印出杨辉三角形（要求打印出10行如下图）
 */
public class Test33 {
    public static void main(String[] args) {
        int[][] arr=new int[10][10];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<=i;j++)
            {
                if (j==0||j==i){
                    arr[i][j]=1;
                }else {
                    arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
                }
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
