package Java基础Day04面向对象上.值传递;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-02 07:44
 * @Description:
 **/
public class 值传递机制引用数据类型 {
    public static void main(String[]args)
    {
        Data data=new Data();
        data.m=10;
        data.n=20;
        System.out.println("m="+data.m+",n="+data.n);
        值传递机制引用数据类型 test=new 值传递机制引用数据类型();
        test.swap(data);
        System.out.println("m="+data.m+",n="+data.n);

    }
    public void swap(Data data)
    {
        int temp=data.m;
        data.m=data.n;
        data.n=temp;
    }
}
class Data{
    int m;
    int n;
}