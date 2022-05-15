package Java基础Day02循环.for循环;

public class for循环练习 {
    public static void main(String[]args)
    {
        /*
        思路：
        1.定义求和的变量sum
        2.for循环遍历1-100
        3.if判断是否为奇数  i%2!=0
        4.打印输出
         */
//        1.打印1~100之间所有奇数的和
//         int sum=0;
//         for (int i=1;i<=100;i++)
//         {
//             if(i%2!=0)
//             {
//                 sum+=i;
//             }
//         }
//         System.out.println("总和为"+sum);

        /*
        思路：
        1.定义求和变量 sum 定义计数变量count
        2.for循环遍历1-100
        3.判断是否为7的倍数 i%7==0
        4.打印输出
         */
//        2.打印1~100之间所有是7的倍数的整数的个数及总和（体会设置计数
//        器的思想）
//         int sum=0;
//         int count=0;
//         for (int i=1;i<=100;i++)
//         {
//             if(i%7==0)
//             {
//                 System.out.println(i);
//                 sum+=i;
//                 count++;
//             }
//         }
//         System.out.println("总和为:"+sum);
//         System.out.println("个数为:"+count);

//        3.输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数
//        字立方和等于其本身。
//        例如： 153 = 1*1*1 + 3*3*3 + 5*5*5
        /*
        1.for循环遍历100-999
        2.分别求出百位、十位、个位  方法分别是 i/100 i%100/10 i%10
        3.判断是否为水仙花数 i==b*b*b+s*s*s+g*g*g
        4.打印输出
         */
          for (int i=100;i<=999;i++){
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
