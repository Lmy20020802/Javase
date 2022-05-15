package Java基础Day05面向对象中.super关键字;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-06 10:56
 * @Description:
 **/
public class Person {
    String name;
    int age;
    int id=1001;//身份证号
    public Person(){
        System.out.println("我无处不在");
    }
    public Person(String name){
        this.name=name;
    }
    public Person(String name,int age)
    {
     this(name);
     this.age=age;
    }
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void walk(){
        System.out.println("人可以走路");
    }
}
