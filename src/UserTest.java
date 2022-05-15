import java.util.HashSet;
import java.util.Scanner;

/**
 * @ClassName UserTest
 * @Description TODO
 * @Author lmy
 * @Date 2022/5/9 08:24
 **/
public class UserTest {
    public static void main(String[] args) {

        // 创建HashSet集合对象
        HashSet<User> hs = new HashSet<>();

        sr(hs); // 调用用户输入的方法
        ck(hs);   // 注册成功后,调用查看方法,查看一下
    }
    // 创建查看方法
    public static void ck(HashSet<User> hs){
        System.out.println("用户名\t\t密码\t\t\t生日\t\t\t手机号\t\t\t邮箱");
        // 遍历集合
        for (User user : hs){
            System.out.println(user.getUserName() + "\t\t" + user.getPassword() + "\t" + user.getBirthday() + "\t" + user.getPhone() + "\t\t" + user.getEmail());
        }
    }
    // 用户输入
    public static void sr(HashSet<User> hs){
        Scanner in = new Scanner(System.in);
        System.out.println("--------用户注册--------");
        System.out.println("请输入用户名:");
        String name = in.nextLine(); // 用户输入用户名
        String mi;  // 定义在外面,让外部能访问到
        while (true) {
            System.out.println("请输入密码:");
            mi = in.nextLine();  // 用户输入密码
            System.out.println("请确认密码:");
            String qrm = in.nextLine();
            if (mi.equals(qrm)){  // 判断密码是否一致
                break;
            }else{
                System.out.println("两次密码不一致,请重新输入!");
            }
        }
        String sr;
        while (true) {
            System.out.println("请输入生日:");
            sr = in.nextLine();  // 用户输入生日
            if (isBirth(sr)){  // 调用方法,等于true退出循环
                break;
            }else{
                System.out.print("");
            }
        }
        String sjh;
        while (true) {
            System.out.println("请输入手机号:");
            sjh = in.nextLine();  // 用户输入手机号
            if (isPhone(sjh)){  // 调用方法,等于true退出循环
                break;
            }else{
                System.out.print("");
            }
        }
        String yx;
        while (true) {
            System.out.println("请输入邮箱:");
            yx = in.nextLine();  // 用户输入邮箱
            if (isEmail(yx)){   // 调用方法,等于true退出循环
                break;
            }else {
                System.out.print("");
            }
        }
        User user = new User(name,mi,sr,sjh,yx);  // 创建用户对象,将元素填进去
        hs.add(user);  // 调用集合方法,将用户对象存进去
        System.out.println("注册成功~!");  // 输出提示

    }
    // 判断生日格式是否正确
    public static boolean isBirth(String birth){

        boolean b = true;  // 一个定义boolean变量

        if (birth.length() != 10){   // 判断生日长度是否不为10
            System.out.println("生日格式不正确!");
            b = false;  // 不为10,将true改成false
        }else{
            for (int i = 0 ; i < birth.length() ; i++){   // 遍历String
                char c = birth.charAt(i);   // 将每个字符提取出来
                if (i == 4 || i == 7){   // i等于4或等于7时进入
                    if (! (c == '-')){    // 判断c是的字符是否为'-'
                        System.out.println("生日格式不正确!");
                        b = false; // 不为'-'将true改成false
                    }
                }else{
                    if (!(Character.isDigit(c))){  // 判断字符是否是数字
                        System.out.println("生日格式不正确!");
                        b = false;  // 如果不是数字,将true改成false
                    }
                }
            }
        }
        return b; // 返回这个变量
    }
    // 判断手机号是否正确
    public static boolean isPhone(String phone){
        boolean b = true;
        if (phone.length() != 11){  // 判断手机号的长度是否为11
            System.out.println("手机号格式不正确!");
            b = false;
            // 判断开头是否为13,15,17,18
        }else if (!(phone.startsWith("13")||phone.startsWith("15")||phone.startsWith("17")||phone.startsWith("18"))){
            System.out.println("手机号格式不正确!");
            b = false;
        }
        return b;
    }
    // 判断邮箱格式是否正确
    public static boolean isEmail(String email){
        boolean b = true;
        if (!email.contains("@")){  // 判断输入的邮箱是否带有@
            System.out.println("邮箱格式不正确!");
            b = false;
        }
        return b;
    }

}
