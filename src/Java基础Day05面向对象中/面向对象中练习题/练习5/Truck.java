package Java基础Day05面向对象中.面向对象中练习题.练习5;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-17 22:56
 * @Description:
 **/
public class Truck extends Vehicle{
    private double payload;

    public Truck() {
    }

    public Truck(int wheels, double weight, double payload) {
        super(wheels, weight);
        this.payload = payload;
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + getWheels() +
                ", weight=" + getWeight()+"payload"+payload+
                '}';
    }
}
