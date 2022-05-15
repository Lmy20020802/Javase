package Java基础编程练习题50道答案.Test1到10;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-19 20:57
 * @Description:
 **/
public class Test10 {
    public static void main(String[] args) {
        double sum = 0;
        double height = 100;
        for(int i = 1;i<=10;i++){
            sum = height+height/2+sum;//一次落地距离+弹起距离+已经过路程
            height/=2;//弹起高度为一半

        }
        sum-=height;//求第10次落地经过路程需减去第10次弹起距离
        System.out.println("共经过"+sum+"米");
        System.out.println("第10次弹起的高度为："+height);
    }
}
