package Java基础Day05面向对象中.面向对象中练习题.练习6;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-17 23:15
 * @Description:
 **/
public class Employee {
    private String name;
    private int id;
    private double salary;
    private String post;

    public void bouns(){
        if (post=="staff")
        {
            System.out.println(salary*1.5);
        }else{
            System.out.println(salary*2);
        }
    }
    public Employee(){

    }
    public Employee(String name, int id, double salary, String post) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
