package Java基础Day05面向对象中.多态性.向下转型的使用;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-06 14:54
 * @Description:
 **/
public class Man extends Person {
    boolean isSmoking;
    int id=1001;
    public void earnMoney(){
        System.out.println("男人负责挣钱养家");
    }
    public void eat(){
        System.out.println("男人多吃肉,长肌肉");
    }
    public void walk(){
        System.out.println("男人霸气的走路");
    }
}
