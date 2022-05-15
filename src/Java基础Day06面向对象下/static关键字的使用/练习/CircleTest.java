package Java基础Day06面向对象下.static关键字的使用.练习;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-11 11:24
 * @Description:
 **/
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        System.out.println("c1的id:"+c1.getId());
        System.out.println("c2的id:"+c2.getId());

        Circle c3=new Circle(3.4);
        System.out.println("创建的圆的个数为:"+Circle.getTotal());
    }
}
class Circle{
    private double radius;
    private int id;

    public Circle(){
        id=init++;
        total++;
    }

    public Circle(double radius)
    {
        this();
//        id=init++;
//        total++;
          this.radius=radius;

    }

    private static int total; //记录创建圆的个数
    private static int init=1001; //static声明的属性被所有对象所共享

    public double findArea(){
        return 3.14*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Circle.total = total;
    }

    public static int getInit() {
        return init;
    }

    public static void setInit(int init) {
        Circle.init = init;
    }
}
