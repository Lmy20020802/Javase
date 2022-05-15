package Java基础Day04面向对象上.this关键字;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-04 08:22
 * @Description:
 **/
public class Girl {
    private String name;
    private int age;
    public Girl(){

    }
    public  Girl(String name)
    {
        this.name=name;
    }
    public Girl(String name ,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void marry(Boy boy)
    {
        System.out.println("我想嫁给"+boy.getName());
        boy.marry(this);
    }
    /**
    * @Description: 比较两个对象的大小
    * @Param: [Java基础Day04面向对象上.this关键字.Girl]
    * @return: 正数:当前对象大 负数:当前对象小 0 目前对象与形参对象相等
    * @Author: 李铭洋
    * @Date: 2021/12/04 08:37:15
    */
    public int compare(Girl girl){
//        if (this.age>girl.age)
//        {
//            return 1;
//        }else if(this.age<girl.age)
//        {
//            return -1;
//        }
//        else {
//            return 0;
//        }
        return this.age- girl.age;
    }
}
