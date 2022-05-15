package Java高级day07网络编程.TCP和UDP协议;

import javax.net.ssl.HttpsURLConnection;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 *
 * @author shkstart
 * @company 尚硅谷实习谷粉
 * @date 2022-01-16 15:19
 * @Description:
 * @name 李铭洋
 **/
public class URLTest1 {
    public static void main(String[] args) {

        HttpsURLConnection urlConnection = null;
        InputStream is= null;
        FileOutputStream fos= null;
        try {
            URL url = new URL("http://localhost:8080/examples/beauty.jpg");

            urlConnection = (HttpsURLConnection) url.openConnection();

            urlConnection.connect();

            is = urlConnection.getInputStream();
            fos = new FileOutputStream("beauty3.jpg");

            byte[] buffer=new byte[1024];
            int len;
            while ((len=is.read(buffer))!=-1)
            {
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            if (fos!=null)
            {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is!=null)
            {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (urlConnection!=null){
                urlConnection.disconnect();
            }
        }
    }
}
