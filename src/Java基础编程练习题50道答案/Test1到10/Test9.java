package Java基础编程练习题50道答案.Test1到10;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-19 19:44
 * @Description:
 **/
public class Test9 {
    public static void main(String[] args) {
        for (int i=1;i<=1000;i++)
        {
            int sum=0;
            for (int j=1;j<=i/2;j++)
            {
                sum+=i%j==0?j:0;
            }
            if (sum==i){
                System.out.println(i);
            }
        }
    }
}
