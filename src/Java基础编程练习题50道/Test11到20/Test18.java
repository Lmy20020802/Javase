package Java基础编程练习题50道.Test11到20;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-20 21:34
 * @Description:
 **/
/*
题目：两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。有人向
队员打听比赛的名单。a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。

 */
public class Test18 {
    public static void main(String[] args) {
        for (char i='x';i<='z';i++)
        {
            for (char j='x';j<='z';j++)
            {
                if (i!=j)
                {
                    for (char k='x';k<='z';k++)
                    {
                        if (i!=k&&j!=k)
                        {
                           if (i!='x'&&k!='x'&&k!='z')
                           {
                               System.out.println("a和"+i+"\tb和"+j+"\tc和"+k);
                           }
                        }
                    }
                }
            }
        }
    }
}
