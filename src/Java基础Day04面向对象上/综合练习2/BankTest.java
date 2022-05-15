package Java基础Day04面向对象上.综合练习2;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-04 10:28
 * @Description:
 **/
public class BankTest {
    public static void main(String[]args)
    {
        Bank bank=new Bank();
        bank.addCustomer("W","tt");
        bank.getCustomer(0).setAccount(new Account(2000));
        bank.getCustomer(0).getAccount().withdraw(500);
        double balance=bank.getCustomer(0).getAccount().getBalance();
        System.out.println("客户:"+bank.getCustomer(0).getFirstName()+bank.getCustomer(0).getLastName()+"\t账户余额为:"+balance);
        bank.addCustomer("L","my");
        bank.getCustomer(1).setAccount(new Account(2000));
        bank.getCustomer(1).getAccount().deposit(1000);
        double balance1=bank.getCustomer(1).getAccount().getBalance();
        System.out.println("客户:"+bank.getCustomer(1).getFirstName()+bank.getCustomer(1).getLastName()+"\t账户余额为:"+balance1);
        System.out.println("银行客户的个数为:"+bank.getNumberOfCustomer());
    }
}
