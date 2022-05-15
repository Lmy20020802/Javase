package Java基础Day04面向对象上.面向对象上练习题.练习6;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-11 18:59
 * @Description:
 **/

/*
定义一个圆类型
提供显示圆周长功能的方法
提供显示圆面积的方法
提供无参的构造器和一个有参的构造器
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c=new Circle(3.0);
        double Perimeter=c.perimeter();
        double area=c.findArea();
        System.out.println(Perimeter);
        System.out.println(area);
    }
}
class Circle{
    double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }

    public double perimeter(){
        return Math.PI*radius*2;
    }

    public double findArea(){
        return Math.PI*radius*radius;
    }
}
