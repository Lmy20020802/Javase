package Java基础Day05面向对象中.多态性.多态性练习.练习3;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-08 19:23
 * @Description:
 **/
public class MyRectangle extends  GeometricObject{
    private double width;
    private double height;
    public MyRectangle(double width,double height,String color,double weight)
    {
        super(color, weight);
        this.width=width;
        this.height=height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return width*height;
    }
}
