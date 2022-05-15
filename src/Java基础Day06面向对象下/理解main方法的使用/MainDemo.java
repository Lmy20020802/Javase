package Java基础Day06面向对象下.理解main方法的使用;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-12 20:26
 * @Description:
 **/
public class MainDemo {
    public static void main(String[] args) {
        for (int i=0;i<args.length;i++)
        {
            System.out.println("*********"+args[i]);

            int num=Integer.parseInt(args[i]);
            System.out.println("########"+num);

        }
    }

}
