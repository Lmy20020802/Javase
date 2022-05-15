package Java基础Day04面向对象上.练习;

public class Exer1Test {
    public static void main(String[]args)
    {
        Student s1=new Student();
        s1.name="lmy";
        s1.age=19;
        s1.major="计算机";
        s1.interests="男";
        s1.say();
        Teacher t1=new Teacher();
        t1.name="wtt";
        t1.age=23;
        t1.teachAge=1;
        t1.course="女";
        t1.say();
    }
}
class Student{
    String name;
    int age;
    String major;
    String interests;

    public  void say(){
        System.out.println(name+" "+age+" "+major+" "+interests);
    }
}
class Teacher{
    String name;
    int age;
    int teachAge;
    String course;

    public void say(){
        System.out.println(name+" "+age+" "+teachAge+" "+course);
    }
}
