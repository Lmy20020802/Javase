package Java基础编程练习题50道.Test21到30;

import Java基础Day04面向对象上.封装性.Person;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-21 22:25
 * @Description:
 **/
/*
题目：求一个3*3矩阵对角线元素之和
 */
public class Test29{
    public static void main(String[] args) {
        int sum=0;
        int[][] arr=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                if (i==j)
                {
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
