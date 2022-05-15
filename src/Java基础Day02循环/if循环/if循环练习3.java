package Java基础Day02循环.if循环;

public class if循环练习3 {
    public static void main(String[]args)
    {
        /*
        1.定义x=4 y=1
        2.if判断 x>2为true 我们执行里层if y>2为false 所以输出   System.out.println("atguigu");
        3.如果x<=2的时候 输出  System.out.println("x is " + x);
         */
        int x = 4;
        int y = 1;
//        if (x > 2) {
//            if (y > 2) {
//                System.out.println(x + y);
//            }
//            System.out.println("atguigu");
//        } else
//            System.out.println("x is " + x);

        if (x > 2)
            if (y > 2)
                System.out.println(x + y);
//          System.out.println("atguigu");
//          else //就近原则
                System.out.println("x is " + x);
    }
}
