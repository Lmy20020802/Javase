package Java基础Day04面向对象上.综合练习1;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-04 09:33
 * @Description:
 **/
public class CustomerTest {
    public static void main(String[] args) {
        Customer cust = new Customer("Jane", "Smith");
        Account acct = new Account(1000, 2000, 0.0123);
        cust.setAccount(acct);
        cust.getAccount().deposit(100);
        cust.getAccount().withdreaw(960);
        cust.getAccount().withdreaw(2000);
        System.out.println("Customer[" + cust.getLastName() + "," + cust.getFirstName() +
                "] has a account: id is " + cust.getAccount().getId() + ",annualInterestRate is " +
                cust.getAccount().getAnnualInterestRate() * 100 + "% ,balance is " + cust.getAccount().getBalance());
    }
}
