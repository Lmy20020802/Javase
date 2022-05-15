package Java基础Day02循环.for循环;

public class for循环例题 {
    public static void main(String[]args){
//        题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
//        比如：12和20的最大公约数是4，最小公倍数是60。
//        说明：break关键字的使用
        /*
           思路:
           1.Scanner键盘输入m,n
           2.求最大公约数 我们就先判断m和n的大小 从小的那个数开始一直到1递减
             如果能m%i==0 &&n%i==0的时候我们就输出i break强制结束
           3.求最小公倍数 我们就先判断m和n的大小 从大的那个数开始一直往后递增
             如果能i%m==0 &&i%n==0的时候我们就输出i break强制结束
         */
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入m:");
//        int m=scanner.nextInt();
//        System.out.println("请输入n:");
//        int n=scanner.nextInt();
//        int min=(m<=n)?m:n;
//        int max=(m>=n)?m:n;
//        for (int i=min;i>=1;i--){
//            if (m%i==0 &&n%i==0){
//                System.out.println("最大公约数"+i);
//                break;
//            }
//        }
//        for (int i=max;;i++)
//        {
//            if(i%m==0&&i%n==0)
//            {
//                System.out.println("最小公倍数:"+i);
//                break;
//            }
//        }
    }
}
