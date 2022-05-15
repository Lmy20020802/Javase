package Java基础Day05面向对象中.方法的重写;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-06 09:29
 * @Description:
 **/
public class Student extends Person{
    String major;
    public Student(){

    }
    public Student(String major){
        this.major=major;
    }
    public void study(){
        System.out.println("专业是:"+major);
    }
    //对父类的重写
    public void eat(){
        System.out.println("学生应该多吃有营养的食物");
    }

//    private void eat(){
//        System.out.println("学生应该多吃有营养的食物");
//    }

//    public void show(){
//        System.out.println("人");
//    }

    public String info(){
        return null;
    }
    public void walk(int distance){
        System.out.println("重写的方法");
    }

}
