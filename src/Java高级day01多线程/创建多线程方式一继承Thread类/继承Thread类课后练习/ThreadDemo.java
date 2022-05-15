package Java高级day01多线程.创建多线程方式一继承Thread类.继承Thread类课后练习;

/**
 * Created with IntelliJ IDEA.
 *
 * 练习：创建两个分线程，其中一个线程遍历100以内的偶数，另一个线程遍历100以内的奇数
 *
 * @author shkstart
 * @company 尚硅谷实习谷粉
 * @date 2021-12-26 07:51
 * @Description:
 * @name 李铭洋
 **/
class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2==0)
            {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2!=0)
            {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        //方式1：
//        MyThread1 m1=new MyThread1();
//        MyThread2 m2=new MyThread2();
//        m1.start();
//        m2.start();

        //方式2：创建Thread类的匿名子类的方式：
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i%2==0)
                    {
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i%2!=0)
                    {
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();
    }
}
