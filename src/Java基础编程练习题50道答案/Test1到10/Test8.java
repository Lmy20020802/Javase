package Java基础编程练习题50道答案.Test1到10;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-19 19:31
 * @Description:
 **/
public class Test8 {
    public static void main(String[] args) {


    System.out.println("请输入1-9之间的数字：");       //提示用户输入1--9之间的数字
    Scanner sc=new Scanner(System.in);
    int shu=sc.nextInt();                            //接受用户输入的数字作为题目中的“基数”
    int a=shu;                                       //定义一个变量a等于用户输入的数。
    int sum=0;                                       //定义变量作为数字相加的和
	System.out.println("请输入相加的个数：");           //提示用户输入需要相加的个数
    int jishu=sc.nextInt();
	if(shu>0&&shu<10)                                //如果用户输入的是1--9之间的数
    {
        System.out.print(shu+" ");               //先不换行输出用户输入的“基数”


        for(int i=1;i<jishu;i++)                  //用循环依次输出第二个数到最后一个数
        {
            shu=a+shu*10;                     //从第二个数开始到最后一个数的每个数的值
            sum+=shu;                         //从第二个数开始到最后一个数的和
            System.out.print(shu+" ");
        }
        System.out.println("的和是"+(sum+a));      //因为sum从第二个数开始的和，输出的时候要加上第一个数
    }
	else                                             //用户输入的不是1--9之间的数
    {
        System.out.println("请输入1-9之间的数");
    }
}
}
