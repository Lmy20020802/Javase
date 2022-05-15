package Java高级day01多线程.创建多线程方式一继承Thread类.继承Thread类课后练习.多窗口卖票;

/**
 * Created with IntelliJ IDEA.
 *
 * 例子:创建三个窗口卖票,总票数为100张,使用继承Thread类的方式
 *
 * 存在线程的安全问题,待解决
 *
 * @author shkstart
 * @company 尚硅谷实习谷粉
 * @date 2021-12-26 11:19
 * @Description:
 * @name 李铭洋
 **/
class window extends Thread{

    private static int ticket=100;
    @Override
    public void run() {
        while (true){
            if (ticket>0){
                System.out.println(getName()+":卖票,票号为:"+ticket);
                ticket--;
            }else {
                break;
            }
        }
    }
}
public class WindowTest {
    public static void main(String[] args) {
        window w1=new window();
        window w2=new window();
        window w3=new window();
        w1.setName("窗口一");
        w2.setName("窗口二");
        w3.setName("窗口三");
        w1.start();
        w2.start();
        w3.start();
    }
}
