package Java基础Day05面向对象中.多态性.多态性练习.练习3;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-08 19:24
 * @Description:
 **/
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test=new GeometricTest();
        Circle c1=new Circle(2.3,"white",1.0);
        test.displayGeometricObject(c1);
        Circle c2=new Circle(3.3,"white",1.0);
        test.displayGeometricObject(c2);
        boolean isEquals=test.equalsArea(c1,c2);
        System.out.println("c1和c2的面积是否相等"+isEquals);
        MyRectangle rect=new MyRectangle(2.1,3.4,"red",2.0);
        test.displayGeometricObject(rect);
    }
    //测试两个对象的面积是否相等
    public boolean equalsArea(GeometricObject o1,GeometricObject o2)
    {
        return o1.findArea()==o2.findArea();
    }
    public void displayGeometricObject(GeometricObject o)
    {
        System.out.println("面积为"+o.findArea());
    }
}
