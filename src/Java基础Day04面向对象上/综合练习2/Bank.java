package Java基础Day04面向对象上.综合练习2;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-04 10:04
 * @Description:
 **/
public class Bank {
    private Customer[] customers; //存放多个客户的数组
    private int numberOfCustomer; //记录客户的个数
    public Bank(){
        customers=new Customer[10];
    }
    //添加客户
    public void addCustomer(String f,String l)
    {
        Customer cust=new Customer(f,l);
//        customers[numberOfCustomer]=cust;
//        numberOfCustomer++;
        customers[numberOfCustomer++]=cust;
    }
    //获取客户的个数
    public int getNumberOfCustomer(){
        return numberOfCustomer;
    }
    //获取指定位置上的客户
    public Customer getCustomer(int index)
    {
//        return customers[index] 可能报异常
        if (index>=0&&index<numberOfCustomer)
        {
            return customers[index];
        }
        return null;
    }

}
