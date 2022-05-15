package Java基础编程练习题50道.Test1到10;

import java.awt.*;
import java.awt.font.ShapeGraphicAttribute;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-19 14:17
 * @Description:
 **/
/*
題目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一
对兔子，假如兔子都不死，问每个月的兔子总数为多少？
刚开始真的无从下手，这么难的，怎么可以说是基础呢，感觉这些应该是逻辑分析很强的，第一个月只有一对兔子，第二个月还是只
有一对兔子，第三个月，就有两对了，第四个月3对，第五个月5对，第六个月8对，第七个月是13对。。。。。。规律出来了，你们发了没？
 */
/*
思路:
1.定义一个数组
2.定义一个变量i 代表月份
3.初始化变量第一个月和第二个月都是1对
4.从第三个月开始等于前两个月的和
5.打印输出
 */
public class Test1 {
    public static void main(String[] args) {
    int i;
    long arr[]=new long[36];
    arr[0]=arr[1]=1;
        System.out.println("第1个月有兔子1对" + ", " + "总数是" + 2);
        System.out.println("第2个月有兔子1对" + ", " + "总数是" + 2);
        for (i = 2; i < 35; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.println("第" + (i + 1) + "个月有兔子" + arr[i] + "对" + ", " + "总数是" + 2 * arr[i]);
        }
    }
}
