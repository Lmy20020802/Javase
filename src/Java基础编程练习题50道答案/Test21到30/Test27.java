package Java基础编程练习题50道答案.Test21到30;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-21 21:56
 * @Description:
 **/
/*
题目：求100之内的素数
 */
public class Test27 {
    public static void main(String[] args) {
        //循环遍历2-100
        for (int i=2;i<=100;i++)
        {
            //初始化一个布尔值为真
            boolean isFlag=true;
            //判断素数的条件 只能被1和自身除尽
            for (int j=2;j<=i-1;j++)
            {
                if (i%j==0)
                {
                    //布尔值改为假
                    isFlag=false;
                }
            }
            //判断布尔值是否还为真 为真打印输出
            if (isFlag)
            {
                System.out.println(i);
            }
        }
    }
}
