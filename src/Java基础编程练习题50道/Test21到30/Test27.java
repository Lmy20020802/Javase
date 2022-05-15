package Java基础编程练习题50道.Test21到30;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-21 22:09
 * @Description:
 **/
public class Test27 {
    public static void main(String[] args) {
        for (int i=2;i<=100;i++)
        {
            boolean isFlag=true;
            for (int j=2;j<=i-1;j++)
            {
                if (i%j==0)
                {
                    isFlag=false;
                }
            }
            if (isFlag)
            {
                System.out.println(i);
            }
        }
    }
}
