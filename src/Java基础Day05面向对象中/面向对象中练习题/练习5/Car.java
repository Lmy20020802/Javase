package Java基础Day05面向对象中.面向对象中练习题.练习5;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-17 22:53
 * @Description:
 **/
public class Car extends Vehicle{
    private int loader;

    public Car(){

    }

    public Car(int wheels, double weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + getWheels() +
                ", weight=" + getWeight()+"loader"+loader+
                '}';
    }
}
