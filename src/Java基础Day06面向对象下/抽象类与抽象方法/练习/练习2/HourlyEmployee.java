package Java基础Day06面向对象下.抽象类与抽象方法.练习.练习2;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-14 14:57
 * @Description:
 **/
public class HourlyEmployee extends Employee{
    private int wage;//每小时的工资
    private int hour;//月工作的小时数

    public HourlyEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }
    public HourlyEmployee(String name, int number, MyDate birthday,int wage,int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public int getWage() {
        return wage;
    }
    public void setWage(int wage) {
        this.wage = wage;
    }
    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    @Override
    public double earnings() {
        return wage * hour;
    }

    public String toString(){
        return "HourlyEmployee[" + super.toString() + "]";
    }
}
