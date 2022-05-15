package Java基础Day05面向对象中.super关键字;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-06 10:56
 * @Description:
 **/
public class Student extends Person {
    String major;
    int id=1002;//学号
    public Student() {

    }

    public Student(String major) {
        this.major = major;
    }
    public Student(String name,int age,String major)
    {
        super(name);
        this.age=age;
        this.major=major;
    }
    @Override
    public void eat() {
        System.out.println("多吃有营养的食物");
    }
    public void study() {
        System.out.println("学生学习知识");
        this.eat();
        super.eat();
    }
    public void show(){
        System.out.println("name="+name+",age="+age);
        System.out.println("id="+id);
        System.out.println("id="+super.id);
    }
}
