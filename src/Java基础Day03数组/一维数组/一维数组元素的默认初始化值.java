package Java基础Day03数组.一维数组;
/*
 * ⑤ 数组元素的默认初始化值
 * 		> 数组元素是整型：0
 * 		> 数组元素是浮点型：0.0
 * 		> 数组元素是char型：0或'\u0000'，而非'0'
 * 		> 数组元素是boolean型：false
 *
 * 		> 数组元素是引用数据类型：null
 *
 *  ⑥ 数组的内存解析
 */
public class 一维数组元素的默认初始化值 {
    public static void main(String[]args)
    {
        //数组元素的默认初始化值
        int [] arr=new int[4];
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        short[] arr1=new short[4];
        for (int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }

        float[] arr2=new float[4];
        for (int i=0;i<arr2.length;i++)
        {
            System.out.println(arr2[i]);
        }

        char [] arr3=new char[4];
        for (int i=0;i<arr3.length;i++)
        {
            System.out.println("----"+arr3[i]+"****");
        }

        boolean[] arr4=new boolean[5];
        for (int i=0;i<arr4.length;i++)
        {
            System.out.println(arr4[i]);
        }

        String [] arr5=new String[5];
        for (int i=0;i< arr5.length;i++)
        {
            System.out.println(arr5[i]);
        }
    }
}
