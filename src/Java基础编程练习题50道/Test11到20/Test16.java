package Java基础编程练习题50道.Test11到20;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-20 21:05
 * @Description:
 **/
/*
题目：输出9*9口诀。
 */
public class Test16 {
    public static void main(String[] args) {
        for (int i=1;i<=9;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(i+"*"+j+"="+(i*j)+" ");
            }
            System.out.println();
        }
    }
}
