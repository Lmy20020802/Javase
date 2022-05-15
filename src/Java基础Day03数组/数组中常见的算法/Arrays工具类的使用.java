package Java基础Day03数组.数组中常见的算法;

import java.util.Arrays;

/*
 * java.util.Arrays:操作数组的工具类，里面定义了很多操作数组的方法
 *
 *
 */
public class Arrays工具类的使用 {
  public static void main(String[] args) {
//   boolean equals(int[] a,int[] b)  判断两个数组是否相等。
     int[] arr1=new int[]{1,2,3,4};
     int[] arr2=new int[]{1,3,2,4};
     boolean isEquals= Arrays.equals(arr1,arr2);
     System.out.println(isEquals);

//    String toString(int[] a)  输出数组信息。
    System.out.println(Arrays.toString(arr1));
//    void fill(int[] a,int val) 将指定值填充到数组之中。
    Arrays.fill(arr1,10);
    System.out.println(Arrays.toString(arr1));
    //void sort(int[] a) 对数组进行排序。
    Arrays.sort(arr2);
    System.out.println(Arrays.toString(arr2));
//    int binarySearch(int[] a,int key)  对排序后的数组进行二分法检索指定的值。
    int [] arr=new int[]{-98,-34,2,34,54,66,79,105};
    int index=Arrays.binarySearch(arr,105);
    System.out.println(index);
  }
}

