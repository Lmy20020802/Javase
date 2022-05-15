package Java基础Day04面向对象上.构造器;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-03 12:58
 * @Description:
 **/
public class TriAngleTest {
    public static void main(String[]args)
    {
        TriAngle t1=new TriAngle();
        t1.setBase(2.0);
        t1.setHeight(2.4);
//        t1.base=2.5;
//        t1.height=4.3;
        System.out.println("base:"+t1.getBase()+",height:"+t1.getHeight());

        TriAngle t2=new TriAngle(5.1,5.6);
        System.out.println("base:"+t2.getBase()+",height:"+t2.getHeight());
    }

}
