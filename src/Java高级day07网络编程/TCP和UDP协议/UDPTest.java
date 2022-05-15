package Java高级day07网络编程.TCP和UDP协议;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created with IntelliJ IDEA.
 *
 * @author shkstart
 * @company 尚硅谷实习谷粉
 * @date 2022-01-16 11:52
 * @Description:
 * @name 李铭洋
 **/
public class UDPTest {

    //发送端
    @Test
    public void sender(){
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket();

            String str="我是UDP方式发送的导弹";
            byte[] data=str.getBytes();
            InetAddress inet=InetAddress.getByName("127.0.0.1");
            DatagramPacket packet = new DatagramPacket(data,0,data.length,inet,9090);

            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket!=null)
            {
                socket.close();
            }
        }

    }

    //接收端
    @Test
    public void receiver(){
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket(9090);

            byte[] buffer=new byte[100];

            DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);

            socket.receive(packet);

            System.out.println(new String(packet.getData(),0,packet.getLength()));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket!=null)
            {
                socket.close();
            }
        }
    }
}
