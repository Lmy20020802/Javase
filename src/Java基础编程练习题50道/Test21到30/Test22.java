package Java基础编程练习题50道.Test21到30;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-21 13:30
 * @Description:
 **/
/*
题目：利用递归方法求5!。
 */
public class Test22 {
    public static void main(String[] args) {
        Test22 test=new Test22();
        int n=test.getSum(5);
        System.out.println("5!的计算结果是："+n);
    }
    public int getSum(int n)
    {
     if (n==1){
         return 1;
     }else{
         return n*getSum(n-1);
     }
    }
}
