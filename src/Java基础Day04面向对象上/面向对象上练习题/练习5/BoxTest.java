package Java基础Day04面向对象上.面向对象上练习题.练习5;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-11 18:45
 * @Description:
 **/
/*
编程创建一个Box类，在其中定义三个变量表示一个立方体的长、宽和高
，定义一个方法求立方体的体积。创建一个对象，求给定尺寸的立方体的体积。
 */
public class BoxTest {
    public static void main(String[] args) {
        Box box=new Box();
        Box box1=new Box(1.0,2.0,3.0);
        double Volume=box1.volume();
        System.out.println(Volume);
    }
}
class Box{
    double len;
    double wide;
    double high;
    public Box(){

    }
    public Box(double len,double wide,double high)
    {
        this.len=len;
        this.wide=wide;
        this.high=high;
    }
    public double volume(){
        return this.len*this.wide*this.high;
    }
}
