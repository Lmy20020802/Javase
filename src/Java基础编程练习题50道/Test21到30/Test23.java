package Java基础编程练习题50道.Test21到30;/**
 * Created with IntelliJ IDEA.
 * @company 王自立有限公司
 * @author 李铭洋
 * @date 2021-12-21 13:34
 * @Description:
 **/
/*
题目：有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。问第4个人岁数，他说比第3个人大2岁。问
第三个人，又说比第2人大两岁。问第2个人，说比第一个人大两岁。最后问第一个人，他说是10岁。请问第五个
人多大？

 */
public class Test23 {
    public static void main(String[] args) {
        int sum=getSum(5);
        System.out.println("第五个人的年龄为:"+sum);
    }
    public static int getSum(int n){
        if (n==1){
            return 10;
        }else{
            return 10+(n-1)*2;
        }
    }
}
