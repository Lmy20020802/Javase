package Java小白编程题;

import java.net.SecureCacheResponse;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-06 19:25
 * @Description:
 **/
/*
练习题: 手机选号:根据用户输入的手机号来确认用户实际支付的价格
如果尾数为8，需支付办卡费50元
如果尾数为4，需支付办卡费用0元
如果是其他尾号,需支付办卡费用20元
 */
public class Test18 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入手机号:");
        String phone=scan.next();
        if(phone.length()!=11)
        {
            System.out.println("电话号码长度有误!");
            return;
        }
        /*比如我们拿到的手机号是tel="2313123123",想要拿到尾数,也就是最后一个字符
         * 需要用到 char c = tel.charAt(10)
         * 注意:由于下标也是从0开始,所以取第11个字符，它的下标位置是10
         */
        //3.2获取手机号的尾数
        char c=phone.charAt(10);
        int price=0;
        switch (c){
            case '8':
                price+=50;
            case '4':
                price+=0;
            default:
                price+=20;
        }
        System.out.println(price);
    }
}
