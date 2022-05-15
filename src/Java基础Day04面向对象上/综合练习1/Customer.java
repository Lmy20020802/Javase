package Java基础Day04面向对象上.综合练习1;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-04 09:28
 * @Description:
 **/
public class Customer {
    private String firstName;
    private String lastName;
    private  Account account;
    public Customer(String firstName,String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String getFirstName(){
        return  firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
