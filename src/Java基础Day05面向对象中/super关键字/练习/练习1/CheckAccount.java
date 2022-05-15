package Java基础Day05面向对象中.super关键字.练习.练习1;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-06 14:13
 * @Description:
 **/
/*
2、创建 Account 类的一个子类 CheckAccount 代表可透支的账户，该账户中定义一个属性
overdraft 代表可透支限额。在 CheckAccount 类中重写 withdraw 方法，其算法如下：
 */
public class CheckAccount extends  Account{
    private double overdrart;
    public CheckAccount(int id, double balance, double annuallnterestRate,double overdrart) {
        super(id, balance, annuallnterestRate);
        this.overdrart=overdrart;
    }

    public double getOverdrart() {
        return overdrart;
    }

    public void setOverdrart(double overdrart) {
        this.overdrart = overdrart;
    }

    @Override
    public void withdraw(double amount)
    {//余额就足够消费
        if (getBalance()>=amount)
        {
            //方式一
//            setBalance(getBalance()-amount);
            //方式二
            super.withdraw(amount);
        }else if (overdrart>=amount-getBalance()){ //透支额度+余额足够消费
            overdrart-=(amount-getBalance());
            setBalance(0);
            //或
//            super.withdraw(getBalance());
        }else {
            System.out.println("超过可透支限额！");
        }
    }
}
