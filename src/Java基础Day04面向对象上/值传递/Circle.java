package Java基础Day04面向对象上.值传递;
/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-02 13:14
 * @Description:
 **/
//        （1）定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个
//        findArea()方法返回圆的面积。
public class Circle {
    double radius;//半径

    //求圆的面积
    public double findArea(){
        return Math.PI * radius * radius;
    }
}

