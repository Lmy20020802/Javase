package Java基础编程练习题50道答案.Test11到20;
import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-20 21:06
 * @Description:
 **/
public class Test15 {
        /**
         * @author jadexu
         * @// TODO: 2020/12/26
         * 题目：输入三个整数x,y,z，请把这三个数由小到大输出（不用数组排序、冒泡排序等）
         */
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("输入第1个整数：");
            int x = in.nextInt();
            System.out.print("输入第2个整数：");
            int y = in.nextInt();
            System.out.print("输入第3个整数：");
            int z = in.nextInt();

        /*
        方法1
        思路：求最大值、最小值、中间值
         */
            int max = x>y?x:y;
            max = max>z?max:z;
            int min = x<y?x:y;
            min = min<z?min:z;
            int mid = (x+y+z)-max-min;
            System.out.println(min+"\t"+mid+"\t"+max);

        /*
        方法2
        思路：依次比较，然后交换值
         */
            int temp = 0;
            if(x>y){
            /*
            交换值：方法1
            思路：拿一个中间值，当作中转站，暂存上一个数据
             */
                temp = x;
                x = y;
                y = temp;
            }
            if(x>z){
            /*
            交换值：方法2
            思路：任意一个数等于两个数之和，然后依次按需求减去的数据即可
            注意目的是交换数据，容易弄混淆
             */
                x = x+z;
                z = x-z;    //(x+z-z) = x
                x = x-z;    //(x+z-x) = z
            }
            if(y>z){
                //推荐第一种，好理解些
                temp = y;
                y = z;
                z = temp;
            }
            System.out.println(x+"\t"+y+"\t"+z);
        }
    }
