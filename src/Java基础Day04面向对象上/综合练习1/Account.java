package Java基础Day04面向对象上.综合练习1;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-04 09:20
 * @Description:
 **/
public class Account {
    private int id;//账号
    private double balance;//余额
    private double annualInterestRate;//年利率

    public  Account(int id,double balance,double annualInterestRate)
    {
        this.id=id;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void withdreaw(double amount)  //取钱
    {
        if (balance>=amount)
        {
            balance-=amount;
            System.out.println("成功取出:"+amount);
        }else {
            System.out.println("余额不足,取款失败");
        }
    }
    public void deposit(double amount){
        if (amount>0)
        {
            balance+=amount;
            System.out.println("成功存入:"+amount);
        }
    }
}
