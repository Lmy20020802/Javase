package Java基础Day04面向对象上.面向对象上练习题.练习4;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-11 16:34
 * @Description:
 **/
public class TestMethodExer {
    public static void main(String[] args) {
        Cylinder c1=new Cylinder();
        c1.setValue(2.0,3.0);
        c1.printDetails();
        System.out.println("底面积为"+c1.getArea());
        System.out.println("体积为"+c1.getVolume());
        boolean isFlag= c1.setRadiusAndHeight(-1,2);
        if (!isFlag)
        {
            System.out.println("赋值失败");
        }else {
            c1.printDetails();
        }
        boolean Flag=c1.setRadiusAndHeight(5,4);
        if (!Flag){
            System.out.println("赋值失败");
        }else{
            c1.printDetails();
        }
    }
}
