package Java基础Day05面向对象中.Debug;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-05 19:12
 * @Description:
 **/
/*
 * 如何调试程序：
 * 1. System.out.println().
 * 2. Eclipse - Debug调试
 *
 */
public class DebugTest {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        System.out.println("i = " + i + ", j = " + j);

        DebugTest test = new DebugTest();
        int max = test.getMax(i, j);

        System.out.println("max = " + max);
    }

    private int getMax(int k, int m) {
        int max = 0;
        if (k < m) {
            max = m;
        } else {
            max = k;
        }
        return max;
    }

}
