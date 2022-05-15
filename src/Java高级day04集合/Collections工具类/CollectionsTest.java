package Java高级day04集合.Collections工具类;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author shkstart
 * @company 尚硅谷实习谷粉
 * @date 2022-01-10 22:42
 * @Description:
 * @name 李铭洋
 **/
public class CollectionsTest {

    @Test
    public void test2(){
        List list=new ArrayList();
        list.add(123);
        list.add(43);
        list.add(121);
        list.add(765);
        list.add(-95);
        list.add(0);

//        List dest=new ArrayList();

//        Collections.copy(dest,list);

        List dest= Arrays.asList(new Object[list.size()]);
        Collections.copy(dest,list);

        System.out.println(dest);

        List list1 = Collections.synchronizedList(list);

    }

    @Test
    public void test1(){
        List list=new ArrayList();
        list.add(123);
        list.add(43);
        list.add(121);
        list.add(765);
        list.add(765);
        list.add(765);
        list.add(-95);
        list.add(0);

        System.out.println(list);

//        Collections.reverse(list);
//        Collections.shuffle(list);
//        Collections.sort(list);
//        Collections.swap(list,1,2);
        int frequency = Collections.frequency(list, 765);
        System.out.println(frequency);
        System.out.println(list);
    }
}
