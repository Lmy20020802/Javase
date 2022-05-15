package Java基础Day06面向对象下.接口.JDK8新特性;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-22 21:55
 * @Description:
 **/
public interface CompareB {

    default void method(){
        System.out.println("CompareB:上海");
    }
}
