package Java基础Day06面向对象下.抽象类与抽象方法.练习.练习1;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-13 18:00
 * @Description:
 **/
public class EmployeeTest {
    public static void main(String[] args) {
        //多态
        Employee manager=new Manager("库克",1001,5000,50000);
        manager.work();
        Employee commonEmployee=new CommonEmployee();
        commonEmployee.work();
    }
}
