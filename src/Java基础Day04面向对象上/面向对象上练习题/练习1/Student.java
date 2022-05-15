package Java基础Day04面向对象上.面向对象上练习题.练习1;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-04 11:46
 * @Description:
 **/
/*
编写一个Student类，包含name、gender、age、id、score属性，分别为String、String、int、int、double类型。
类中声明一个say方法，返回String类型，方法返回信息中包含所有属性值。
在另一个StudentTest类中的main方法中，创建Student对象，并访问say方法和所有属性，并将调用结果打印输出。
 */
public class Student {
    private String name;
    private String gender;
    private int age;
    private int id;
    private double score;
    public Student(){

    }

    public Student(String name, String gender, int age, int id, double score) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.score = score;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say(){
//        System.out.println("姓名:"+name+"性别:"+gender+"年龄:"+age+"学号:"+id+"成绩:"+score);
        return "姓名:"+name+"\t"+"性别:"+gender+"\t"+"年龄:"+age+"\t"+"学号:"+id+"\t"+"成绩:"+score;
    }
}
