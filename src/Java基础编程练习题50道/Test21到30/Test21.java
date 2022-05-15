package Java基础编程练习题50道.Test21到30;

import Java基础Day05面向对象中.单元测试方法的使用.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-21 13:06
 * @Description:
 **/
/*
题目：求1+2!+3!+...+20!的和
 */
public class Test21 {
    public static void main(String[] args) {
        long n=1;
        long sum=0;
        for (int i=1;i<=20;i++)
        {
            n=n*i;
            sum+=n;
        }
        System.out.println(sum);
    }
}