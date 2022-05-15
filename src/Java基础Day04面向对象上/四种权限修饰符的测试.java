package Java基础Day04面向对象上;

import Java基础Day04面向对象上.封装性.四种权限修饰符;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-02 20:01
 * @Description:
 **/
public class 四种权限修饰符的测试 {
    public static void main(String[]args)
    {
        四种权限修饰符 test=new 四种权限修饰符();
        //出了包就不能用了缺省的私有的结构就不可以调用了
//      test.orderDefault=1;
        test.orderPublic=2;
//        test.orderPrivate
    }
}
