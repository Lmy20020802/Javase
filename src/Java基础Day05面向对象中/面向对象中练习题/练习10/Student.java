package Java基础Day05面向对象中.面向对象中练习题.练习10;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-19 08:20
 * @Description:
 **/
public class Student extends Person{
    private int id;
    public double score;

    public Student() {
    }

    public Student(String name, int age,int id,double score) {
        super(name, age);
        this.id=id;
        this.score=score;
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

    @Override
    public void say() {
        System.out.println("姓名:"+getName()+"\t年龄:"+getAge()+"\t学号:"+getId()+"\t成绩:"+getScore());
    }
}
