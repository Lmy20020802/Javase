package Java基础编程练习题50道答案.Test21到30;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-21 13:29
 * @Description:
 **/
public class Test21 {
        public static void main(String[] args) {
            long n=1;
            long sum=0;//初始化sum=0;
            for(int i=1;i<=20;i++){
                n=n*i;
                sum=sum+n;
            }

            System.out.println(sum);
        }
    }
