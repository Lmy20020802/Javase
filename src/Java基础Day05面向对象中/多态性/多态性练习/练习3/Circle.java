package Java基础Day05面向对象中.多态性.多态性练习.练习3;



/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-08 19:23
 * @Description:
 **/
public class Circle extends GeometricObject{
    private double radius ;
    public Circle(double radius,String color,double weight){
        super(color,weight);
        this.radius=radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double findArea(){
       return 3.14* radius*radius;
    }
}
