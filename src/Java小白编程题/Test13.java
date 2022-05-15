package Java小白编程题;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-05 20:15
 * @Description:
 **/
/*
练习题：最优选择2
小蓝同学想买一个价值8888元的新手机，她的旧手机在二手市场能卖1880元，而手机
专卖店推出以旧换新的优惠，把她的旧手机交给店家，新手机就能够打7.5折优惠。为了更省钱，小蓝要不要以旧换新？
 */
public class Test13 {
    public static void main(String[]args)
    {
        double area1=8888-1880;
        double area2=8888*0.75;
        if (area1>area2)
        {
            System.out.println("以旧换新更划算");
        }else {
            System.out.println("卖给二手市场更划算");
        }
    }
}
