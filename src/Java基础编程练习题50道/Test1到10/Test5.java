package Java基础编程练习题50道.Test1到10;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-19 15:32
 * @Description:
 **/
/*
题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下
的用C表示。
 */
/*
思路:
1.键盘输入成绩 score
2.switch循环 条件score/10
3.case 9 10为a  case 6 7 8为b  case 0 1 2 3 4 5 为c 否则重新输入
 */
public class Test5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int score=scan.nextInt();
        switch (score/10)
        {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
            case 7:
            case 6:
                System.out.println("B");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("C");
                break;
            default:
                System.out.println("请重新输入成绩");
        }
    }
}
