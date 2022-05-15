package Java基础Day05面向对象中.ToString的使用;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-10 11:20
 * @Description:
 **/
public class GeometricObject {

    protected String color;
    protected double weight;
    public GeometricObject() {
        super();
        this.color = "white";
        this.weight = 1.0;
    }
    public GeometricObject(String color, double weight) {
        super();
        this.color = color;
        this.weight = weight;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }



}
