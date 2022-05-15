package Java基础Day02循环;

public class 每日一考 {
    public static void main(String[]args){
//        1.	switch后面使用的表达式可以是哪些数据类型的。
        //byte、short、char、int、枚举类型、String类型

//        2. 使用switch语句改写下列if语句：
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
//
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

//        谈谈你对三元运算符、if-else和switch-case结构使用场景的理解
//        if(a != b){
//            c = a;
//        }else{
//            c = b;
//        }
//
//        int c = (a != b)? a : b;
//
//        int c = a;

//        4. 如何从控制台获取String和int型的变量，并输出？使用代码实现
//        Scanner scanner=new Scanner(System.in);
//        String str= scanner.next();
//        int i=scanner.nextInt();

//        5. 使用for循环遍历100以内的奇数，并计算所有的奇数的和并输出
        int sum=0;
        int count=0;
        for (int i=1;i<=100;i++){
            if (i%2!=0){
                sum+=i;
                count++;
            }
        }
        System.out.println(sum);
        System.out.println(count);
    }
}
