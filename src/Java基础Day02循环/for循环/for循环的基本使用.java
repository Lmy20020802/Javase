package Java基础Day02循环.for循环;

import org.junit.Test;

/*
For循环结构的使用
一、循环结构的4个要素
① 初始化条件
② 循环条件  --->是boolean类型
③ 循环体
④ 迭代条件

二、for循环的结构

for(①;②;④){
	③
}

执行过程：① - ② - ③ - ④ - ② - ③ - ④ - ... - ②

*/
public class for循环的基本使用 {
    @Test
    public static void main(String[]args)
    {
        for(int i=1;i<=5;i++){
            System.out.println("hello world");
        }
        //i：在for循环内有效 出了for循环就失效了
//        System.out.println(i);
        int num=1;
        for (System.out.print('a');num<=3;System.out.print('c'),num++){
            System.out.print('b');
        }
        //遍历100以内的偶数
        /*
        思路：
        1.定义一个求和变量sum 定义一个计数变量count
        2.for循环遍历1-100的数
        3.if判断条件 如果i%2==0 说明i此时为偶数 sum+=i count++
         */
        int sum=0;   //记录所有偶数的和
        int count=0;
        for(int i=1;i<=100;i++)
        {
            if (i%2==0)
            {
                System.out.println(i);
                sum+=i;
                count++;
            }
        }
        System.out.println("总和为"+sum);
        System.out.println("个数为"+count);
        System.out.println();
        /*
        思路:
        1.for 循环遍历1-150
        2.if判断 如果i%3==0 输出一次 i%5==0 输出一次 i%7==0 输出一次
         */
        for (int i=1;i<=150;i++) {
            System.out.print(i+" ");
            if (i % 3 == 0) {
                System.out.print("foo ");
            }
            if (i % 5 == 0) {
                System.out.print("biz ");
            }
            if (i % 7 == 0) {
                System.out.print("baz ");
            }
            System.out.println();
        }
    }
}
