package Java基础编程练习题50道.Test11到20;

import java.awt.font.FontRenderContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-20 21:55
 * @Description:
 **/
/*
题目：打印出如下图案（菱形）
   *
  ***
 *****
*******
 *****
  ***
   *
 */
public class Test19 {
    public static void main(String[] args) {
        for (int i=1;i<=4;i++)
        {
            for (int k=1;k<=4-i;k++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=3;i>=1;i--)
        {
            for (int k=1;k<=4-i;k++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
