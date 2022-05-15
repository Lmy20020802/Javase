package Java基础Day05面向对象中.多态性.多态性的使用;

import java.sql.Connection;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-07 09:43
 * @Description:
 **/
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test=new AnimalTest();
        test.fun(new Dog());
        AnimalTest test1=new AnimalTest();
        test1.fun(new Cat());
    }
    public void fun(Animal animal){//Animal animal=new Dog()
        animal.eat();
        animal.shout();
    }
}
class Animal{
    public void eat(){
        System.out.println("动物进食");
    }
    public void shout(){
        System.out.println("动物叫");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃骨头");
    }
    public void shout(){
        System.out.println("汪汪汪!");
    }
}
class Cat extends Animal{
    public void shout(){
        System.out.println("喵喵喵!");
    }
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
//举例二
class  Order{
    public void method(Object obj){

    }
}
//举例三
class Driver{
    public void doDate(Connection connection)
    {
//        connection.methoo1()
//        connection.methoo2()
//        connection.methoo3()
    }
}