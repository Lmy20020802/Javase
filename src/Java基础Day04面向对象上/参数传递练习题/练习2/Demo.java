package Java基础Day04面向对象上.参数传递练习题.练习2;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-11 23:01
 * @Description:
 **/
public class Demo {
    public static void main(String[] args){
        int[] a=new int[1];
        modify(a);
        System.out.println(a[0]); //
    }
    public static void modify(int[] a){
        a[0]++;
    }
}
