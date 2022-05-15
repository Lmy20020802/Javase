package Java高级day01多线程.线程安全模式的单例模式之懒汉式;

/**
 * Created with IntelliJ IDEA.
 *
 * 使用同步机制将单例模式中的懒汉式改写为线程安全的
 *
 * @author shkstart
 * @company 尚硅谷实习谷粉
 * @date 2021-12-27 11:41
 * @Description:
 * @name 李铭洋
 **/
public class BankTest {

}

class Bank{

    private Bank(){}

    private static Bank instance = null;

    public static Bank getInstance(){
        //方式一：效率稍差 快捷键ctrl+alt+t
//        synchronized (Bank.class) {
//            if(instance == null){
//
//                instance = new Bank();
//            }
//            return instance;
//        }
        //方式二：效率更高
        if(instance == null){

            synchronized (Bank.class) {
                if(instance == null){

                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}
