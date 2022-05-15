package Java基础Day06面向对象下.理解main方法的使用;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-12 10:40
 * @Description:
 **/
/*
 * main()方法的使用说明：
 * 1. main()方法作为程序的入口
 * 2. main()方法也是一个普通的静态方法
 * 3. main()方法可以作为我们与控制台交互的方式。（之前：使用Scanner）
 *
 *
 *
 */
public class MainTest {
    public static void main(String[] args) {//入口
        Main.main(new String[100]);
        show();
    }
    public static void show(){

    }
}
class Main{
    public static void main(String[] args) {
        for (int i=0;i<args.length;i++)
        {
            args[i]="agrs_"+i;
            System.out.println(args[i]);
        }
    }
}
