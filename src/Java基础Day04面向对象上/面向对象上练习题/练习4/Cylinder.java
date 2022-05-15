package Java基础Day04面向对象上.面向对象上练习题.练习4;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-11 16:23
 * @Description:
 **/
/*
（1）声明一个圆柱体类型，
（2）声明属性：底边的半径，和高
（3）声明方法：
A：方法的功能：在方法中打印圆柱体的详细信息
	圆柱体的底边的半径是xxx，高是xxx，底面积是xxx，体积是xxx。
B：方法的功能：返回底面积
C：方法的功能：返回体积
D：方法的功能：为圆柱体的底边的半径，和高赋值
E：方法的功能：为圆柱体的底边的半径，和高赋值，并返回赋值的结果
	如果底边的半径或高为<=0，赋值失败，返回false，否则返回true
（4）并测试

 */
//（1）声明一个圆柱体类型，
public class Cylinder {
//    声明属性：底边的半径，和高
    double radius;  //半径
    double height;  //高

//    A：方法的功能：在方法中打印圆柱体的详细信息
//  	圆柱体的底边的半径是xxx，高是xxx，底面积是xxx，体积是xxx。
    public void printDetails(){


        System.out.println("半径="+radius+",高是="+height+",底面积="+
                getArea()+",体积是"+getVolume());
    }
//    B：方法的功能：返回底面积
    public double getArea(){
        double area=Math.PI*radius*radius; //底面积
        return area;
    }
//    C：方法的功能：返回体积
    public double getVolume(){
        double volume=getArea()*height; //体积
        return volume;
    }
//    D：方法的功能：为圆柱体的底边的半径，和高赋值
    public void setValue(double r,double h)
    {
        radius=r;
        height=h;
    }
//    E：方法的功能：为圆柱体的底边的半径，和高赋值，并返回赋值的结果
//    如果底边的半径或高为<=0，赋值失败，返回false，否则返回true
    public boolean setRadiusAndHeight(double r, double h){
        if (r<=0||h<=0)
        {
            return false;
        }
        setValue(r,h);
        return true;
    }
}
