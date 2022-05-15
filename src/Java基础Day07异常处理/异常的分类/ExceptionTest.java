package Java基础Day07异常处理.异常的分类;

import Java基础Day05面向对象中.多态性.多态性练习.练习1.FileMethodTest;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-24 20:17
 * @Description:
 **/
/*
 * 一、异常体系结构
 *
 * java.lang.Throwable
 * 		|-----java.lang.Error:一般不编写针对性的代码进行处理。
 * 		|-----java.lang.Exception:可以进行异常的处理
 * 			|------编译时异常(checked)
 * 					|-----IOException
 * 						|-----FileNotFoundException
 * 					|-----ClassNotFoundException
 * 			|------运行时异常(unchecked,RuntimeException)
 * 					|-----NullPointerException  空指针异常
 * 					|-----ArrayIndexOutOfBoundsException  数组角标越界
 * 					|-----ClassCastException    两个类型间转换不兼容时引发的运行时异常
 * 					|-----NumberFormatException 数字格式化异常
 * 					|-----InputMismatchException 输入不匹配异常
 * 					|-----ArithmeticException 算数运算异常
 *
 *
 *
 * 面试题：常见的异常都有哪些？举例说明
 */
public class ExceptionTest {

    //***********************以下是编译时异常*******************************
    //io.FileNotFoundException
//    @Test
//    public void test7(){
//        File file=new File("hello");
//        FileInputStream fis=new FileInputStream(file);
//
//        int data=fis.read();
//        while (data!=-1){
//            System.out.print((char) data);
//            data=fis.read();
//        }
//        fis.close();
//    }

    //***********************以下是运行时异常*******************************
    //ArithmeticException 算数运算异常
    @Test
    public void test6(){
        int a=10;
        int b=0;
        System.out.println(a/b);
    }
    //InputMismatchException  输入不匹配异常
    @Test
    public void test5(){
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入一个数:");
        int score=scan.nextInt();
        System.out.println(score);
        scan.close();
    }

    //NumberFormatException 数字格式化异常
    @Test
    public void test4(){
        String str="123";
        str="abc";
        int num=Integer.parseInt(str);
    }

    //ClassCastException  两个类型间转换不兼容时引发的运行时异常
    @Test
    public void test3(){
        Object obj=new Date();
        String str=(String)obj;
    }

    //indexoutofboundsexception
    @Test
    public void test2(){
        //ArrayIndexOutOfBoundsException 数组角标越界
        int[] arr=new int[10];
        System.out.println(arr[10]);

        //StringIndexOutOfBoundsException 字符串角标越界
        String str="abc";
        System.out.println(str.charAt(3));
    }

    //NullPointerException 空指针
    @Test
    public void test1(){
//        int arr[]=null;
//        System.out.println(arr[3]);

        String str="abc";
        str=null;
        System.out.println(str.charAt(0));
    }
}
