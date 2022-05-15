package Java基础Day03数组;

import java.io.StringReader;

public class 每日一考 {
    public static void main(String[]args)
    {
//      1.写出一维数组初始化的两种方式
        //静态初始化
//        int [] arr=new int[]{1,2,3,4};
//        //动态初始化
//        int [] arr1=new int[4];

//      2.写出二维数组初始化的两种方式
//        int [][] arr=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
//        int [][] arr1=new int[4][3];

//        3.如何遍历如下的二维数组
//        int[][] arr = new int[][]{{1,2,3},{4,5},{6,7,8}};
//        int [][] arr = new int[][]{{1,2,3},{4,5},{6,7,8}};
//        for (int i=0;i<arr.length;i++)
//        {
//            for(int j=0;j<arr[i].length;j++)
//            {
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }

//        4.不同类型的一维数组元素的默认初始化值各是多少
        /*
         整型：0 浮点型：0.0 char型：0或'\u0000'，而非'0' boolean型：false 引用类型：null
         */

//        1.	使用冒泡排序，实现如下的数组从小到大排序。
//        int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
//        int[] arr=new int[]{34,5,22,-98,6,-76,0,-3};
//        for(int i=0;i<arr.length-1;i++)
//        {
//            for(int j=0;j<arr.length-1-i;j++)
//            {
//                if(arr[j]>arr[j+1])
//                {
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i]+"\t");
//        }

//        2.	如何反转上面的数组。请代码实现
//        int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
//        for(int i=0;i<arr.length/2;i++)
//        {
//            int temp=arr[i];
//            arr[i]=arr[arr.length-1-i];
//            arr[arr.length-1-i]=temp;
//        }
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i]+"\t");
//        }

//        3. 复制上述数组，得到一个新的数组
//        int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
//        int[] arr1= new int[arr.length];
//        for (int i=0;i<arr1.length;i++)
//        {
//            arr1[i]=arr[i];
//        }
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i]+"\t");
//        }
//        System.out.println();
//        for(int i=0;i<arr1.length;i++)
//        {
//            System.out.print(arr1[i]+"\t");
//        }
//        使用线性查找，从上述数组中查找22是否存在。存在，返回所在位置的索引。不存在，输出提示信息。
//        int num=22;
//        int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
//        boolean isFlay=true;
//        for (int i=0;i<arr.length;i++)
//        {
//            if (num==arr[i])
//            {
//                System.out.println("找到了,位置为:"+i);
//                isFlay=false;
//                break;
//            }
//        }
//        if(isFlay){
//            System.out.println("未找到");
//        }

    }
}
