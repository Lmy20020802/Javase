package Java基础Day04面向对象上.面向对象上练习题.练习2;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-04 12:04
 * @Description:
 **/
public class HusbandWifeTest {
    public static void main(String[]args)
    {
        Husband husband=new Husband("李铭洋","男",19,null);
        Wife wife=new Wife("王婷婷","女",23,null);
        husband.setWife(wife);
        wife.setHusband(husband);
        husband.getInfo();
        System.out.println("**********************************");
        wife.getInfo();
    }
}
