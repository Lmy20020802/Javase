package Java基础Day04面向对象上.构造器;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-03 13:11
 * @Description:
 **/
public class StudentTest {
    public static void main(String[]args)
    {
        Student s=new Student("李铭洋",19,"武汉船舶职业技术学院","计算机");
        System.out.println(s.getName()+"\t"+s.getAge()+"\t"+s.getSchool()+"\t"+s.getMajor());
    }
}
