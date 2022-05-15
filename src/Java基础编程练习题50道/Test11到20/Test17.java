package Java基础编程练习题50道.Test11到20;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-20 21:15
 * @Description:
 **/
/*
题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个 第二天早上又将剩
下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下
的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
 */
public class Test17 {
    public static void main(String[] args) {
        int num=1;
        int i=1;
        for (i=1;num<=9;num++)
        {
            i=(i+1)*2;
        }
        System.out.println(i);
    }
}
