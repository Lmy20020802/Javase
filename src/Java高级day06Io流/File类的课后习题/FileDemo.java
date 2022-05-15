package Java高级day06Io流.File类的课后习题;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author shkstart
 * @company 尚硅谷实习谷粉
 * @date 2022-01-13 09:34
 * @Description:
 * @name 李铭洋
 **/
public class FileDemo {

    @Test
    public void test1() throws IOException {
        File file=new File("D:\\IntelliJ IDEA Community Edition 2021.2.3\\io\\io1\\hello.txt");
        File destFile=new File(file.getParent(),"haha.txt");
        boolean newFile = destFile.createNewFile();
        if(newFile)
        {
            System.out.println("创建成功");
        }
    }
}
