package Java基础Day04面向对象上.构造器;

import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-03 12:51
 * @Description:
 **/
public class TriAngle {
    private double base;//底边长
    private double height; //底边高
    public TriAngle(){

    }
    public TriAngle(double b, double h)
    {
        base=b;
        height=h;
    }

    public void setBase(double b)
    {
        base=b;
    }
    public double getBase(){
        return base;
    }
    public void setHeight(double h)
    {
        height=h;
    }

    public double getHeight() {
        return height;
    }
}
