package Java基础Day05面向对象中.多态性.多态性练习.练习3;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-08 19:23
 * @Description:
 **/
public class GeometricObject {//几何图形
    protected String color;
    protected double weight;
    protected GeometricObject(String color,double weight)
    {
        super();
        this.color=color;
        this.weight=weight;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
    public double findArea(){
        return 0.0;
    }
}
