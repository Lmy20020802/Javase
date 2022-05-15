package Java基础Day04面向对象上.面向对象上练习题.练习7;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-11 20:36
 * @Description:
 **/
/*
设计一个Dog类，有名字、颜色和年龄属性，定义构造器初始化这些属性，定义输出方法show()显示其信息。
提供无参的构造器和一个有参的构造器
 */
public class DogTest {
    public static void main(String[] args) {
        Dog dog=new Dog("王婷婷","黄色",29);
        dog.show();
    }
}
class Dog{
    String name;
    String color;
    int age;
    public Dog(){

    }
    public Dog(String name,String color,int age)
    {
        this.name=name;
        this.color=color;
        this.age=age;
    }
    public void show(){
        System.out.println("name:"+this.name+" color:"+this.color+" age:"+age);
    }

}
