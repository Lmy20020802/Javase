package Java基础编程练习题50道答案.Test11到20;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-20 21:13
 * @Description:
 **/
public class Test16 {
    public static void main(String[] args) {
        //外层循环控制行数
        for (int i=1;i<=9;i++)
        {
            //内存循环控制列数
            for (int j=1;j<=i;j++)
            {
                //打印输出
                System.out.print(i+"*"+j+"="+(i*j)+" ");
            }
            //换行
            System.out.println();
        }
    }
}
