package Java基础编程练习题50道;
import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-22 16:26
 * @Description:
 **/
/*
题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
 */
public class Test35 {
/*
	2017年3月9日17:09:36
	java基础50道经典练习题 例35
	Athor: ZJY
	Purpose:
	【程序35】
  题目：输入数组，最大的与第一个元素交换，
  最小的与最后一个元素交换，输出数组。
*/

        public static void main(String[] args)
        {
            int[] array = new int[50];
            System.out.print("请输入一串数组: ");
            Scanner sc = new Scanner(System.in).useDelimiter("\\s");
            int len = 0;
            for (len=0; len<20; len++) {
                if(sc.hasNextInt()) {
                    array[len] = sc.nextInt();
                }else {
                    break;
                }
            }
            sc.close();

            int maxIndex = 0;
            int minIndex = 0;
            int maxTemp = array[0];
            int minTemp = array[0];
            for (int j=0; j<len; j++) {
                if(maxTemp < array[j]) {
                    maxTemp = array[j];
                    maxIndex = j;
                }
                if(minTemp > array[j]) {
                    minTemp = array[j];
                    minIndex = j;
                }
            }
            array[maxIndex] = array[0];
            array[minIndex] = array[len-1];
            array[0] = maxTemp;
            array[len-1] = minTemp;

            int[] array1 = new int[len];
            for(int i=0; i<len; i++)
                array1[i] = array[i];
            print(array1);

        }
        //打印
        private static void print(int[] array) {
            for (int i=0; i<array.length; i++) {
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }
    }
