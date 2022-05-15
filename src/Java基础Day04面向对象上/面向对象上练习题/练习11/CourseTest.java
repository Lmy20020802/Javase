package Java基础Day04面向对象上.面向对象上练习题.练习11;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-11 22:48
 * @Description:
 **/
/*
属性：课程名；学时；任课老师；
创建五个对象：“c语言”，“java编程”，“php网络编程”，“c++”，“数据结构”
提供无参的构造器和一个有参的构造器

 */
public class CourseTest {
    public static void main(String[] args) {
        Course c1=new Course("C语言",12,"王老师");
        c1.self();
        Course c2=new Course("java",10,"杨老师");
        c2.self();
        Course c3=new Course("php网络编程",8,"叶老师");
        c3.self();
        Course c4=new Course("c++",16,"李老师");
        c4.self();
        Course c5=new Course("数据结构",4,"周老师");
        c5.self();
    }
}
class Course{
    String curriculumname; //课程名
    int period; //学时
    String teacher;//任课老师

    public Course(){

    }

    public Course(String curriculumname,int period,String teacher)
    {
        this.curriculumname=curriculumname;
        this.period=period;
        this.teacher=teacher;
    }
    public void self(){
        System.out.println("课程名"+this.curriculumname+"\t"+"学时"+this.period+"\t"+"任课老师"+this.teacher);
    }
}
