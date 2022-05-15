package Java基础编程练习题50道答案.Test11到20;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-21 12:44
 * @Description:
 **/
public class Test19 {
    /*
题目：打印出如下图案（菱形）
   *
  ***
 *****
*******
 *****
  ***
   *
上层规律如下:
i为行数
星号  空格 行数
1     3    1
3     2    2
5     1    3
7     0    4
*=2*i-1
空格=4-i
下层规律如下:
i为行数
星号  空格 行数 i
5     1    1  3
3     2    2  2
1     3    3  1
*=2*i-1
空格=4-i
 */
        public static void main(String[] args) {
            //定义行数
            for (int i=1;i<=4;i++)
            {
                //定义空格
                for (int k=1;k<=4-i;k++)
                {
                    System.out.print(" ");
                }
                //定义*号
                for (int j=1;j<=2*i-1;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i=3;i>=1;i--)
            {
                for (int k=1;k<=4-i;k++)
                {
                    System.out.print(" ");
                }
                for (int j=1;j<=2*i-1;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
