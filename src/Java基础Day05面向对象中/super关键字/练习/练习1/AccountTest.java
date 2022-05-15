package Java基础Day05面向对象中.super关键字.练习.练习1;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-06 14:07
 * @Description:
 **/
public class AccountTest {
    public static void main(String[] args) {
        Account acct=new Account(1122,20000,0.045);
        acct.withdraw(30000);
        System.out.println("您的账户余额为:"+acct.getBalance());
        acct.withdraw(2500);
        System.out.println("您的账户余额为:"+acct.getBalance());
        acct.deposit(3000);
        System.out.println("您的账户余额为:"+acct.getBalance());
        System.out.println("月利率为:"+(acct.getMonthlyInterest()*100)+"%");
    }
}
