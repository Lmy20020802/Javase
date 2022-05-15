package Java基础编程练习题50道答案.Test1到10;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-19 15:28
 * @Description:
 **/
public class Test4 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.err.println("请输入一个数：");
        int x = input.nextInt();
        System.out.print(x+"=");
        int i=2;
        while(i<=x){		//使用循环来找到可以被整除的数，然后通过out函数输出
            if(i == x){		//如果相等的话，就说明这个数没有因数，只有1和它自己；
                System.out.println(i);
                break;
            }else if(x % i ==0){		//如果这个数有因数，然后找到除去这个因数后的值，继续循环
                System.out.print(i+"*");
                x=x/i;
            }else{			//如果都不满足，则继续循环
                i++;
            }
        }
    }
}
