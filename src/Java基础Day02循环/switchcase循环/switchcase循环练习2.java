package Java基础Day02循环.switchcase循环;

import java.util.Scanner;

public class switchcase循环练习2 {
    public static void main(String[]args)
    {
        /*
        思路:1.定义两个变量
            2.分四种情况 a==1 a==2 a==3 其他的
         */
//        int a = 3;
//        int x = 100;
//        if(a==1)
//            x+=5;
//        else if(a==2)
//            x+=10;
//        else if(a==3)
//            x+=16;
//        else
//            x+=34;
//        System.out.println(x);

//        int a=3;
//        int x=100;
//        switch (a){
//            case 1:
//                x+=5;
//                break;
//            case 2:
//                x+=10;
//                break;
//            case 3:
//                x+=16;
//                break;
//            default:
//                x+=34;
//                break;
//        }
//        System.out.println(x);

//        编写程序：从键盘上读入一个学生成绩，存放在变量score中，根据score的
//        值输出其对应的成绩等级：
//        score>=90 等级: A
//        70<=score<90 等级: B
//        60<=score<70 等级: C
//        score<60 等级: D
//        方式一：使用if-else
//        方式二：使用switch-case: score / 10: 0 - 10

//          方法一:if-else
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入学生成绩:");
//        int score=scanner.nextInt();
//        if (score>=90){
//            System.out.println("A");
//        }else if(score>=70&&score<90){
//            System.out.println("B");
//        }else if(score>=60&&score<70)
//        {
//         System.out.println("C");
//        }else{
//            System.out.println("D");
//        }

//        方法二:switch-case
//        Scanner scanner=new Scanner(System.in);
//        int score=scanner.nextInt();
//        switch (score/10){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("D");
//                break;
//            case 6:
//                System.out.println("C");
//                break;
//            case 7:
//            case 8:
//                System.out.println("B");
//                break;
//            case 9:
//            case 10:
//                System.out.println("A");
//                break;
//            default:
//                System.out.println("请重新输入成绩:");
//        }

//        编写一个程序，为一个给定的年份找出其对应的中国生肖。中国的生肖基于12年一个周期，
//        每年用一个动物代表：rat、ox、tiger、rabbit、dragon、snake、horse、sheep、monkey、
//        rooster、dog、pig。
//        提示：2019年：猪 2019 % 12 == 3
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入年份:");
        int zodiac=scanner.nextInt();
        switch (zodiac%12){
            case 0:
                System.out.println("monkey");
                break;
            case 1:
                System.out.println("rooster");
                break;
            case 2:
                System.out.println("dog");
                break;
            case 3:
                System.out.println("pig");
                break;
            case 4:
                System.out.println("rat");
                break;
            case 5:
                System.out.println("ox");
                break;
            case 6:
                System.out.println("tiger");
                break;
            case 7:
                System.out.println("rabbit");
                break;
            case 8:
                System.out.println("dragon");
                break;
            case 9:
                System.out.println("snake");
                break;
            case 10:
                System.out.println("horse");
                break;
            case 11:
                System.out.println("sheep");
                break;
        }
    }
}
