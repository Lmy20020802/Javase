package Java基础Day05面向对象中.面向对象中练习题.练习3;

import java.util.Date;
import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-12 09:58
 * @Description:
 **/
public class Person {
        String id;
        String sex;
        String name;
        int age;
        String census;
        String date;

        public Person(){

        }

    public Person(String id, String sex, String name, int age, String census, String date) {
        this.id = id;
        this.sex = sex;
        this.name = name;
        this.age = age;
        this.census = census;
        this.date = date;
    }

    public void self(){
            System.out.println(id+"\t"+name+"\t"+census);
        }

    @Override
    public boolean equals(Object o){
        if (o == this){return true;}
        if (o == null || o.getClass() != this.getClass()){
            return false;
        }
        Person o1 = (Person) o;
        return this.id == o1.id && this.name == o1.name;
    }
}

