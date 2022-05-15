package Java基础Day06面向对象下.接口.代理模式;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-16 15:27
 * @Description:
 **/
public class NetWorkTest {
    public static void main(String[] args) {
        Server server=new Server();
//        new ProxyServer(server);
        ProxyServer proxyServer=new ProxyServer(server);
        proxyServer.browse();
    }
}

interface NetWork{
    public void browse();
}

//被代理类
class Server implements NetWork{

    @Override
    public void browse() {
        System.out.println("真实的服务器访问网络");
    }
}

//代理类
class  ProxyServer implements NetWork{

    private NetWork work;

    public ProxyServer(NetWork work)
    {
        this.work=work;
    }

    public void check(){
        System.out.println("联网之前的检查工作");
    }

    @Override
    public void browse() {
        check();

        work.browse();
    }
}

