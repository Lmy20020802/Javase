package Java基础编程练习题50道答案;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-22 13:10
 * @Description:
 **/
/*
	2017年3月8日17:05:45
	java基础50道经典练习题 例31
	Athor: ZJY
	Purpose:
	【程序31】
	题目：将一个数组逆序输出。
	程序分析：用第一个与最后一个交换。
*/
public class Test31
{
    public static void main(String[] args)
    {
        int[] array = new int[]{25, 14, 32, 8, 10, 13};
        print(array);
        int[] array1 = inverted(array);
        print(array1);
    }
    private static int[] inverted(int[] array) {
        int temp = 0;
        for (int i=0; i<array.length; i++) {
            if(i == array.length/2)
                break;
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        return array;
    }
    //打印
    private static void print(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}