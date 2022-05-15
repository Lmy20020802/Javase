package Java高级day02常用类.IDEA中debug调试;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author shkstart
 * @company 尚硅谷实习谷粉
 * @date 2022-01-04 09:32
 * @Description:
 * @name 李铭洋
 **/
public class IDEADebug {
    @Test
    public void testStringBuffer(){
        String str=null;
        StringBuffer sb=new StringBuffer();
        sb.append(str);

        System.out.println(sb.length());//4
        System.out.println(sb);//"null"
        StringBuffer sb1=new StringBuffer(str);//抛异常 NullPointerException
        System.out.println(sb1);
    }
}
