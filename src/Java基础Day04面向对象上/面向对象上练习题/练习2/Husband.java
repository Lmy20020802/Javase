package Java基础Day04面向对象上.面向对象上练习题.练习2;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-04 11:57
 * @Description:
 **/
/*
编程题1
定义一个丈夫Husband类，有姓名、年龄、妻子属性
定义一个妻子Wife类，有姓名、年龄、丈夫属性
丈夫类中有一个getInfo方法，其中，能显示自己的姓名，年龄，和他的妻子的姓名，年龄
妻子类中有一个getInfo方法，其中，能显示自己的姓名，年龄，和她的丈夫的姓名，年龄
定义一个测试类，创建妻子和丈夫对象，然后测试
 */
public class Husband {
    private String name;
    private String gender;
    private int age;
    private Wife wife;
    public Husband(String name, String gender, int age, Wife wife) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.wife = wife;
    }
    public void getInfo()
    {
        System.out.println("姓名：" + name + "\n性别：" +gender + "\n年龄：" + age + "\n妻子：" + wife.getName()+"\n性别:"+
                wife.getGender()+"\n年龄:"+wife.getAge());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }
}
