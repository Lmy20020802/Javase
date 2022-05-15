package Java基础Day05面向对象中.多态性.多态性练习.面试题;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-08 19:59
 * @Description:
 **/
public class InterviewTest1 {

    public static void main(String[] args) {
        Base base = new Sub();
        base.add(1, 2, 3);

		Sub s = (Sub)base;
		s.add(1,2,3);
    }
}

class Base {
    public void add(int a, int... arr) {
        System.out.println("base");
    }
}

class Sub extends Base {

    public void add(int a, int[] arr) {
        System.out.println("sub_1");
    }

	public void add(int a, int b, int c) {
		System.out.println("sub_2");
	}

}