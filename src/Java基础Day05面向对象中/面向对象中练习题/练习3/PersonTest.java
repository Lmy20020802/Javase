package Java基础Day05面向对象中.面向对象中练习题.练习3;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-12 10:01
 * @Description:
 **/
public class PersonTest {
    public static void main(String[] args) {
        Person p1=new Person("420602","男","李铭洋",19,"湖北","2002-08-02");
        Person p2=new Person("420602","男","李铭洋",19,"湖北","2002-08-02");
        System.out.println(p1==p2);
    }
}
