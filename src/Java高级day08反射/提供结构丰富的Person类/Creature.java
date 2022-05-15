package Java高级day08反射.提供结构丰富的Person类;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @author shkstart
 * @company 尚硅谷实习谷粉
 * @date 2022-01-17 08:38
 * @Description:
 * @name 李铭洋
 **/
public class Creature <T> implements Serializable {
    private char gender;
    public double weight;

    private void breath(){
        System.out.println("生物呼吸");
    }

    public void eat(){
        System.out.println("生物吃东西");
    }
}
