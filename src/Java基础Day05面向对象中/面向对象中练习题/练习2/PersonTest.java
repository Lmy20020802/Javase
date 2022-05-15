package Java基础Day05面向对象中.面向对象中练习题.练习2;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-18 10:45
 * @Description:
 **/
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Facutly();
        Person p2 = new Staff();
        if (p1 instanceof Facutly){
            Facutly p11 = (Facutly) p1;
            p11.setDegree("本科");
            System.out.println(p11.getDegree());
        }
        if (p2 instanceof Staff){
            Staff p22 = (Staff)p2;
            p22.setDuty("支援");
            System.out.println(p22.getDuty());
        }
    }
}
class Person{
    private String name;
    private String address;
    private String telphone;
    private String email;
}

class Employee extends Person{
    private String office;
    private double wage;
    private String hiredate;

}

class Facutly extends Employee{
    private String degree;
    private String level;

    public String getDegree() {
        return degree;
    }

    public String getLevel() {
        return level;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}

class Staff extends Employee{
    private String duty;

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }
}

