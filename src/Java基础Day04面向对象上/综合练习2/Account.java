package Java基础Day04面向对象上.综合练习2;

import Java基础Day04面向对象上.封装性.Person;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-04 09:53
 * @Description:
 **/
public class Account {
    private double balance;

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    //存钱
    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("存钱成功");
        }
    }
    //取钱操作
    public void withdraw(double amt)
    {
        if (balance>=amt)
        {
            balance-=amt;
            System.out.println("取钱成功");
        }else {
            System.out.println("余额不足");
        }
    }
}
