package Java基础Day04面向对象上.练习;

public class PersonTest {
    public static void main(String[] args) {
         Person p1=new Person();
         p1.name="lmy";
         p1.age=18;
         p1.sex=6;
         p1.study();
         p1.showAge();
         int newAge=p1.addAge(2);
         System.out.println(p1.name+"的新年龄为:"+newAge);
         Person p2=new Person();
         System.out.println(p2.age);
    }
}
