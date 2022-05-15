package Java基础Day06面向对象下.接口.JDK8新特性.应用;

import java.util.logging.Filter;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-22 22:24
 * @Description:
 **/
interface Filial{//孝顺的
    default void help(){
        System.out.println("老妈,我来救你了!");
    }
}

interface Spoony{//痴情的
    default void help(){
        System.out.println("媳妇,别怕,我来了");
    }
}

class Father{
    public void help(){
        System.out.println("儿子,救我媳妇");
    }
}
class Man extends Father implements Filial,Spoony{
    @Override
    public void help(){
        System.out.println("我该怎么办呢!");
        Filial.super.help();
        Spoony.super.help();
    }
}