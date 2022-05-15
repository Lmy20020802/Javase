package Java基础编程练习题50道.Test1到10;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-19 19:40
 * @Description:
 **/
/*
题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程 找出1000以内的所有完
数。
 */
/*
思路：
1.for循环i遍历1-1000的数字
2.定义一个求和变量sum
3.for循环j遍历1到i/2
4.if判断 如果i%j==0 我们sum+=j
5.if判断 如果sum==i 我们就打印输出
 */
public class Test9 {
    public static void main(String[] args) {
        for (int i=1;i<=1000;i++)
        {
            int sum=0;
            for (int j=1;j<=i/2;j++)
            {
                if (i%j==0)
                {
                  sum+=j;
                }
            }
            if (sum==i)
            {
                System.out.println(i);
            }
        }
    }
}
