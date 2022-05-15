package Java高级day08反射.提供结构丰富的Person类;

/**
 * Created with IntelliJ IDEA.
 *
 * @author shkstart
 * @company 尚硅谷实习谷粉
 * @date 2022-01-17 08:38
 * @Description:
 * @name 李铭洋
 **/
@MyAnnotation(value = "hi")
public class Person extends Creature<String> implements Comparable<String>,MyInterface{

    private String name;
    int age;
    public int id;

    public Person(){

    }

    @MyAnnotation(value = "abc")
    public Person(String name)
    {
        this.name=name;
    }

    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    @MyAnnotation
    private String show(String nation){
        System.out.println("我的国籍是"+nation);
        return nation;
    }

    public String display(String insterets,int age)throws NullPointerException,ClassCastException{
        return insterets+age;
    }

    @Override
    public int compareTo(String s) {
        return 0;
    }

    @Override
    public void info() {
        System.out.println("我是一个人");
    }
}
