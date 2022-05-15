package Java小白编程题;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-05 19:40
 * @Description:
 **/
/*
已知小红同学有25元，她攒了几天钱之后发现自己的现在的钱比原来的2倍还多出10块。
而小蓝同学有30元，他攒了几天钱之后发现自己的钱正好是原来的2倍。于是小胖说：
小红和小蓝现在的钱一样多，请问，他说的对吗？
 */
public class Test6 {
    public static void main(String[]args)
    {
        int redStudent=25*2+10;
        int blueStudent=30*2;
        if (redStudent==blueStudent)
        {
            System.out.println("对");
        }else {
            System.out.println("错");
        }
    }
}
