package Java基础Day04面向对象上.自定义工具类;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-01 11:36
 * @Description:
 **/
public class ArrayUtil {
    //求数组的最大值
    public int getMax(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    //求数组的最小值
    public int getMin(int[] arr)
    {
        int minValue=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(minValue>arr[i])
            {
                minValue=arr[i];
            }
        }
        return minValue;
    }
    //求数组的总和
    public int getSum(int[] arr)
    {
       int sumValue=0;
       for (int i=0;i<arr.length;i++)
       {
           sumValue+=arr[i];
       }
       return sumValue;
    }
    //求数组的平均值
    public int getAvg(int[] arr)
    {
        return getSum(arr)/arr.length;
    }
    //反转数组
    public void reverse(int[] arr){
        for (int i=0;i< arr.length/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
    }
    //方法的重载
    public void reverse(String[] arr)
    {

    }
    //复制数组
    public int[] copy(int[] arr)
    {
        int arr1[]=new int[arr.length];
        for (int i=0;i<arr.length;i++)
        {
            arr1[i]=arr[i];
        }
        return arr1;
    }
    //数组排序
    public void sort(int []arr){
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if (arr[j]>arr[j+1])
                {
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;

                    //正确的
                    swap(arr,j,j+1);
                }
            }
        }
    }
    //遍历数组
    public void print(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    //查找指定元素
    public int getIndex(int[] arr,int dest){
        for(int i=0;i<arr.length;i++)
        {
            if(dest==arr[i])
            {
                return i;
            }
        }
        return -1;//返回一个负数表示没有查到
    }

    //正确的
    public void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
