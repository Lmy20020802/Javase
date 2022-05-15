package Java小白编程题;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-08 22:39
 * @Description:
 **/
//练习题:求任意数组中所有元素的最大值
public class Test31 {
    public static void main(String[] args) {
        int [] arr=new int[]{10,20,30,40,50};
        int max=0;
        for (int i=0;i<arr.length;i++)
        {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("最大值:"+max);
    }
}
