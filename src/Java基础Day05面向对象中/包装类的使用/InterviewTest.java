package Java基础Day05面向对象中.包装类的使用;


import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-10 20:34
 * @Description:
 **/
public class InterviewTest {
    @Test
    public void test1(){
        Object o1=true?new Integer(1):new Double(2.0);
        System.out.println(o1);//1.0
    }
    @Test
    public void test2(){
        Object o2;
        if (true){
            o2=new Integer(1);
        }else {
            o2=new Double(2.0);
            System.out.println(o2);
        }
    }
    @Test
    public void test3(){
        Integer i=new Integer(1);
        Integer j=new Integer(1);
        System.out.println(i==j);

        //Integer内部定义了IntegerCache结构，IntegerCache中定义了Integer[],
        //保存了从-128~127范围的整数。如果我们使用自动装箱的方式，给Integer赋值的范围在
        //-128~127范围内时，可以直接使用数组中的元素，不用再去new了。目的：提高效率
        Integer m=1;
        Integer n=1;
        System.out.println(m==n);

        Integer x=128;//相当于new了一个Integer对象
        Integer y=128;//相当于new了一个Integer对象
        System.out.println(x==y);
    }
}
