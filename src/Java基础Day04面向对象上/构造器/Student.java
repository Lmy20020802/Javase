package Java基础Day04面向对象上.构造器;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-03 13:06
 * @Description:
 **/
public class Student {
    private String name;
    private int age;
    private String school;
    private String major;

    public Student(){

    }
    public Student(String n,int a){
        name=n;
        age=a;
    }

    public Student(String n,int a,String s){
        name=n;
        age=a;
        school=s;
    }
    public Student(String n,int a,String s,String m)
    {
        name=n;
        age=a;
        school=s;
        major=m;
    }

    public void setAge(int age) {
        age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
       school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        major = major;
    }
}
