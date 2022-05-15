package Java基础编程练习题50道.Test1到10;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-19 14:41
 * @Description:
 **/
/*
题目：判断101-200之间有多少个素数，并输出所有素数。
素数又叫质数，就是除了1和它本身之外，再也没有整数能被它整除的数。也就是素数只有两个因子
 */
/*
思路:
1.定义变量count计算个数
2.for循环遍历101-200
3.初始化布尔变量isFlag为真
4.for循环判断的条件2-(i-1) or2-(i/2)
5.if判断 如果i%J==0  我们吧isFlay为假 结束循环
6.如果isFlag在for循环之后依然为true 我们就输出这个数
 */
public class Test2 {
    public static void main(String[] args) {
        int count=0;
        for (int i=101;i<=200;i++)
        {
            boolean isFlag=true;
            for (int j=2;j<i/2;j++)
            {
                if (i%j==0)
                {
                    isFlag=false;
                    break;
                }
            }
            if (isFlag)
            {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("101-200之间一共有"+count+"个素数");
    }
}
