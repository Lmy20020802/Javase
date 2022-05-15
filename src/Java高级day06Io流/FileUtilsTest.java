package Java高级day06Io流;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author shkstart
 * @company 尚硅谷实习谷粉
 * @date 2022-01-15 23:09
 * @Description:
 * @name 李铭洋
 **/
public class FileUtilsTest {
    public static void main(String[] args) {
        File srcFile=new File("爱情与友情.jpg");
        File destFile=new File("爱情与友情2.jpg");
        try {
            FileUtils.copyFile(srcFile,destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
