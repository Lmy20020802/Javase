package Java基础Day06面向对象下.设计模式与单例设计模式;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-11 15:03
 * @Description:
 **/
/*
 * 单例模式的懒汉式实现
 *
 */
public class SingletonTest2 {
    public static void main(String[] args) {
        Order order1=Order.getInstance();
        Order order2=Order.getInstance();
        System.out.println(order1=order2);
    }
}
//懒汉式
class Order{
    //1.私有化类的构造器
    private Order(){

    }
    //2.先声明当前类对象,没有初始化
    private static Order instance=null;

    //3.声明public static的返回当前对象的方法
    public static Order getInstance(){
        if (instance==null){
            instance=new Order();
        }
        return instance;
    }
}