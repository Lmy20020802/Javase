package Java基础Day04面向对象上.封装性;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-02 19:43
 * @Description:
 **/
public class 四种权限修饰符的测试 {
    public static void main(String []args)
    {
        四种权限修饰符 test=new 四种权限修饰符();
        test.orderDefault=1;
        test.orderPublic=2;
        //出了类之后,私有的结构就不可以调用了
//        test.orderPrivate

    }
}
