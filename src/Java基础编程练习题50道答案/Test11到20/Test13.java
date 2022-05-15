package Java基础编程练习题50道答案.Test11到20;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-20 19:25
 * @Description:
 **/
/**
 * @author Javier House
 * 一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少
 * 分析：
 *  按照给题的思路
 *  假设这个整数是i
 *  定义两个未知数为num1 num2
 *  num1 = (i + 100) * (i + 100)
 *  num2 = (i + 100 + 168) * (i + 100 + 168)
 *  因为不知道i为多少的情况,所以我们从0-100000遍历i来计算num1与录num2是否符合要求
 */
public class Test13 {
    public static void main(String[] args) {
        //duoble num1 num2
        double num1,num2;
        //循环计算i是否符合要求
        for (int i = 0; i < 100000; i++) {
            //得到i循环的num值
            num1 = Math.sqrt((i + 100));
            num2 = Math.sqrt((i + 268));
            //判断num是否为整数
            if (num1 == (int)num1 && num2 == (int)num2 ) {
                System.out.println(i);
            }
        }
    }
}
