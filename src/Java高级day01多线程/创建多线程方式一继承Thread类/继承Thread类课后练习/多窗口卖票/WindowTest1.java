package Java高级day01多线程.创建多线程方式一继承Thread类.继承Thread类课后练习.多窗口卖票;

/**
 * Created with IntelliJ IDEA.
 *
 * 例子:创建三个窗口卖票,总票数为100张,使用实现Runnable接口的方式
 *
 * @author shkstart
 * @company 尚硅谷实习谷粉
 * @date 2021-12-26 11:46
 * @Description:
 * @name 李铭洋
 **/

class window1 implements Runnable{
    private int ticket=100;

    @Override
    public void run() {
        while (true)
        {
            if (ticket>0){
                System.out.println(Thread.currentThread().getName()+":卖票,票号为:"+ticket);
                ticket--;
            }else {
                break;
            }
        }
    }
}

public class WindowTest1 {
    public static void main(String[] args) {
        window1 w1 = new window1();
        Thread t1=new Thread(w1);
        Thread t2=new Thread(w1);
        Thread t3=new Thread(w1);

        t1.setName("线程1");
        t2.setName("线程2");
        t3.setName("线程3");

        t1.start();
        t2.start();
        t3.start();
    }
}
