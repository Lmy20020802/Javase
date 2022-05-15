package Java基础编程练习题50道.Test11到20;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-20 14:40
 * @Description:
 **/
/*
题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 */
/*
思路:
1.定义一个变量count存储个数
2.for循环定义百位1-4
3.for循环定义十位1-4
4.for循环定义个位1-4
5.if判断如果互不相等
6.打印输出 个数加加
 */
public class Test11 {
    public static void main(String[] args) {
        int count=0;
        for (int i=1;i<=4;i++)
        {
            for (int j=1;j<=4;j++)
            {
                for (int k=1;k<=4;k++)
                {
                    if (i!=j&&i!=k&&j!=k)
                    {
                        System.out.println(i*100+j*10+k);
                        count++;
                    }
                }
            }
        }
        System.out.println("个数为:"+count);

    }
}
