package Java基础Day05面向对象中.super关键字.练习.练习1;

import Java基础Day04面向对象上.综合练习2.Bank;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-06 13:05
 * @Description:
 **/
/*
写一个名为 Account 的类模拟账户。该类的属性和方法如下图所示。该类包括的属性：
账号 id，余额 balance，年利率 annualInterestRate；包含的方法：访问器方法（getter 和
setter 方法），返回月利率的方法 getMonthlyInterest()，取
 */
public class Account {
    private int id;//账号
    private double balance;//余额
    private double annuallnterestRate;//年利率

    public Account(int id, double balance, double annuallnterestRate) {
        super();
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }

    //月利率
    public double getMonthlyInterest() {
        return annuallnterestRate/12;
    }
    public void withdraw(double amount)
    {
        if (balance>=amount)
        {
            balance-=amount;
            return;
        }
        System.out.println("余额不足");
    }
    public void deposit(double amount)
    {
        if (amount>0)
        {
            balance+=amount;
        }
    }
}
