package Java基础Day05面向对象中.继承性.练习1;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-05 10:13
 * @Description:
 **/
public class KidTest {
    public static void main(String[]args)
    {
        Kids someKid=new Kids(19);
        someKid.printAge();
        someKid.setSalary(0);
        someKid.setSex(1);
        someKid.employeed();
        someKid.manOrWoman();
    }
}
