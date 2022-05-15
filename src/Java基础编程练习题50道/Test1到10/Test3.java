package Java基础编程练习题50道.Test1到10;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-19 15:04
 * @Description:
 **/
/*
题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：
153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。想当年，做这些题都是网上找答案，如今事过境迁，不会也得会。
 */
/*
思路:
1.for循环遍历100-999
2.截取百位 i/100
3.截取十位 i%100/10
4.截取个位 i%10
5.if判断水仙花数的条件i=百位的三次方+十位的三次方+个位的三次方
6.相等我们就输出 否则继续执行循环
 */
public class Test3 {
    public static void main(String[] args) {
        for (int i=100;i<=999;i++)
        {
            int b=i/100;
            int s=i%100/10;
            int g=i%10;
            if (i==b*b*b+s*s*s+g*g*g)
            {
                System.out.println(i);
            }
        }
    }
}
