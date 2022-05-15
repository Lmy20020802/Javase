package Java基础编程练习题50道答案.Test1到10;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-19 14:59
 * @Description:
 **/
public class Test2 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 101;i < 200;i++) {
            //判断i是不是素数
            boolean flag = true;//假设i是素数
            for(int j = 2;j <=i/2;j++) {//这里改成了i/2
                if(i % j==0) {
                    flag = false;//表示i不是素数
                    break;
                }
            }
            if(flag) {
                count++;
                System.out.println("素数有"+i);
            }
        }
        System.out.println("总共有"+count+"个");
    }
}
