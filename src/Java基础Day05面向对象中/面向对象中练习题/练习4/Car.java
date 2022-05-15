package Java基础Day05面向对象中.面向对象中练习题.练习4;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-17 22:24
 * @Description:
 **/
public class Car {
    private String color;
    private String model;

    public Car() {
    }

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public boolean equals(Car car) {
        if (this.color==car.color&&this.model==car.model)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
