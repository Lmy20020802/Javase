package Java基础Day04面向对象上.值传递;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-02 08:52
 * @Description:
 **/
public class 值传递机制的练习 {
    public static void main(String[]args)
    {
        值传递机制的练习 test=new 值传递机制的练习();
        test.first();
    }
    public void first() {
        int i = 5;
        Value v = new Value();
        v.i = 25;
        second(v, i);
        System.out.println(v.i);
    }
    public void second(Value v, int i) {
        i = 0;
        v.i = 20;
        Value val = new Value();
        v = val;
        System.out.println(v.i + " " + i);
    }
}
class  Value{
    int i=15;
}