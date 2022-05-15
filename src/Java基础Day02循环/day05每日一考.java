package Java基础Day02循环;

public class day05每日一考 {
    public static void main(String[]args)
    {
//     一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3
//    。编程 找出1000以内的所有完数。（因子：除去这个数本身的其它约数）
        /*
        思路:
        1.定义求和sum
        2.for循环i遍历1-1000
        3.for循环j遍历1-i/2
        4.if判断i%j==0 sum+=j
        5.判断i==sum的时候输出i
         */
//        for (int i=1;i<=1000;i++)
//        {
//            int sum=0;
//            for (int j=1;j<=i/2;j++)
//            {
//                if(i%j==0){
//                    sum+=j;
//                }
//            }

//            if(i==sum)
//            {
//                System.out.println(i);
//            }
//        }

        /*
        思路:
        1.for循环i控制行数
        2.for循环j控制列数
        3.第一行输出 6个*  第二行输出 5个*  规律每行7-i个*
        4.打印输出
        技巧:外层循环控制行 内层循环控制列
         */
//******
//*****
//****
//***
//**
//*
//        for (int i=1;i<=6;i++)
//        {
//            for (int j=1;j<=7-i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


    }
}
