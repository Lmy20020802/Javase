package Java基础Day04面向对象上.封装性;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-02 20:07
 * @Description:
 **/
public class Person {
//        1.创建程序,在其中定义两个类：Person和PersonTest类。定义如下：
//        用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
//        在 PersonTest 类 中实例化 Person 类的对象 b ， 调 用 setAge() 和
//        getAge()方法，体会Java的封装性。
//    1. 在前面定义的Person类中添加构造器，利用构造器设置所有人的age属 性初始值都为18。

    private int age;
    private String name;
    public Person(){
        age=18;
    }
    public Person(String n,int a)
    {
        name=n;
        age=a;
    }

    public void setAge(int a)
    {
        if (a<0&&a>130)
        {
//            throw new RuntimeException("传入的数据非法");
            System.out.println("传入的数据非法");
            return;
        }else {
            age=a;
        }
    }
    public int getAge(){
        return age;
    }

    //绝对不要这样写!!
//    public int doAge(int a)
//    {
//        age=a;
//        return age;
//    }
    public void setName(String n)
    {
        name=n;
    }
    public String getName(){
        return name;
    }

}
