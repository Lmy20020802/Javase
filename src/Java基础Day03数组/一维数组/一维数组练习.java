package Java基础Day03数组.一维数组;

import java.util.Scanner;

public class 一维数组练习 {
    public static void main(String[] args) {
        /*
        思路:
        1.创建第一个数组arr
        2.创建第二个数组index
        3.循环遍历index数组的长度
        4.arr[index[i]] 二维数组的嵌套 arr[0]=1 arr[1]=5 arr[2]=8 ....
        5.输出
         */
//        int [] arr=new int[]{1,5,8,2,7,3,9,6};
//        int [] index=new int[]{0,1,2,3,4,7,5,4,6,1,1};
//        String tel="";
//        for (int i=0;i<index.length;i++)
//        {
//            tel+=arr[index[i]];
//        }
//        System.out.println("联系方式：   "+tel);

        /*
        思路：
        1.键盘输出学生的个数  Scanner scan=new Scanner(System.in);  int number=scan.nextInt()
        2.把输出的学生个数存放到动态数组中  int [] arr=new int[number]
        3.打印请输入number个成绩
        4.定义一个存放最大值的变量max
        5.for循环遍历数组 每一次遍历输出一个数  对比max和输出数的大小 如果小于 则把值赋给max
        6.定义一个char型变量
        7，for循环遍历数组 if判断 最大值和当前输入的值的差 分为A,B,C,D四个等级
        8.打印输出
         */
        //1.使用Scanner,读取学生个数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生人数:");
        int number = scanner.nextInt();
        //创建数组，存储学生成绩，动态初始化
        int[] arr = new int[number];
//        3.给数组中的元素赋值
        System.out.println("请输入" + number + "个学生成绩：");
        int maxscore = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            //4.获取数组中的元素的最大值:最高分
            if (maxscore < arr[i]) {
                maxscore = arr[i];
            }
        }
        char level;
        for (int i = 0; i < arr.length; i++) {
            if (maxscore - arr[i] <= 10) {
                level = 'A';
            } else if (maxscore - arr[i] <= 20) {
                level = 'B';
            } else if (maxscore - arr[i] <= 30) {
                level = 'C';
            } else {
                level = 'D';
            }
            System.out.println("最高分是"+maxscore);
            System.out.println("student "+i+"score is "+arr[i]+",grade is"+level);
        }
    }
}
