package Java基础Day04面向对象上.面向对象上练习题.练习10;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-11 21:46
 * @Description:
 **/
/*
属性：品牌；车长；颜色；价格；
创建五个对象：“捷达”，“宝马”，“劳斯莱斯”，“科鲁兹”，“迈锐宝”
提供无参的构造器和一个有参的构造器

 */
public class CarTest {
    public static void main(String[] args) {
        Car car1=new Car("宝马",5.4,"黑",520000);
        car1.self();
        Car car2=new Car("捷达",5.3,"黑",400000);
        car2.self();
        Car car3=new Car("劳特莱斯",5.8,"白",1000000);
        car3.self();
        Car car4=new Car("科鲁兹",5.1,"黑",700000);
        car4.self();
        Car car5=new Car("迈锐宝",6.0,"白",620000);
        car5.self();
    }
}
class Car{
    String brand;
    double length;
    String color;
    double price;
    public Car(){

    }

    public Car(String brand,double length, String color, double price) {
        this.brand = brand;
        this.length = length;
        this.color = color;
        this.price = price;
    }

    public void self(){
        System.out.println(this.brand+"的长度为"+this.length+",颜色为"+this.color+",价格为"+price);
    }
}
