package Java高级day07网络编程.TCP和UDP协议;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 *
 * @author shkstart
 * @company 尚硅谷实习谷粉
 * @date 2022-01-16 15:12
 * @Description:
 * @name 李铭洋
 *
 * URL网络编程
 * 1.URL:统一资源定位符，对应着互联网的某一资源地址
 * 2.格式：
 *  http://localhost:8080/examples/beauty.jpg?username=Tom
 *  协议   主机名    端口号  资源地址           参数列表
 **/
public class URLTest {
    public static void main(String[] args) {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/examples/beauty.jpg?username=Tom");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

//            public String getProtocol(  )     获取该URL的协议名
        System.out.println(url.getProtocol());
//            public String getHost(  )           获取该URL的主机名
        System.out.println(url.getHost());
//            public String getPort(  )            获取该URL的端口号
        System.out.println(url.getPort());
//            public String getPath(  )           获取该URL的文件路径
        System.out.println(url.getPath());
//            public String getFile(  )             获取该URL的文件名
        System.out.println(url.getFile());
//            public String getQuery(   )        获取该URL的查询名
        System.out.println(url.getQuery());
    }
}
