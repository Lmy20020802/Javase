package Java基础Day02循环.嵌套循环;

public class 嵌套循环的练习 {
    public static void main(String[]args)
    {
        /*
        思路:
        1.for循环i定义行数 9行
        2.for循环j定义列数 i=1 j=1 i=2 j=1 j=2
        3.输出语句
        4.换行
         */
     for (int i=1;i<=9;i++)
     {
         for (int j=1;j<=i;j++)
         {
             System.out.print(i+" * "+j+" = " +i*j+" ");
         }
         System.out.println();
     }
    }
}
