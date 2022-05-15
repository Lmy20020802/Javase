package Java基础编程练习题50道答案.Test21到30;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-22 12:46
 * @Description:
 **/
/*
题目：求一个3*3矩阵对角线元素之和
 */
public class Test29{
    public static void main(String[] args) {
        //定义求和变量
        int sum=0;
        //定义一个二维数组 3*3的矩形
        int[][] arr=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        //外层for循环遍历数组
        for (int i=0;i<3;i++)
        {
            //内存遍历指定数组里面的元素
            for (int j=0;j<3;j++)
            {
                //[0][0] [0][1] [0][2] [1][0] [1][1] [1][2] [2][0] [2][1] [2][2]
                if (i==j)
                {
                    //如果i==j sum+=
                    sum+=arr[i][j];
                }
            }
        }
        //打印输出
        System.out.println(sum);
    }
}
