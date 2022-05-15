package Java基础Day07异常处理.重写方法异常抛出的规则;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-25 16:37
 * @Description:
 **/
public class OverrideTest {
    public static void main(String[] args) {
        OverrideTest test=new OverrideTest();
        test.display(new SubClass());
    }
    public void display(SuperClass s)
    {
        try {
            s.method();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class SuperClass{

    public void method() throws IOException{

    }
}
class SubClass extends SuperClass{

    public void method() throws FileNotFoundException {

    }
}
