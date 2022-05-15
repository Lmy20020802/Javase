package Java基础编程练习题50道答案;
import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-22 16:20
 * @Description:
 **/
public class Test34 {
    public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("请输入3个整数：");
                int a = s.nextInt();
                int b = s.nextInt();
                int c = s.nextInt();
                if(a < b) {
                    int t = a;
                    a = b;
                    b = t;
                }
                if(a < c) {
                    int t = a;
                    a = c;
                    c = t;
                }
                if(b < c) {
                    int t = b;
                    b = c;
                    c = t;
                }
                System.out.println("从大到小的顺序输出:");
                System.out.println(a + " " + b + " " + c);
            }
        }

