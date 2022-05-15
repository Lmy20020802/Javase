package Java基础Day04面向对象上.练习;

//2.利用面向对象的编程方法，设计类Circle计算圆的面积。
//测试类
public class CircleTest {
    public static void main(String[]args)
    {
        Circle c=new Circle();
        c.radius=3;
        //对应方式一
//        double area=c.findArea();
//        System.out.println(area);

        //对应方式二
        c.findArea();

        //错误的调用
//        double area=c.findArea(3.4);
//        System.out.println(area);
    }
}
//圆
class Circle{
    double radius;
    //求圆的面积
    //方式一
//    public double findArea(){
//        double area=Math.PI*radius*radius;
//        return area;

//    方式二
    public void findArea(){
        double area=Math.PI*radius*radius;
        System.out.println("面积为"+area);
    }
    //错误的情况
//    public void findArea(double r){
//        double area=Math.PI*r*r;
//        System.out.println("面积为"+area);
//    }
}
