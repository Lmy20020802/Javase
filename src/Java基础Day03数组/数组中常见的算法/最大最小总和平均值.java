package Java基础Day03数组.数组中常见的算法;

public class 最大最小总和平均值 {
    public static void main(String[]args)
    {
//        定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
//        然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。
//        要求：所有随机数都是两位数。
//        提示；[0,1) * 90 [0,90) + 10  [10,100) [10,99]
//        (int)(Math.random() * 90 + 10)
        int [] arr=new int[10];
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=(int)(Math.random()*90+10);;
        }
        //遍历
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        //求数组元素中的最大值
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println("最大值:"+max);
        //求数组元素中的最小值
        int min=arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("最小值:"+min);
        //求数组元素的总和
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("总和:"+sum);
        //求数组的平均数
        int avg=sum/arr.length;
        System.out.println("平均值:"+avg);
    }
}
