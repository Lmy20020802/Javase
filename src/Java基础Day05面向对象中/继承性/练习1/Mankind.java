package Java基础Day05面向对象中.继承性.练习1;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-05 09:58
 * @Description:
 **/
public class Mankind {
    private  int sex;//性别
    private  int salary;//薪资
    public Mankind(){

    }
    public Mankind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public void manOrWoman(){
        if (sex==1){
            System.out.println("man");
        }else if(sex==0)
        {
            System.out.println("woman");
        }
    }
    public void employeed(){
        if (salary==0)
        {
            System.out.println("no job");
        }else if(salary!=0)
        {
            System.out.println("job");
        }
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
