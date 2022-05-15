package Java基础Day05面向对象中.面向对象中练习题.练习9;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-18 21:45
 * @Description:
 **/
public class Person {
    private String name;
    private double height;
    private String weipon;
    private String race;

    public Person() {
    }

    public Person(String name, double height, String weipon, String race) {
        this.name = name;
        this.height = height;
        this.weipon = weipon;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getWeipon() {
        return weipon;
    }

    public void setWeipon(String weipon) {
        this.weipon = weipon;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void walk(){
        System.out.println("姓名"+getName()+"; 种族:"+getRace());
    }

    public void skill(){
        if (getName()=="孙悟空")
        {
            System.out.println("七十二变");
        }else if(getName()=="唐僧")
        {
            System.out.println("紧箍咒");
        }else if(getName()=="白骨精")
        {
            System.out.println("九阴白骨爪");
        }
    }

    public boolean equals(Person p) {
        if (p.race=="仙族"||p.race=="人族")
        {
            return true;
        }else{
            return false;
        }
    }
}
