package Java基础Day04面向对象上.值传递;
/*
 * 可变个数形参的方法
 *
 * 1.jdk 5.0新增的内容
 * 2.具体使用：
 *   2.1 可变个数形参的格式：数据类型 ... 变量名
 *   2.2 当调用可变个数形参的方法时，传入的参数个数可以是：0个，1个,2个，。。。
 *   2.3 可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载
 *   2.4 可变个数形参的方法与本类中方法名相同，形参类型也相同的数组之间不构成重载。换句话说，二者不能共存。
 *   2.5 可变个数形参在方法的形参中，必须声明在末尾
 * 	 2.6 可变个数形参在方法的形参中,最多只能声明一个可变形参。
 *
 */
/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-01 19:33
 * @Description:
 **/
public class 可变个数形参的方法 {
    public static void main(String[]args)
    {
        可变个数形参的方法 test=new 可变个数形参的方法();
        test.show(12);
        test.show("hello");
        test.show("hello","world","java");
        test.show("AA","BB","CC");
//        test.show(12,10,5);
    }

    public void show(int i)
    {
        System.out.println("show(int)");
    }
    public void show(String s)
    {
        System.out.println("show(String)");
    }

    public void show(String...strs)
    {
        System.out.println("show(String)...strs");
        for(int i=0;i<strs.length;i++)
        {
            System.out.print(strs[i]);
        }
        System.out.println();
    }
//    public void show(int...i){
//        System.out.println("show(int)...i");
//    }

//    public void show(int i,String strs)
//    {
//
//    }
}
