package Java基础编程练习题50道答案.Test21到30;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-21 13:35
 * @Description:
 **/
public class Test22 {
    public class Factorial {
        /**
         *  利用递归方法求5!。
         */
    /*
    分析，这个题目其实是上一道题目的一部分，求阶乘嘛F(n)=F(n-1)*n
     */
        public void main(String[] args) {
            System.out.println("5!的计算结果是："+Factorial(5));
        }
        public int Factorial(int num){
            if(num==1){
                return 1;
            }else{
                return Factorial(num-1)*num;
            }
        }
    }


}
