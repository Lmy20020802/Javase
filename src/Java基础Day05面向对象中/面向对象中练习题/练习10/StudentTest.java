package Java基础Day05面向对象中.面向对象中练习题.练习10;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-19 08:23
 * @Description:
 **/
public class StudentTest {
    public static void main(String[] args) {
        Person p1=new Person("李铭洋",19);
        Student s1=new Student("王婷婷",23,1001,100);
        p1.say();
        s1.say();
    }
}
