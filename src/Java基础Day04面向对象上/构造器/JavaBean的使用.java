package Java基础Day04面向对象上.构造器;
/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-03 15:32
 * @Description:
 **/
/*
 * JavaBean是一种Java语言写成的可重用组件。

	所谓JavaBean，是指符合如下标准的Java类：
		>类是公共的
		>有一个无参的公共的构造器
		>有属性，且有对应的get、set方法

 *
 */
public class JavaBean的使用 {
    private int id;
    private String name;
    public JavaBean的使用(){

    }

    public void setId(int i)
    {
        id=i;
    }
    public int getId(){
        return id;
    }
    public void setName(String n)
    {
        name=n;
    }
    public String getName(){
        return name;
    }
}
