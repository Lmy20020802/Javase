package Java基础编程练习题50道.Test21到30;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-21 21:28
 * @Description:
 **/
/*
输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续 判断第二个字母。
 */
public class Test26 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入星期的首字母(不区分大小写):");
        String first=scan.nextLine().toUpperCase();
        switch (first){
            case "M":
                System.out.println("Monday");
                break;
            case "T":
                System.out.println("请输入星期的次字母(不区分大小写):");
                String second=scan.nextLine().toUpperCase();
                if (second.equals("U"))
                {
                    System.out.println("Tuesday");
                }else if (second.equals("H")){
                    System.out.println("Thursday");
                }else{
                    System.out.println("输入有误");
                }
                break;
            case "W":
                System.out.println("Wednesday");
                break;
            case "F":
                System.out.println("Friday");
                break;
            case "S":
                System.out.println("请输入星期的次字母(不区分大小写):");
                String second1=scan.nextLine().toUpperCase();
                if (second1.equals("A"))
                {
                    System.out.println("Saturday");
                }else if(second1.equals("U"))
                {
                    System.out.println("Sunday");
                }else {
                    System.out.println("输入有误!");
                }
                break;
            default:
                System.out.println("请重新输入!");
        }

    }
}
