package Java基础Day06面向对象下.接口.JDK8新特性;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-22 21:35
 * @Description:
 **/
/*
JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法（略）
 */
public interface CompareA {

    //静态方法
    public static void method1(){
        System.out.println("CompareA:北京");
    }

    //默认方法
    public default void method2(){
        System.out.println("CompareA:上海");
    }

    default void method3(){
        System.out.println("CompareA:上海");
    }
}
