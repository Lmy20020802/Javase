package Java基础Day05面向对象中.super关键字.练习.练习1;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-06 14:30
 * @Description:
 **/
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount acct = new CheckAccount(1122, 20000, 0.045, 5000);
        acct.withdraw(5000);
        System.out.println("您的账户余额:"+acct.getBalance());
        System.out.println("您的可透支额:"+acct.getOverdrart());
        acct.withdraw(18000);
        System.out.println("您的账户余额:"+acct.getBalance());
        System.out.println("您的可透支额:"+acct.getOverdrart());
        acct.withdraw(3000);
        System.out.println("您的账户余额:"+acct.getBalance());
        System.out.println("您的可透支额:"+acct.getOverdrart());
    }
}
