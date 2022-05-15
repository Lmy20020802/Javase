package Java基础编程练习题50道答案.Test21到30;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-21 21:54
 * @Description:
 **/
public class Test26 {

    //请输入星期几的第一个字母来判断一下是星期几，
//如果第一个字母一样，则继续判断第二个字母
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入星期的首字母（不区分大小写）：");
            String str1 = scanner.nextLine().toUpperCase();

            switch (str1) {
                case "M":
                    System.out.println("Monday");
                    break;
                case "T":
                    System.out.println("请输入星期的次字母（不区分大小写）：");
                    String str2 = scanner.nextLine().toUpperCase();
                    if (str2.equals("U")) {
                        System.out.println("Tuesday");
                    } else if (str2.equals("H")) {
                        System.out.println("Thursday");
                    } else {
                        System.out.println("Wrong");
                    }
                    break;
                case "W":
                    System.out.println("Wednesday");
                    break;
                case "F":
                    System.out.println("Friday");
                    break;
                case "S":
                    System.out.println("请输入星期的次字母（不区分大小写）：");
                    String str3 = scanner.nextLine().toUpperCase();
                    if (str3.equals("U")) {
                        System.out.println("Sunday");
                    } else if (str3.equals("A")) {
                        System.out.println("Saturday");
                    } else {
                        System.out.println("Wrong");
                    }
                    break;
                default:
                    System.out.println("Wrong");

            }
        }
    }
