package Java基础Day04面向对象上.封装性;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-02 19:43
 * @Description:
 **/
public class 四种权限修饰符 {
    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    private void methodPrivate(){
        orderPrivate=1;
        orderDefault=2;
        orderPublic=3;
    }
    void methodDefalut(){
        orderPrivate=1;
        orderDefault=2;
        orderPublic=3;
    }
    public void methodPublic(){
        orderPrivate=1;
        orderDefault=2;
        orderPublic=3;
    }
}
