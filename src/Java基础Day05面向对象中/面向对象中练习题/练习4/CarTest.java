package Java基础Day05面向对象中.面向对象中练习题.练习4;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-17 22:45
 * @Description:
 **/
public class CarTest {
    public static void main(String[] args) {
        Car car1=new Car("Black","宝马");
        Car car2=new Car("Black","宝马");
        Car car3=new Car("Black","奔驰");
        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));
    }
}
