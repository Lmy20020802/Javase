package Java小白编程题;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-08 09:40
 * @Description:
 **/
/*练习题:多次生成随机数,并打印第一次出现大于0.999 时的次数与生成的随机数
 */
public class Test23 {
    public static void main(String[] args) {
        for (int i=0;;i++)
        {
            double num=Math.random();
            if (num>0.999)
            {
                System.out.println("第"+i+"次产生目标值"+num);
                break;
            }
        }
    }
}
