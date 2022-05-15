package Java基础Day02循环.while循环;
/*
do-while循环的使用

一、循环结构的4个要素
① 初始化条件
② 循环条件  --->是boolean类型
③ 循环体
④ 迭代条件

二、do-while循环结构：

①
do{
	③;
	④;

}while(②);

执行过程：① - ③ - ④ - ② - ③ - ④ - ... - ②

说明：
1.do-while循环至少会执行一次循环体！
2.开发中，使用for和while更多一些。较少使用do-while

*/
public class dowhile循环的使用 {
    public static void main(String[]args)
    {
//        //遍历100以内的偶数,并计算所有偶数和及偶数的个数
//        int sum=0;
//        int count=0;
//        int number=1;
//        do {
//            if (number%2==0)
//            {
//                System.out.println(number);
//                sum+=number;
//                count++;
//            }
//            number++;
//        }while (number<=100);
//        System.out.println("总和为:"+sum);
//        System.out.println("个数为:"+count);
        //*****************************
        int number=10;
        while(number>10){
            System.out.println("hello while");
            number--;
        }
        int number1=10;
        do {
            System.out.println("hello do-while");
            number1--;
        }while (number1>10);
    }
}
