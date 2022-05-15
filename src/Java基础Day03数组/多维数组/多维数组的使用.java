package Java基础Day03数组.多维数组;

public class 多维数组的使用 {
    public static void main(String[]args)
    {
        int sum=0;
        int [][] arr=new int[][]{{3,5,8},{12,9},{7,0,6,4}};
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                sum+=arr[i][j];
            }
        }
        System.out.println("总和为:"+sum);
    }
}
