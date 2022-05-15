package Java基础Day04面向对象上.面向对象上练习题.练习8;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-11 21:01
 * @Description:
 **/

public class PointTest {
    public static void main(String[] args) {
        Point p=new Point(2,3);
        System.out.println(p.getX());
        System.out.println(p.getY());
        p.coordinate();
    }
}
class Point{
    double x;
    double y;
    public Point(){

    }
    public Point(double x,double y)
    {
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void coordinate(){
        System.out.println("("+getX()+","+getY()+")");
    }
}
