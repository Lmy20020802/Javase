package Java基础Day04面向对象上.练习;

public class Exer4Test {
    public static void main(String[]args)
    {
//        4. 对象数组题目：
//        定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩
//        score(int)。 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
//        问题一：打印出3年级(state值为3）的学生信息。
//            问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
//            提示：
//            1) 生成随机数：Math.random()，返回值类型double;
//        2) 四舍五入取整：Math.round(double d)，返回值类型long。
//        练习3
//        5.声明一个日期类型MyDate：有属性：年year,月month，日day。创建2个日期
//        对象，分别赋值为：你的出生日期，你对象的出生日期，并显示信息。
        //声明一个student类型的数组
        Student1[] stus=new Student1[20];

        for (int i=0;i<stus.length;i++)
        {
            //给数组元素赋值
            stus[i]=new Student1();
            //给Student对象的属性赋值
            stus[i].number=i+1;
            //年级[1,6]
            stus[i].state=(int)(Math.random()*6+1);
            //成绩[0,100]
            stus[i].score=(int)(Math.random()*101);
        }

        //遍历数组
        for(int i=0;i<stus.length;i++)
        {
//            System.out.println(stus[i].number+","+stus[i].state+","+stus[i].score);
            System.out.println(stus[i].info());
        }
        System.out.println("************");

//        //问题一:打印出三年级(state值为3)的学生信息
//        for (int i=0;i<stus.length;i++)
//        {
//            if(stus[i].state==3)
//            {
//                System.out.println(stus[i].info());
//            }
//        }

        //问题二:使用冒泡排序按学生成绩排序,并遍历所有学生
        for(int i=0;i< stus.length-1;i++)
        {
            for (int j=0;j<stus.length-i-1;j++)
            {
                if(stus[j].score>stus[j+1].score)
                {
                    //如果需要换序 交换的是数组的元素 Student1对象
                    Student1 temp=stus[j];
                    stus[j]=stus[j+1];
                    stus[j+1]=temp;
                }
            }
        }
        for(int i=0;i<stus.length;i++)
        {
            System.out.println(stus[i].info());
        }
    }
}
class Student1{
    int number;//学号
    int state; //年级
    int score; //成绩

    //显示学生信息的方法
    public String info(){
        return "学号:"+number+",年级:"+state+",成绩"+score;
    }
}