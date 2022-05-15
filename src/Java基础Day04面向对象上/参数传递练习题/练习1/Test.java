package Java基础Day04面向对象上.参数传递练习题.练习1;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-11 22:59
 * @Description:
 **/
public class Test {
    public static void leftshift(int i, int j){
        i+=j;
    }
    public static void main(String args[]){
        int i = 4, j = 2;
        leftshift(i, j);
        System.out.println(i);
    }

}
