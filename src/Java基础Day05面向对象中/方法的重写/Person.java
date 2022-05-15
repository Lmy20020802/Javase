package Java基础Day05面向对象中.方法的重写;

import org.w3c.dom.Attr;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-06 09:29
 * @Description:
 **/
public class Person {
    String name;
    int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("吃饭");
    }
    public void walk(int distance)
    {
     System.out.println("走路:走的距离是:"+distance+"公里");
     show();
     eat();
    }
    private void show(){
        System.out.println("我是一个人");
    }
    public Object info(){
        return null;
    }
}
