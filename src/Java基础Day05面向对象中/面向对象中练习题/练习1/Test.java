package Java基础Day05面向对象中.面向对象中练习题.练习1;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-12 08:53
 * @Description:
 **/
public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        A b = new B();
        b.show();
    }
}

class A {
    int a = 1;
    double d = 2.0;

    void show() {
        System.out.println("Class A: a=" + a + "\td=" + d);
    }
}

class B extends A {
    float a = 3.0f;
    String d = "Java program.";

    void show() {
        super.show();
        System.out.println("Class B: a=" + a + "\td=" + d);
    }
}
