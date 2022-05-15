package Java小白编程题;

import javax.imageio.plugins.bmp.BMPImageWriteParam;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-05 20:06
 * @Description:
 **/

/*
练习题: BMI 指数测试 BMI = 体重 (kg) / 身高² (m)
接收用户输入的身高和体重,将判断结果输出
过轻：低于18.5
正常：18.5 ~ 22.9
偏胖：23 ~ 24.9
肥胖：25 ~ 29.9
重度肥胖：高于30
极度肥胖：高于40
 */
public class Test12 {
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入体重(kg)");
        double weight= scan.nextDouble();
        System.out.println("请输入身高(米)");
        double height= scan.nextDouble();
        double BMI=weight/height;
        System.out.println(BMI);
        if (BMI<18.5)
        {
            System.out.println("过轻");
        }
        else if(BMI>=18.5&&BMI<=22.9)
        {
            System.out.println("正常");
        }
        else if(BMI>=23&&BMI<=24.9)
        {
            System.out.println("偏胖");
        }
        else if(BMI>=25&&BMI<=29.9)
        {
            System.out.println("肥胖");
        }
        else if(BMI>=30&&BMI<=40)
        {
            System.out.println("重度肥胖");
        }
        else if(BMI>40)
        {
            System.out.println("极度肥胖");
        }
    }
}
