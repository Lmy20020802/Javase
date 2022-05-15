package Java小白编程题;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-05 19:42
 * @Description:
 **/
/*
某小伙想定一份外卖，商家的优惠方式如下：鱼香肉丝单点24元，油炸花生米单点8元，米饭单点3元。订单满30元8折优惠。鱼香肉丝优
惠价16元，但是优惠价和折扣不能同时使用。那么这个小伙要点这三样东西，最少要花多少钱？
 */
public class Test8 {
    public static void main(String[]args)
    {
        double area1=16+8+3;
        double area2=(24+8+3)*0.8;
        if (area1<area2){
            System.out.println("最少需要花:"+area1);
        }else {
            System.out.println("最少需要花:"+area2);
        }
    }
}
