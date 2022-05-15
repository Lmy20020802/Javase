package Java基础编程练习题50道答案.Test11到20;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-20 14:45
 * @Description:
 **/
public class Test11 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    // 保证三位数中的每一位都不相同
                    if (i != j && i != k && j != k) {
                        System.out.print("" + array[i] + array[j] + array[k] + " ");
                        num++;
                    }
                }
            }
        }
        System.out.println("\n一共有：" + num + "个");
    }
}

