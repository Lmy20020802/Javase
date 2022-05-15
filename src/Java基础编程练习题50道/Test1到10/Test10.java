package Java基础编程练习题50道.Test1到10;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-19 20:54
 * @Description:
 **/
/*
题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多
少米？第10次反弹多高？
 */
/*
思路:
1.定义总和sum=0
2.定义一个高度height=100
3.for循环次数 1-10次
4.sum=一次落地距离+弹起距离+已经过路程
5.height/=2 弹起高度一半
6.sum-=height 求第10次落地经过路程需减去第10次弹起距离
 */
public class Test10 {
    public static void main(String[] args) {
        double sum=0;
        double height=100;
        for (int i=1;i<=10;i++)
        {
            sum=height+height/2+sum;
            height/=2;
        }
        sum-=height;
        System.out.println("共经过"+sum+"米");
        System.out.println("第10次弹起的高度为："+height);
    }
}
