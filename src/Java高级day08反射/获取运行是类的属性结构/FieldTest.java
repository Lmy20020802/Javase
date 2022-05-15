package Java高级day08反射.获取运行是类的属性结构;

import Java高级day08反射.提供结构丰富的Person类.Person;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created with IntelliJ IDEA.
 *
 * @author shkstart
 * @company 尚硅谷实习谷粉
 * @date 2022-01-17 09:40
 * @Description:
 * @name 李铭洋
 **/
public class FieldTest {

    @Test
    public void test1(){
        Class clazz= Person.class;

        //获取属性结构
        //getFields():获取当前运行时类及其父类中声明为public访问权限的属性
        Field[] fields = clazz.getFields();
        for (Field f:fields
             ) {
            System.out.println(f);
        }

        System.out.println();

        //getDeclaredFields():获取当前运行时类中声明的所有属性。（不包含父类中声明的属性）
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f:declaredFields
             ) {
            System.out.println(f);
        }
    }

    @Test
    public void test2(){
        Class clazz=Person.class;
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f:declaredFields
             ) {
            //1.权限修饰符
            int modifier = f.getModifiers();
            System.out.println(Modifier.toString(modifier));
            //2.数据类型
            Class type = f.getType();
            System.out.print(type.getName() + "\t");
            //3.变量名
            String fName = f.getName();
            System.out.println(fName);

            System.out.println();
        }
    }
}
