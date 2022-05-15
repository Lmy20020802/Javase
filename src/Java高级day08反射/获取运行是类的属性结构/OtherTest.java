package Java高级day08反射.获取运行是类的属性结构;

import Java高级day08反射.提供结构丰富的Person类.Person;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created with IntelliJ IDEA.
 *
 * @author shkstart
 * @company 尚硅谷实习谷粉
 * @date 2022-01-17 11:22
 * @Description:
 * @name 李铭洋
 **/
public class OtherTest {

    @Test
    public void test1(){
        Class clazz= Person.class;
        //getConstructors():获取当前运行时类中声明为public的构造器
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor c:constructors
             ) {
            System.out.println(c);
        }
        System.out.println();

        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor c:declaredConstructors
        ) {
            System.out.println(c);
        }
    }

    /*
   获取运行时类的父类

    */
    @Test
    public void test2(){
        Class Clazz = Person.class;
        Class superclass = Clazz.getSuperclass();
        System.out.println(superclass);
    }

    /*
   获取运行时类的带泛型的父类

    */
    @Test
    public void test3(){
        Class clazz = Person.class;

        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);
    }
    
      /*
    获取运行时类的带泛型的父类的泛型


    代码：逻辑性代码  vs 功能性代码
     */
    
    @Test
    public void test4(){
        Class clazz = Person.class;

        Type genericSuperclass = clazz.getGenericSuperclass();
        ParameterizedType paramType=(ParameterizedType)genericSuperclass;
        
        //获取泛型类型
        Type[] actualTypeArguments = paramType.getActualTypeArguments();
//        System.out.println(actualTypeArguments[0].getTypeName());
        System.out.println(((Class)actualTypeArguments[0]).getName());

    }

    @Test
    public void test5(){
        Class clazz=Person.class;
        Class[] interfaces = clazz.getInterfaces();
        for (Class c:interfaces
             ) {
            System.out.println(c);
        }

        System.out.println();

        System.out.println();
        //获取运行时类的父类实现的接口
        Class[] interfaces1 = clazz.getSuperclass().getInterfaces();
        for(Class c : interfaces1){
            System.out.println(c);
        }
    }

    /*
           获取运行时类所在的包

        */
    @Test
    public void test6(){
        Class clazz = Person.class;

        Package pack = clazz.getPackage();
        System.out.println(pack);
    }

    /*
     获取运行时类声明的注解

  */
    @Test
    public void test7(){
        Class clazz = Person.class;

        Annotation[] annotations = clazz.getAnnotations();
        for(Annotation annos : annotations){
            System.out.println(annos);
        }
    }
}
