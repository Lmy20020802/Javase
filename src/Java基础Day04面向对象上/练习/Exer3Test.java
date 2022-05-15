package Java基础Day04面向对象上.练习;

public class Exer3Test {
    public static void main(String[]args)
    {
//        1 编写程序，声明一个method方法，在方法中打印一个10*8 的*型矩形，
//        在main方法中调用该方法。
        Exer3Test test=new Exer3Test();
        //3.1测试
//        test.method();

        //3.2测试
        //方式一
//        int area=test.method();
//        System.out.println("面积为："+area);

        //方法二
//        System.out.println(test.method());

        //3.3测试
        int area=test.method(8,8);
        System.out.println("面积为："+area);
    }
//    3.1
//    public int   method(){
//        for(int i=0;i<10;i++)
//        {
//            for (int j=0;j<8;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    //3.2
//    public int method(){
//        for(int i=0;i<10;i++)
//        {
//            for (int j=0;j<8;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        return 10 * 8;
//    }

    //3.3
    public int method(int m,int n)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        return m*n;
    }
}
