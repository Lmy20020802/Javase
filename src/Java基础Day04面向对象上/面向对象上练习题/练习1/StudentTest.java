package Java基础Day04面向对象上.面向对象上练习题.练习1;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-04 11:51
 * @Description:
 **/
public class StudentTest {
    public static void main(String[]args)
    {
        Student stu=new Student("李铭洋","男",19,1001,100);
        Student stu1=new Student("王婷婷","女",23,1002,100);
        System.out.println(stu.say());
        System.out.println(stu1.say());
    }
}
