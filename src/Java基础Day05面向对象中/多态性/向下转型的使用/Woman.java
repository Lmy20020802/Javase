package Java基础Day05面向对象中.多态性.向下转型的使用;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-06 15:02
 * @Description:
 **/
public class Woman extends Person {
    boolean isBeauty;
    public void goShopping(){
        System.out.println("女人喜欢购物");
    }
    public void eat(){
        System.out.println("女人少吃,为了减肥");
    }
    public void walk(){
        System.out.println("女人窈窕的走路");
    }
}
