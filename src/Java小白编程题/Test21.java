package Java小白编程题;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-06 19:43
 * @Description:
 **/
//练习题: 鸡兔同笼问题(穷举法)
//已知:鸡兔共35只,共94只脚,那么鸡和兔各几只?
public class Test21 {
    public static void main(String[] args) {
        //循环变量j,控制小鸡的个数: 0到35递增
        //循环变量t,控制兔子的个数: 35到0递减
        for (int i=0,j=35;i<=35;i++,j--) //如果有多个小条件,用逗号隔开
        {
            //保证脚的数量是94
            if (i*2+j*4==94)
            {
                System.out.println("鸡:"+i+"兔"+j);
            }
        }
    }
}
