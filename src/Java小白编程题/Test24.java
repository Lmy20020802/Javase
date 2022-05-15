package Java小白编程题;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-08 10:27
 * @Description:
 **/
//练习题:打印100以内除了尾数为3,5,7的所有数
public class Test24 {
    public static void main(String[] args) {
        for (int i=0;i<=100;i++)
        {
            int y=i%10;
            if (y==3||y==5||y==7)
            {
                System.out.println(i);
            }
        }
    }
}
