package Java基础Day03数组;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-11-30 23:30
 * @Description:
 **/
public class 数组练习 {
    public static void main(String[]args) {
        //        面试题目：创建一个长度为6的int型数组，要求取值
//        为1-30，同时元素值各不相同

        /*
        思路:
        1.动态创建动态数组
        2.for循环i遍历数组长度的次数每次随机赋值
        3.for循环j遍历随机数 如果随机到等于数组里面的了 i--1 如果当前是arr[4] 则会返回到arr[3]
        4.遍历数组
         */
//        int [] arr=new int[6];
//        for (int i=0;i<arr.length;i++)
//        {
//            arr[i]=(int)(Math.random()*30+1);
//            for (int j=0;j<i;j++)
//            {
//                if (arr[i]==arr[j])
//                {
//                    i--;
//                    break;
//                }
//            }
//        }
//        for (int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i]+"\t");
//        }

//        Arrays工具类的使用
//        Java基础Day04面向对象上.练习：
//        1、从键盘输入本组学员的成绩，放到数组中
//        2、用for循环显示所有学员的成绩
//        3、排序：从低到高
//        4、查找是否有正好60分的，如果有返回位置
//        5、复制成绩最低三名构成新数组
//        6、用工具类打印成绩最低三名成绩

//        Scanner scan=new Scanner(System.in);
//        System.out.println("请输入学生个数");
//        int number=scan.nextInt();
//        int arr []=new int[number];
//        for (int i=0;i<arr.length;i++)
//        {
////            1、从键盘输入本组学员的成绩，放到数组中
//            System.out.println("请输入成绩:");
//            arr[i]=scan.nextInt();
//        }
////        2、用for循环显示所有学员的成绩
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i]+"\t");
//        }
//        System.out.println();

//        //3、排序：从低到高
//        for(int i=0;i<arr.length-1;i++)
//        {
//            for(int j=0;j<arr.length-i-1;j++)
//            {
//                if(arr[j]>arr[j+1])
//                {
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        for (int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i]+"\t");
//        }
//        System.out.println();
//
////        4、查找是否有正好60分的，如果有返回位置
//        int index= Arrays.binarySearch(arr,105);
//        if(index>0)
//        {
//            System.out.println("找到了,索引位置为"+index);
//        }else
//        {
//            System.out.println("没找到");
//        }
////        5、复制成绩最低三名构成新数组
//        int arr1[]=new int[arr.length];
//        for (int i=0;i<3;i++)
//        {
//            arr1[i]=arr[i];
//        }
//        for (int i=0;i<3;i++)
//        {
//            System.out.print(arr1[i]+"\t");
//        }
//        System.out.println();

//        6、用工具类打印成绩最低三名成绩
//        Arrays.sort(arr);
//        for(int i=0;i<3;i++)
//        {
//            System.out.print(arr[i]+"\t");
//        }
//        System.out.println();

        //创建一个char类型的26个元素的数组，分别 放置'A'-'Z'。
        //使用for循环访问所有元素并打印出来。
//        char [] arr=new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W', 'X','Y','Z'};
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i]+"\t");
//        }
//        System.out.println();

//        创建一个char类型的36个元素的数组，前26个元素放置'A'-'Z',   后10个元素放置'0'-'9'。
//        使用for循环访问所有元素并打印出来。
//        提示：char类型数据运算 'A'+1 -> 'B'，'0'+1 -> '1'
//        char [] arr=new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S',
//                'T','U','V','W', 'X','Y','Z','0','1','2','3','4','5','6','7','8','9'};
//        for(int i=0;i<arr.length;i++)
//        {
//           arr[i]=(char)(arr[i]+1);
//        }
//        for (int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i]+"\t");
//        }
//        System.out.println();

//        一维数组a[]，用java代码将数组元素顺序颠倒
//        int[] arr=new int[]{1,2,3,4,5,6,7,8,9,10};
//        for (int i=0;i<arr.length/2;i++)
//        {
//            int temp=arr[i];
//            arr[i]=arr[arr.length-i-1];
//            arr[arr.length-i-1]=temp;
//        }
//        for (int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i]+"\t");
//        }
//        System.out.println();

//        任意一个人输入年龄，就可以判断出他是哪个年龄段的人？
/*
0-9   儿童
10-19 少年
20-29 青少年
30-39 青年
40-49 壮年
50-59 中年
60-69 中老年
70-79 老年
80-89 老老年
90-99 老老老年
 */
//        Scanner scan=new Scanner(System.in);
//        System.out.println("请输入你的年龄");
//        int age=scan.nextInt();
//        String[]arr=new String[]{"儿童","少年","青少年","青年","壮年","中年","中老年","老年","老老年","老老老年"};
//        int idx=age/10;
//        System.out.println(arr[idx]);

//        用数组求出斐波那契数列的前20项值
//        int[]arr=new int[20];
//        arr[0]=1;
//        arr[1]=1;
//        for (int i=2;i<arr.length;i++)
//        {
//            arr[i]=arr[i-1]+arr[i-2];
//        }
//        System.out.println(Arrays.toString(arr));

//        对10个整数进行按照从小到大的顺序排序
//        int []arr=new int[]{-54,13,125,612,9,12,234,4,9,-9};
//        for (int i=0;i<arr.length-1;i++)
//        {
//            for (int j=0;j<arr.length-i-1;j++)
//            {
//                if (arr[j]>arr[j+1])
//                {
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));


//        求一个3*3矩阵对角线元素之和
        /*
        思路:
        1.定义一个存变量的值sum
        2.创建一个二维数组并初始化
        3.for循环遍历二维数组
        4.判断如果i==j的时候我们就sum+=i [0][0]=1 [1][1]=5  [2][2]=9 1+5+9=15
        5.打印输出结果sum
         */
        int sum=0;
        int[][] arr=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                if (i==j){
                    sum=sum+arr[i][j];
                }
            }
        }
        System.out.println(sum);


//        利用随机数生成一个整数数组，数组中有10个元素，每个元素的值都在1-30之间，且要求各个数值不能相同。打印该数组。
        /*
        思路:
        1,创建一维数组并初始化
        2.遍历数组
        3.生成随机数
        4.定义一个变量 x=0来判断 如果随机数生成的值==数组里面的值 执行x++
        5.if判断如果 x=0的时候  把number的值赋给arr[i] 否则i--返回到上一个值重新循环
         */
//        int [] arr=new int[10];
//        for (int i=0;i<arr.length;i++)
//        {
//            int number=(int)(Math.random()*30+1);
//            int x=0;
//            for (int j=0;j<arr.length;j++)
//            {
//                if (number==arr[j])
//                {
//                   x++;
//                }
//            }
//            if (x==0){
//                arr[i]=number;
//                System.out.print(arr[i]+"\t");
//            }else {
//                i--;
//            }
//        }

//        将一个数组逆序输出。
//            int [] arr=new int[]{1,2,3,4,5,6,7,8,9,10};
//            for (int i=0;i<arr.length/2;i++)
//            {
//                int temp=arr[i];
//                arr[i]=arr[arr.length-i-1];
//                arr[arr.length-i-1]=temp;
//            }
//            System.out.println(Arrays.toString(arr));

        /*
        思路:
        1.创建一个一维数组
        2.定义一个max min
        3.for循环遍历
        4.if判断 如果max<arr[i] 我们就把arr[i]的值赋值给max  如果min>arr[i] 我们就把arr[i]的值赋值给min
        5.交换俩个数的位置 第一个就是arr[0] 最后一个为arr[arr.length-1]
        6.遍历数组
         */
//        int[] arr=new int[]{1,2,3,4,5,6,7,8,9,10};
//        int max=arr[0];
//        int min=arr[0];
//        for (int i=0;i<arr.length;i++)
//        {
//            if (max<arr[i])
//            {
//                max=arr[i];
//            }
//            if (min>arr[i])
//            {
//                min=arr[i];
//            }
//        }
//        int f=arr[0];
//        arr[0]=max;
//        max=f;
//        int g=arr[arr.length-1];
//        arr[arr.length-1]=min;
//        min=g;
//        for (int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i]+"\t");
//        }
//        System.out.println();

//        有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
        /*
        思路:
        1.键盘输入Scanner num个数
        2.新建一个动态数组arr  int[] arr=new int [num]
        3.for循环给动态数组赋值
        4.遍历数组
        5.请输入你要后移的位数m
        6.新建一个动态数组 arr1 int[] arr1=new int[m]
        7.分情况讨论 i>m时 i<m时
        例如num=5 m=2
        1	2	3	4	5	  4	 5	1	2	3
        当i<m时 arr1[i]=arr[num-m-i]  arr1[0]=arr[5-2-0]=arr[3] arr[1]=arr[4]
        当i>m时 arr[5-1]=arr[5-m]     arr[4]=arr[3]
        8.遍历
         */
//        Scanner scan = new Scanner(System.in);
//        System.out.println("请输入个数:");
//        int num=scan.nextInt();
//        int [] arr=new int[num];
//        System.out.println("请输入"+num+"个数");
//        for (int i=0;i<num;i++)
//        {
//            arr[i]=scan.nextInt();
//        }
//        System.out.println("你输入的数组为:");
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i]+"\t");
//        }
//        System.out.println();
//        System.out.println("请输入你要后移多少位:");
//        int m=scan.nextInt();
//        int [] arr1=new int[m];
//        for (int i=0;i<m;i++)
//        {
//            arr1[i]=arr[num-m+i];
//        }
//        for (int i=num-1;i>=m;i--)
//        {
//            arr[i]=arr[i-m];
//        }
//        for (int i=0;i<m;i++)
//        {
//            arr[i]=arr1[i];
//        }
//        System.out.println("后移后的数组为:");
//        for (int i=0;i<num;i++)
//        {
//            System.out.print(arr[i]+"\t");
//        }

//        定义一个4行4列的二维数组，逐个从键盘输入值，然后将第1行和第4行的数据进行交换，将第2行和第3行的数据进行交换
//        Scanner scan=new Scanner(System.in);
//        int[][] arr=new int[4][4];
    }
}
