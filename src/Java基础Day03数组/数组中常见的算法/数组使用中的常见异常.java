package Java基础Day03数组.数组中常见的算法;
/*
 * 数组中的常见异常：
 * 1. 数组角标越界的异常：ArrayIndexOutOfBoundsExcetion
 *
 * 2. 空指针异常：NullPointerException
 *
 */
public class 数组使用中的常见异常 {
    public static void main(String[]args){
        int[] arr=new int[]{1,2,3,4,5};
//        1. 数组角标越界的异常：ArrayIndexOutOfBoundsExcetion
//        情况一
//        for (int i=0;i<=arr.length;i++)
//        {
//            System.out.println(arr[i]);
//        }

//        情况二
//        System.out.println(arr[-2]);

        //2. 空指针异常：NullPointerException
        //情况一
//        int [] arr1=new int[]{1,2,3};
//        arr1=null;
//        System.out.println(arr1[0]);

//        情况二
//        int[][] arr2=new int[4][];
//        System.out.println(arr2[0]); //null
//        System.out.println(arr2[0][0]);//空指针

//        情况三
//        String[] arr3=new String[]{"AA","BB","CC"};
//        System.out.println(arr3[0].toString()); //AA
//        arr3[0]=null;
//        System.out.println(arr3[0].toString()); //空指针
    }
}
