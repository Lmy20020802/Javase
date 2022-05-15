package Java基础Day06面向对象下.抽象类与抽象方法.练习.练习1;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-13 17:52
 * @Description:
 **/
public class Manager extends Employee{
    private double bouns;//奖金

    public Manager(double bouns){
        super();
        this.bouns=bouns;
    }
    public Manager(String name,int id,double salary,double bouns)
    {
        super(name, id, salary);
        this.bouns=bouns;
    }
    @Override
    public void work() {
        System.out.println("管理员工,提高公司运行的效率");
    }
}
