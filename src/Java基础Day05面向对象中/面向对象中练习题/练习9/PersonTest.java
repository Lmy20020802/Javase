package Java基础Day05面向对象中.面向对象中练习题.练习9;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-18 21:54
 * @Description:
 **/
public class PersonTest {
    public static void main(String[] args) {
        Person p1=new Person("唐僧",150,"法杖","人族");
        Person p2=new Person("孙悟空",200,"棍棒","仙族");
        Person p3=new Person("白骨精",140,"扇子","妖族");
        p1.walk();
        p1.skill();
        p2.walk();
        p2.skill();
        p3.walk();
        p3.skill();
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }
}
