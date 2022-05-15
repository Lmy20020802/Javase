package Java基础Day05面向对象中.面向对象中练习题.练习7;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-18 10:52
 * @Description:
 **/
public class TravelTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        boolean isFlag=true;
        while (isFlag)
        {
            System.out.println("请输入1-3的整数");
            int num=scan.nextInt();
            if (num==1)
            {
               Travel travel=new Car();
                travel.Run();
            }else if (num==2)
            {
                Travel travel1=new Plane();
                travel1.Run();
            }else if(num==3){
                Travel travel2=new Lunchuan();
                travel2.Run();
            }else {
                isFlag=false;
            }
        }

    }
}
