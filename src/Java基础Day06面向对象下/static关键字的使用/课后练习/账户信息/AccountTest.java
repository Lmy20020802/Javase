package Java基础Day06面向对象下.static关键字的使用.课后练习.账户信息;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-11 11:40
 * @Description:
 **/

public class AccountTest {

    public static void main(String[] args) {

        Account acct1 =  new Account();
        Account acct2 =  new Account("qwerty",2000);

        Account.setInterestRate(0.012);
        Account.setMinMoney(100);

        System.out.println(acct1);
        System.out.println(acct2);

        System.out.println(acct1.getInterestRate());
        System.out.println(acct1.getMinMoney());
    }

}

