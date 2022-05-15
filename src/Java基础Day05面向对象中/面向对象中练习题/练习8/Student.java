package Java基础Day05面向对象中.面向对象中练习题.练习8;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-18 14:57
 * @Description:
 **/
public class Student extends Person{
    private String id;

    public Student() {
    }

    public Student(String name, String sex, int age,String id) {
        super(name, sex, age);
        this.id=id;
    }


    public boolean equals(Student student) {
        if (this.getName()==student.getName()||this.id==student.id)
        {
            return true;
        }else {
            return false;
        }
    }

}
