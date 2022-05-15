package Java基础Day02循环.嵌套循环;
/*
嵌套循环的使用
1.嵌套循环：将一个循环结构A声明在另一个循环结构B的循环体中,就构成了嵌套循环

2.
外层循环：循环结构B
内层循环：循环结构A

3. 说明
① 内层循环结构遍历一遍，只相当于外层循环循环体执行了一次
② 假设外层循环需要执行m次，内层循环需要执行n次。此时内层循环的循环体一共执行了m * n次

4. 技巧：
   外层循环控制行数，内层循环控制列数
*/
//******
//******
//******
//******
public class 嵌套循环的使用 {
    public static void main(String[]args)
    {
        /*
        思路：
        1.for循环i 控制行数
        2.for循环j 控制列数
        3.打印输出星号
        4.换行
         */
//        for (int i=1;i<=4;i++)
//        {
//            for (int j=1;j<=6;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*			i(行号)		j(*的个数)
         *			1			1
         **			2			2
         ***			3			3
         ****		4			4
         *****		5			5
         */
//        for (int i=1;i<=5;i++){ //控制行数
//            for (int j=1;j<=i;j++) //控制列数
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        /*			i(行号)		j(*的个数)   规律：i + j = 5 换句话说：j = 5 - i;
//         ****		1			4
//         ***			2			3
//         **			3			2
//         *			4			1
//         */
//        for (int i=1;i<=4;i++)
//        {
//            for (int j=1;j<=5-i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        /*
         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *
         */
//        for (int i=1;i<=5;i++)
//        {
//            for (int j=1;j<=i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i=1;i<=4;i++)
//        {
//            for (int j=1;j<=5-i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


    }
}
