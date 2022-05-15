package Java基础Day04面向对象上.面向对象上练习题.练习2;

import javax.swing.text.Style;

/**
 * Created with IntelliJ IDEA.
 *
  * @date 2021-12-04 12:00
 * @Description:
 **/
public class Wife {
    private String name;
    private String gender;
    private int age;
    private Husband husband;

    public Wife(String name, String gender, int age, Husband husband) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.husband = husband;
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

    public Husband getHusband() {
        return husband;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }
    public void getInfo()
    {
        System.out.println("姓名：" + name + "\n性别：" +gender + "\n年龄：" + age + "\n丈夫：" +husband.getName()+"\n性别:"+
                husband.getGender()+"\n年龄:"+husband.getAge());
    }
}
