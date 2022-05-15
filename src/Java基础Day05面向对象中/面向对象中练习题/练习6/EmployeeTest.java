package Java基础Day05面向对象中.面向对象中练习题.练习6;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-17 23:22
 * @Description:
 **/
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1=new Employee("李铭洋",1001,2000,"staff");
        Employee employee2=new Employee("王婷婷",1002,3000,"manager");
        employee1.bouns();
        employee2.bouns();
    }
}
