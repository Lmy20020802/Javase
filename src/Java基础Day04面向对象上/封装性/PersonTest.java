package Java基础Day04面向对象上.封装性;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-02 20:12
 * @Description:
 **/
public class PersonTest {
    public static void main(String[]args)
    {
        Person p1=new Person();
//        p1.age=1 编译不通过
//        p1.setAge(12);
        System.out.println("年龄为:"+p1.getAge());
        Person p2=new Person("Tom",21);
        System.out.println("name="+p2.getName()+",age="+p2.getAge());
    }
}
