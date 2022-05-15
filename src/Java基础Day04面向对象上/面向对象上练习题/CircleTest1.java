package Java基础Day04面向对象上.面向对象上练习题;

/**
 * Created with IntelliJ IDEA.
 *
 * @author shkstart
 * @company 尚硅谷实习谷粉
 * @date 2022-02-18 22:29
 * @Description:
 * @name 李铭洋
 **/
class Circle1 {
    double radius;  //半径
    double height;  //高

    public void A(){
        System.out.println("半径是"+radius+",高是"+height+",底面积"+getArea()+",体积"+getVolume());
    }

    public double getArea(){
        double area=Math.PI*radius*radius;
        return area;
    }

    public double getVolume(){
        double Volume=getArea()*height;
        return Volume;
    }

    public void setValue(double r,double h)
    {
        radius=r;
        height=h;
    }

    public boolean setRadiusAndHeight(double r, double h) {
        if (r<=0||h<=0)
        {
            return false;
        }
        setValue(r,h);
        return true;
    }
}

public class CircleTest1{
    public static void main(String[] args) {
        Circle1 circle1=new Circle1();
        circle1.radius=3;
        circle1.height=3;
        System.out.println(circle1.getArea());
        System.out.println(circle1.getVolume());
        circle1.setValue(5,3);
        System.out.println(circle1.radius);
        System.out.println(circle1.height);
        System.out.println(circle1.setRadiusAndHeight(-1, 1));
    }
}