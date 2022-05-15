package Java基础Day02循环;

public class 流程控制练习题 {
    public static void main(String[] args) {
//        实现对三个整数进行排序，输出时按照从小到大的顺序输出。
//        int x=10;
//        int y=20;
//        int z=15;
//        if(x>y){
//            if(x<z)
//            {
//                System.out.println("y="+y+",x="+x+",z="+z);
//            }
//            else if(z<y)
//            {
//                System.out.println("z="+z+",y="+y+",x="+x);
//            }
//            else{
//                System.out.println("z="+z+",y="+y+",x="+x);
//            }
//        }
//        else {
//            if(z>y)
//            {
//                System.out.println("x="+x+",y="+y+",z="+z);
//            }else if(z<x)
//            {
//                System.out.println("z="+z+",x="+x+",y="+y);
//            }else {
//                System.out.println("x="+x+",z="+z+",y="+y);
//            }
//        }

//        编写程序，从键盘接收整数参数。如果该数为1-7，打印对应的星期值，否则打印“非法参数”。
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入数字(1-7)");
//        int number=scanner.nextInt();
//        switch (number)
//        {
//            case 1:
//                System.out.println("星期一");
//                break;
//            case 2:
//                System.out.println("星期二");
//                break;
//            case 3:
//                System.out.println("星期三");
//                break;
//            case 4:
//                System.out.println("星期四");
//                break;
//            case 5:
//                System.out.println("星期五");
//                break;
//            case 6:
//                System.out.println("星期六");
//                break;
//            case 7:
//                System.out.println("星期天");
//                break;
//            default:
//                System.out.println("输入日期有误");
//                break;
//        }

//        从键盘分别输入年、月、日，判断这一天是当年的第几天
//        Scanner scan=new Scanner(System.in);
//        System.out.println("请输入年：");
//        int year=scan.nextInt();
//        System.out.println("请输入月：");
//        int month=scan.nextInt();
//        System.out.println("请输入日期：");
//        int day=scan.nextInt();
//        int days=0;
//        switch (month)
//        {
//            case 12:
//                days+=30;
//            case 11:
//                days+=31;
//            case 10:
//                days+=30;
//            case 9:
//                days+=31;
//            case 8:
//                days+=31;
//            case 7:
//                days+=30;
//            case 6:
//                days+=31;
//            case 5:
//                days+=30;
//            case 4:
//                days+=31;
//            case 3:
//                if ((year%4==0&&year%100!=0)||year%400==0)
//                {
//                    days+=29;
//                }else
//                {
//                    days+=28;
//                }
//            case 2:
//                days+=31;
//            case 1:
//                days+=day;
//        }
//        System.out.println(year+"年"+month+"月"+day+"天"+"是"+year+"年的第"+days+"天");

//        编写程序，判断给定的某个年份是否是闰年
//        闰年的判断规则如下：
//      （1）若某个年份能被4整除但不能被100整除，则是闰年。
//      （2）若某个年份能被400整除，则也是闰年。
//
//        提示：
//        if((year % 4 ==0 && year % 100 != 0) || year % 400 == 0){}
//        Scanner scan=new Scanner(System.in);
//        System.out.println("请输入年份:");
//        int year=scan.nextInt();
//        if((year%4==0&&year%100!=0)||year%400==0)
//        {
//            System.out.println(year+"年是闰年");
//        }else{
//            System.out.println(year+"年是平年");
//        }

//        要求用户输入两个数a和b，如果a能被b整除或者a加b大于1000，则输出a；否则输出b。
//         Scanner scanner=new Scanner(System.in);
//         System.out.println("请输入a:");
//         int a=scanner.nextInt();
//         System.out.println("请输入b:");
//         int b=scanner.nextInt();
//         if (b%a==0||(a+b)>1000)
//         {
//             System.out.println(a);
//         }else {
//             System.out.println(b);
//         }

//        使用条件结构实现，如果用户名等于字符‘青’，密码等于数字‘123’，就
//    输出“欢迎你，青”，否则就输出“对不起，你不是青”。
//         Scanner scan=new Scanner(System.in);
//         System.out.println("请输入你的用户名:");
//         String  str1=scan.next();
//         char a=str1.charAt(0);
//         System.out.println("请输入你的密码:");
//         int possword=scan.nextInt();
//         if (a=='青'&&possword==123)
//         {
//             System.out.println("欢迎你，青");
//         }else {
//             System.out.println("对不起,你不是青");
//         }

//        编写程序：从键盘上读入一个学生成绩，存放在变量score中，根据score的值输出其对应的成绩等级：
//        score>=90           等级：A
//        70=<score<90        等级：B
//        60=<score<70        等级：C
//        score<60            等级：D
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入你的成绩:");
//        int score=scanner.nextInt();
//        if(score>=90)
//        {
//            System.out.println("A");
//        }else if(score>=70&&score<90)
//        {
//            System.out.println("B");
//        }else if(score>=60&&score<70)
//        {
//            System.out.println("C");
//        }else {
//            System.out.println("D");
//        }

//        根据指定月份，打印该月份所属的季节。
//        3,4,5 春季 6,7,8 夏季  9,10,11 秋季 12, 1, 2 冬季
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入月份:");
//        int year=scanner.nextInt();
//        switch (year){
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("春季");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("夏季");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("秋季");
//                break;
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("冬季");
//                break;
//            default:
//                System.out.println("输入月份有误");
//                break;
//        }

//        彩票游戏
//        假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票，提示用户输入一个两位数，然后按照下面的规则判定用户是否能赢。
//        1)如果用户输入的数匹配彩票的实际顺序，奖金10 000美元。
//        2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金 3 000美元。
//        3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
//        4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
//        5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。
//        提示：使用Math.random() 产生随机数
//        Math.random() 产生[0,1)范围的随机值
//        Math.random() * 90：[0,90)
//        Math.random() * 90 + 10：[10,100) 即得到  [10,99]
//        使用(int)(Math.random() * 90  + 10)产生一个两位数的随机数。

//        Scanner scanner=new Scanner(System.in);
//        int number=(int)(Math.random()*90+10);
//        System.out.println("电脑随机的数是"+number);
//        int number1=number/10;
//        int number2=number%10;
//        System.out.println("请输入你猜测的数：");
//        int number3=scanner.nextInt();
//        int number4=number3/10;
//        int number5=number3%10;
//        if (number==number3)
//        {
//            System.out.println("奖金10000元");
//        }else if (number1==number5&&number2==number4)
//        {
//            System.out.println("奖金3000元");
//        }else if(number1==number4 ||number2==number5)
//        {
//            System.out.println("奖金1000元");
//        }else if(number1==number5 || number2==number4)
//        {
//            System.out.println("奖金500元");
//        }else {
//            System.out.println("没有奖金");
//        }

//        赌数游戏
//        提供三个1-6的随机数，作为掷骰子得到的点数。如果各个点数相同，则为豹子。
//        如果三个骰子点数和，小于或等于9，则为“小”。
//        如果三个骰子点数和，大于9，则为“大”。
//        用户随机选择：押大、押小或者押豹子。通过判断，输出客户是否押正确。
//         int a=(int)(Math.random()*6+1);
//         System.out.println("第一个随机数:"+a);
//         int b=(int)(Math.random()*6+1);
//         System.out.println("第二个随机数:"+b);
//         int c=(int)(Math.random()*6+1);
//         System.out.println("第三个随机数:"+c);
//        String result = "";
//        if(a==b && b==c){
//            result = "豹子";
//        }else if(a+b+c <=9 ){
//            result = "小";
//        }else{
//            result ="大";
//
//        }
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("请下注：");
//        String str1=scanner.next();
//        判断:
//        if(result.equals(str1)){
//            System.out.println("猜对了");
//        }else{
//            System.out.println("猜错了");
//        }

//        编写一个程序，为一个给定的年份找出其对应的中国生肖。
//        中国的生肖基于12年一个周期，每年用一个动物代表：
//        rat（鼠）、ox（牛）、tiger（虎）、rabbit（兔）、dragon（龙）、snake（蛇）、
//        horse（马）、sheep（羊）、monkey（候）、rooster（鸡）、dog（狗）、pig（猪）。
//        提示：2019年：猪   2019 % 12 == 3
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入年份:");
//        int year=scanner.nextInt();
//        switch (year%12){
//            case 0:
//                System.out.println("猴年");
//                break;
//            case 1:
//                System.out.println("鸡年");
//                break;
//            case 2:
//                System.out.println("狗年");
//                break;
//            case 3:
//                System.out.println("猪年");
//                break;
//            case 4:
//                System.out.println("鼠年");
//                break;
//            case 5:
//                System.out.println("牛年");
//                break;
//            case 6:
//                System.out.println("虎年");
//                break;
//            case 7:
//                System.out.println("兔年");
//                break;
//            case 8:
//                System.out.println("龙年");
//                break;
//            case 9:
//                System.out.println("蛇年");
//                break;
//            case 10:
//                System.out.println("马年");
//                break;
//            case 11:
//                System.out.println("羊年");
//                break;
//        }

//        打印1-100之间13的倍数，使用for循环
//        for (int i=1;i<=100;i++)
//        {
//            if(i%13==0)
//            {
//                System.out.print(i+" ");
//            }
//        }

//        使用双重循环打印20 * 8的矩形，使用for循环实
//        for (int i=1;i<=8;i++)
//        {
//            for(int j=1;j<=20;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        用for循环计算1000以内偶数的和
//        int sum=0;
//        for (int i=1;i<=1000;i++)
//        {
//            if(i%2==0)
//            {
//                sum+=i;
//            }
//        }
//        System.out.println(sum);

//        执行如下代码后，c的值是多少？
//        int a = 0;
//        int c = 0;
//        do {
//            --c;
//            a = a - 1;
//        } while (a >= 0);
//        System.out.println("c = " + c);

//        int i = 10;
//        while (i > 0) {
//            i = i + 1;
//            if (i == 10) {
//                break;
//            }
//            System.out.println("i=" + i);
//        }
//
//输入长和宽，输出长方形，如：输入4和3, 将输出如下图形
//####
//####
//####
//        for (int i=1;i<=3;i++)
//        {
//            for(int j=1;j<=4;j++)
//            {
//                System.out.print("#");
//            }
//            System.out.println();
//        }

//输入高度，输出直角三角形。如：输入4, 将输出如下图形
//#
//##
//###
//####
//for (int i=1;i<=4;i++)
//{
//    for(int j=1;j<=i;j++)
//    {
//        System.out.print("#");
//    }
//    System.out.println();
//}
// 输入高度，输出倒直角三角形。如：输入4, 将输出如下图形
//####
//###
//##
//#

//        for(int i=1;i<=4;i++)
//        {
//            for(int j=0;j<=4-i;j++)
//            {
//                System.out.print("#");
//            }
//            System.out.println();
//        }

//        打印九九乘法表
//        for (int i=1;i<=9;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print(i+"*"+j+"="+i*j+" ");
//            }
//            System.out.println();
//        }

//        3000米长的绳子，每天减一半。问多少天这个绳子会小于5米？不考虑小数。
//        int day=0;
//        for (int x=3000;x>=5;x/=2){
//            day++;
//        }
//        System.out.println("day="+day);

//        打印1-100之间非13的倍数，使用continue语句
//        for(int i=1;i<=100;i++){
//            if(i%13==0)
//            {
//                continue;
//            }
//            System.out.println(i);
//        }

//        用循环控制语句打印输出：1+3+5+...+99=?的结果
//        int sum=0;
//        for (int i=1;i<=99;i+=2)
//        {
//            sum+=i;
//        }
//        System.out.println(sum);

//        输出从1到100之间所有不能被3整除的数;并输出这些整数的和
//        int sum=0;
//        for (int i=1;i<=100;i++)
//        {
//            if(i%3!=0)
//            {
//                sum+=i;
//            }
//        }
//        System.out.println(sum);


//        猜数字游戏
//        随机生成一个100以内的数，猜数字游戏：
//        从键盘输入数，如果大了提示，大了，如果小了，提示小了，如果对了，就不再猜了，并统计一共猜了多少次？
//        提示：随机数
//        Scanner scanner=new Scanner(System.in);
//        Random rand=new Random();
//        int num=rand.nextInt(100);
//        System.out.println("电脑输入的数:"+num);
//        int count=0;
//        while (true){
//            System.out.println("请输入一个数:");
//            int num1=scanner.nextInt();
//                if(num1>num)
//                {
//                    System.out.println("大了");
//                    count++;
//                }
//                else if(num1<num)
//                {
//                    System.out.println("小了");
//                    count++;
//                }
//                else {
//                    System.out.println("猜对了");
//                    count++;
//                    break;
//                }
//            }
//        System.out.println("一共猜了"+count+"次");

//        打印1-100之间数，其中3、5、7的倍数不打印（continue）
//        for(int i=1;i<=100;i++){
//            if(i%3==0||i%5==0||i%7==0)
//            {
//                continue;
//            }
//            System.out.println(i);
//        }
//        一个数如果恰好等于它的因子之和，这个数就称为"完数"。（因子：除去这个数本身的约数）
//        例如6=1＋2＋3.编程 找出1000以内的所有完数
//        for (int i=1;i<=1000;i++)
//        {
//            int sum=0;
//            for (int j=1;j<i;j++)
//            {
//                if(i%j==0)
//                {
//                    sum+=j;
//                }
//            }
//            if(i==sum)
//            {
//                System.out.println(i);
//            }
//        }

//        输入两个正整数m和n，求其最大公约数和最小公倍数
//        int m=20;
//        int n=15;
//        int max=(m>n)?m:n;
//        int min=(m<n)?m:n;
//        for (int i=min;i>=1;i--)
//        {
//            if(m%i==0&&n%i==0)
//            {
//                System.out.println(i);
//                break;
//            }
//        }
//        for (int i=max;;i++)
//        {
//            if(i%m==0&&i%n==0)
//            {
//                System.out.println(i);
//                break;
//            }
//        }

//        根据指定月份，打印该月份所属的季节
//        分别使用if-else if-else语句和switch-case语句：
//        3,4,5 春季 6,7,8 夏季  9,10,11 秋季 12, 1, 2 冬季

//        方法一
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入月份:");
//        int month=scanner.nextInt();
//        if(month==3||month==4||month==5)
//        {
//            System.out.println("春季");
//        }else if(month==6||month==7||month==8)
//        {
//            System.out.println("夏季");
//        }else if(month==9||month==10||month==11)
//        {
//            System.out.println("秋季");
//        }else if(month==12||month==1||month==2)
//        {
//            System.out.println("冬季");
//        }
//        else {
//            System.out.println("请重新输入");
//        }

//        方法二
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入月份:");
//        int month=scanner.nextInt();
//        if(month>12&&month<1)
//        {
//            System.out.println("输入月份有误");
//        }else if(month>=3&&month<=5)
//        {
//            System.out.println("春季");
//        }else if(month>=6&&month<=8)
//        {
//            System.out.println("夏季");
//        }else if(month>=9&&month<=11)
//        {
//            System.out.println("秋季");
//        }
//        else{
//            System.out.println("冬季");
//        }

//        方法三
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入月份:");
//        int month=scanner.nextInt();
//        switch (month){
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("春季");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("夏季");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("秋季");
//                break;
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("冬季");
//                break;
//            default:
//                System.out.println("输入月份有误");
//                break;
//        }
//        已知学生成绩以100分为满分，共分5个等级：A,B,C,D,E
//        90～100为等级A，
//        80～89为等级B，
//        70～79为等级C，
//        60～69为等级D，
//        0～59为等级E。
//        要求定义一个成绩变量，当成绩变化时，可直接知道该成绩对应的等级。
//        例如：当成绩为100时，该学生的等级是A。
//        方法一
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入成绩:");
//        int score=scanner.nextInt();
//        switch (score/10){
//            case 0:
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("E");
//                break;
//            case 6:
//                System.out.println("D");
//                break;
//            case 7:
//                System.out.println("C");
//                break;
//            case 8:
//                System.out.println("B");
//                break;
//            case 9:
//            case 10:
//                System.out.println("A");
//                break;
//        }

//        方法二
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入成绩:");
//        int num=scanner.nextInt();
//        if(num>=90 && num<=100)
//            System.out.println("level = A");
//        else if(num>=80 && num<=89)
//            System.out.println("level = B");
//        else if(num>=70 && num<=79)
//            System.out.println("level = C");
//        else if(num>=60 && num<=69)
//            System.out.println("level = D");
//        else
//            System.out.println("level = E");

//        打印自然数的个数
//        1）打印1~100之间 6的倍数的个数
//        2）求出1～100之间，既是3又是7的倍数的自然数出现的次数？

//         int count=0;
//         for (int i=1;i<=100;i++)
//         {
//             if(i%6==0)
//             {
//                 count++;
//             }
//         }
//         System.out.println(count);

//        int count=0;
//        for (int i=0;i<=100;i++)
//        {
//            if(i%3==0&&i%7==0)
//            {
//                count++;
//            }
//        }
//        System.out.println(count);

//        求调和级数中从第多少项开始值大于10
//        调和级数的第n项形式为：1+1/2+1/3+…+1/n
//          int i=1;
//          double sum=0;
//          while (true){
//              sum+=1.0/i;
//              if (sum>10)
//              {
//                  break;
//              }
//              i++;
//          }
//          System.out.println(i);

        /*打印如下三角形
         *
         ***
         *****
         *******
         *****
         ***
         *
         */
        for (int i = 0; i < 7; i++) {
            if (i < 4) {
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int k = 0; k < 13 - 2 * i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
        //扩展

//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < 4 - i; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}
//        打印如下的图形：菱形2
//        for(int i=0;i<5;i++)
//        {
//           for(int j=0;j<2*i;j++)
//           {
//               System.out.print(" ");
//           }
//           for(int k=0;k<10-2*i;k++)
//           {
//               System.out.print("* ");
//           }
//           System.out.println();
//        }
//    }
//}
//
