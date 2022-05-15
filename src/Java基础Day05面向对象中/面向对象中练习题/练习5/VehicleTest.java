package Java基础Day05面向对象中.面向对象中练习题.练习5;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-17 22:59
 * @Description:
 **/
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v=new Vehicle(10,5.5);
        System.out.println(v.toString());
        Car car=new Car(8,8.0,7);
        System.out.println(car.toString());
        Truck truck=new Truck(12,11,20);
        System.out.println(truck.toString());
    }
}
