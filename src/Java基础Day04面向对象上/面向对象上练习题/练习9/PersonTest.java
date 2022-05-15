package Java基础Day04面向对象上.面向对象上练习题.练习9;

import javax.swing.text.Style;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-11 21:28
 * @Description:
 **/
public class PersonTest {
    public static void main(String[] args) {
        Person p1=new Person("黄若慈","女",17);
        p1.self();
        p1.eat();
    }
}
class Person{
    String name;
    String sex;
    int age;
    public Person(){

    }
    public Person(String name,String sex,int age)
    {
     this.name=name;
     this.sex=sex;
     this.age=age;
    }
    public void self(){
        System.out.println("我叫"+name+",我今年"+age+"岁了,我是一个"+sex+"孩");
    }
    public void eat(){
        System.out.println("猛男喜欢吃小女孩");
    }
}