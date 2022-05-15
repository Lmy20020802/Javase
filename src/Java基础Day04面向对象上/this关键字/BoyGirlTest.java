package Java基础Day04面向对象上.this关键字;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-04 08:21
 * @Description:
 **/
public class BoyGirlTest {
    public static void main(String[]args)
    {
        Boy boy=new Boy("罗密欧",21);
        boy.shout();
        Girl girl=new Girl("朱丽叶",18);
        girl.marry(boy);
        Girl girl1=new Girl("祝英台",19);
        int compare=girl.compare(girl1);
        if (compare>0)
        {
            System.out.println(girl.getName()+"大");
        }else if(compare<0){
            System.out.println(girl1.getName()+"大");
        }else {
            System.out.println(girl.getName()+"和"+ girl1.getName()+"一样大");
        }
    }
}
