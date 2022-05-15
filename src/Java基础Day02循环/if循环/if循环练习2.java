package Java基础Day02循环.if循环;
import java.util.Scanner;
/*
编写程序：由键盘输入三个整数分别存入变量num1、num2、num3，
对它们进行排序(使用 if-else if-else),并且从小到大输出。

说明：
1. if-else结构是可以相互嵌套的。
2. 如果if-else结构中的执行语句只有一行时，对应的一对{}可以省略的。但是，不建议大家省略。
*/
public class if循环练习2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个数:");
        int num2 = scanner.nextInt();
        System.out.println("请输入第三个数:");
        int num3 = scanner.nextInt();
        /*
        1.先比较num1和num2 分两种情况 1.num1>num2 2.num1<num2
        2.第一种：如果num1>num2 又分三种情况 num3可以最小也可以在中间也可以最大
        num3<num2<num1 num2<num3<num1 num2<num1<num3
        3.第二种：如果num1<num2 又分三种情况  num3可以最小也可以在中间也可以最大
        num3<num1<num2 num1<num3<num2 num1<num2<num3
        4.输入
         */
        if (num1 >= num2) {
            if (num3 >= num1) {
                System.out.println(num2 + "," + num1 + "," + num3);
            }
            else if (num3 <= num2) {
                System.out.println(num3 + "," + num2 + "," + num1);
            }
            else {
                System.out.println(num2 + "," + num3 + "," + num1);
            }
        } else {
            if (num3 >= num2) {
                System.out.println(num1 + "," + num2 + "," + num3);
            }
            else if (num3 <= num1) {
                System.out.println(num3 + "," + num1 + "," + num2);
            }
            else {
                System.out.println(num1 + "," + num3 + "," + num2);
            }
        }
    }
}
