package Java基础Day02循环.if循环;

public class if循环练习4 {
    public static void main(String[]args)
    {
//        1.编写程序，声明2个int型变量并赋值。判断两数之和，如果大于等于50，打印“hello world!”
//        int i1=40;
//        int i2=20;
//        if(i1+i2>50){
//            System.out.println("hello world");
//        }

//        2.编写程序，声明2个double型变量并赋值。判断第一个数大于10.0，
//        且第2个数小于20.0，打印两数之和。否则，打印两数的乘积。
//        double d1=11;
//        double d2=10;
//        if(d1>10&&d2<20){
//            System.out.println(d1+d2);
//        }else {
//            System.out.println(d1*d2);
//        }

//        3.我家的狗5岁了，5岁的狗相当于人类多大呢？其实，狗的前两年每
//        一年相当于人类的10.5岁，之后每增加一年就增加四岁。那么5岁的狗
//        相当于人类多少年龄呢？应该是：10.5 + 10.5 + 4 + 4 + 4 = 33岁。
        /*
        1.先定义狗的年龄
        2.判断 分为三个区间 0  0-2 2-……
        3.当为0时 输出狗狗还没出生 当为0-2的时候 每一年等于10.5岁 n*10.5 当为2-……时 前两年是2*10.5
        这时年龄应该-2再乘4 2*10.5+(n-2)*4
         */
//        int dogAge=5;
//        if (dogAge>=0 && dogAge<=2){
//            System.out.println(dogAge*10.5);
//        }else if(dogAge>2){
//            System.out.println(2*10.5+(dogAge-2)*4);
//        }else
//        {
//            System.out.println("狗狗还没出生");
//        }
        //课后练习4：如何获取一个随机数：10 - 99
//        double value=(int)(Math.random()*90+10); //[0.0,1.0)--[0.0,90,0)---[10.0,100.0)
//        System.out.println(value);
//        //公式:[a,b] : (int)(Math.random()*(b-a+1)+a)

        /*
        1.获取一个随机数  (int)(Math.random()*(b-a+1)+a)
        2.获取随机数的十位和个位
        3.键盘输入一个二位数 Scanner scanner=new Scanner(System.in);  int number3=scanner.nextInt();
        4.获取键盘输入的十位和个位
        5.if判断 五种情况 1.俩个数相等的时候 2.顺序不一样但是数字都匹配到了 3.顺序一样只匹配到一个数字  4.顺序不一样只匹配到一个数 5.完全不匹配
         */
//        假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票，提示用户输入
//        一个两位数，然后按照下面的规则判定用户是否能赢。
//        1)如果用户输入的数匹配彩票的实际顺序，奖金10 000美元。
//        2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金 3 000美元。
//        3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
//        4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
//        5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。
//        int number=(int)(Math.random()*90+10);// [0.0,1.0)--[0.0,90,0)---[10.0,100.0)
//        System.out.println("随机的数字为"+number);
//        int number1=number/10;
//        int number2=number%10;
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入你猜测的数字");
//        int number3=scanner.nextInt();
//        int number4=number3%10;
//        int number5=number3%10;
//        if (number==number3){
//            System.out.println("奖金10000美元");
//        }else if(number1==number5&&number2==number4)
//        {
//            System.out.println("奖金3000美元");
//        }else if(number1==number4 ||number2==number5)
//        {
//            System.out.println("奖金1000美元");
//        }else if(number1==number5||number2==number4)
//        {
//            System.out.println("奖金500美元");
//        }else{
//            System.out.println("没有奖金");
//        }
//        System.out.println("中奖号码是"+number);

        /*
          1.键盘输入 身高 财富  帅
          2.if判断  三种情况 1.全部满足 2.只满足一个 3.一个都不满足
         */
//        大家都知道，男大当婚，女大当嫁。那么女方家长要嫁女儿，当然要提出
//        一定的条件：高：180cm以上；富：财富1千万以上；帅：是。
//        如果这三个条件同时满足，则：“我一定要嫁给他!!!”
//        如果三个条件有为真的情况，则：“嫁吧，比上不足，比下有余。”
//        如果三个条件都不满足，则：“不嫁！”
//          Scanner scan=new Scanner(System.in);
//          System.out.println("请输入身高:");
//          int height=scan.nextInt();
//          System.out.println("请输入财富：");
//          double money=scan.nextDouble();
//          System.out.println("请输入你帅么(true/false)");
//          boolean isHandsome=scan.nextBoolean();
//          if (height>=180 &&money>=10000000 && isHandsome==true){
//              System.out.println("我一定要嫁给你");
//          }else if(height>=180 ||money>=10000000 || isHandsome==true)
//          {
//              System.out.println("嫁吧，比上不足，比下有余。");
//          }else{
//              System.out.println("不嫁！");
//          }


    }
}
