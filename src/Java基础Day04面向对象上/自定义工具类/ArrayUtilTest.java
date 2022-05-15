package Java基础Day04面向对象上.自定义工具类;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-01 11:44
 * @Description:
 **/
public class ArrayUtilTest {
    public static void main(String[]args)
    {
        ArrayUtil util=new ArrayUtil();
        int[] arr=new int[]{32,34,5,3,54,654,-98,0,-53,5};
        int max=util.getMax(arr);
        System.out.println("最大值:"+max);
        int min= util.getMin(arr);
        System.out.println("最小值"+min);
        int sum= util.getSum(arr);
        System.out.println("总和"+sum);
        int avg=util.getAvg(arr);
        System.out.println("平均值"+avg);
        System.out.println("排序前:");
        util.print(arr);
        util.sort(arr);
        System.out.println("排序后:");
        util.print(arr);

        System.out.println("查找:");
        int index=util.getIndex(arr,5);
        if (index>=0){
            System.out.println("找到了，索引地址为:"+index);
        }else {
            System.out.println("未找到");
        }

        System.out.println("反转前:");
        util.print(arr);
        util.reverse(arr);
        System.out.println("反转后:");
        util.print(arr);

        System.out.println("复制后:");
        int arr1[]=util.copy(arr);
        util.print(arr1);
    }
}
