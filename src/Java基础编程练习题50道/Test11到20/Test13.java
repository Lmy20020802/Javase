package Java基础编程练习题50道.Test11到20;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-20 16:22
 * @Description:
 **/
/*
题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
 */
/*
思路:
1.定义两个变量num1 num2
2.for循环遍历1-1000
3.求平方根函数 Math.sqrt
4.if判断num1==(int)num1&&num2==(int)num2
5.打印输出
 */
public class Test13 {
    public static void main(String[] args) {
        double num1;
        double num2;
        for (int i=1;i<=1000;i++)
        {
            num1=Math.sqrt(i+100);
            num2=Math.sqrt(i+268);
            if (num1==(int)num1&&num2==(int)num2)
            {
                System.out.println(i);
            }
        }
    }
}
