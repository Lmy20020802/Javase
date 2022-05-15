package Java基础Day05面向对象中.面向对象中练习题.练习8;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-18 21:39
 * @Description:
 **/
public class PersonTest {
    public static void main(String[] args) {
        Student s1=new Student("李铭洋","男",19,"1001");
        Student s2=new Student("王婷婷","女",23,"1002");
        Student s3=new Student("李铭洋","男",22,"1001");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
