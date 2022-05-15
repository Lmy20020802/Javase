package Java基础Day05面向对象中.继承性.练习1;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-05 10:04
 * @Description:
 **/
public class Kids extends Mankind{
    private int yearsOld;
    public Kids(){

    }
    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println("I am "+yearsOld+"years old");
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    @Override
    public void employeed() {
        System.out.println("Kids should study and no job");
    }
}
