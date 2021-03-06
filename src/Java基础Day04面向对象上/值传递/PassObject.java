package Java基础Day04面向对象上.值传递;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-02 13:26
 * @Description:
 **/
/*
 * 考查参数的值传递
 *
 * 定义一个类PassObject，在类中定义一个方法printAreas()，
 * 该方法的定义如下：public void printAreas(Circle c, int time)
 * 在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
 * 例如，time为5，则输出半径1，2，3，4，5，以及对应的圆面积。
 *
 *
 * 在main方法中调用printAreas()方法，调用完毕后输出当前半径值。程序运行结果如图所示。
 *
 *
 */
public class PassObject {
    public static void main(String[]args)
    {
        PassObject test=new PassObject();
        Circle c=new Circle();
        test.printAreas(c,5);
        System.out.println("now radius is "+c.radius);
    }
    public void printAreas(Circle c,int time)
    {
        System.out.println("Radius\t\tArea");
        //设置圆的半径
        int i=1;
        for (;i<=time;i++)
        {
            c.radius=i;
            double area=c.findArea();
            System.out.println(c.radius+"\t\t"+area);
        }
        //
//        c.radius=time+1;
        c.radius=i;
    }
}
