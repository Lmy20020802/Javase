package Java基础Day06面向对象下.抽象类与抽象方法.练习.练习1;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-13 17:59
 * @Description:
 **/
public class CommonEmployee extends Employee{

    @Override
    public void work() {
        System.out.println("员工在一线车间生产产品");
    }
}
