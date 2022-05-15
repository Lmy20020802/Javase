package Java基础编程练习题50道;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-22 13:05
 * @Description:
 **/
/*
题目：将一个数组逆序输出。
 */
public class Test31 {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9};
        for (int i= arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
