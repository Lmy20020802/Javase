package Java基础编程练习题50道.Test1到10;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-19 16:31
 * @Description:
 **/
/*
输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 */
/*
思路：
1.定义变量 abccount 字母计数 spacecount 空格计数  numcount 数字计数  othercount 其他计数
2.键盘输入一行字符  scan.nextLine() 和scan.next()的区别 next()
3.建立一个char类型的数组
4.for循环遍历数组的长度
5.Character.isLetter 判断是否字母 Character.isDigit 判断是否数字 Character.isSpaceChar 判断是否空格 如果
不是这三个 则为其他 分别++
6.打印输出这四个变量
 */
public class Test7 {
    public static void main(String[] args) {
        int abccount=0;
        int spacecount=0;
        int numcount=0;
        int othercount=0;

        Scanner scan=new Scanner(System.in);
        System.out.println("请输入一行字符:");
        String str=scan.nextLine();
        char[] ch=str.toCharArray();
        for (int i=0;i<ch.length;i++)
        {
            if (Character.isLetter(ch[i]))
            {
                abccount++;
            }else if(Character.isDigit(ch[i]))
            {
                numcount++;
            }else if(Character.isSpaceChar(ch[i]))
            {
                spacecount++;
            }else{
                othercount++;
            }
        }
        System.out.println("英文的个数:"+abccount);
        System.out.println("数字的个数:"+numcount);
        System.out.println("空格的个数:"+spacecount);
        System.out.println("其他的个数:"+othercount);
    }
}
