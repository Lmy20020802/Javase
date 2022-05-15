package Java高级day02常用类.String类.String课后练习;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author shkstart
 * @company 尚硅谷实习谷粉
 * @date 2022-01-03 15:05
 * @Description:
 * @name 李铭洋
 **/
public class StringDemo {

    /*
    将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反转为”abfedcg”

    方式一：转换为char[]
    思路:
    1.定义一个方法 参数有字符串,开始的索引,结束的索引
    2.判断字符串是否为空
    3.字符串转换为数组  tocharArray()
    4.for循环遍历数组  开始的索引,结束的索引,当x<y的时候 x++ y-- (x往后,y往前)
    5.交换数组元素的位置
    6.返回的是一个数组 我们要把它转换为字符串 new string()
     */
    public String reverse(String str,int startIndex,int endIndex){

        if(str != null){
            char[] arr = str.toCharArray();
            for(int x = startIndex,y = endIndex;x < y;x++,y--){
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }

            return new String(arr);
        }
        return null;
    }

    //方式二：使用String的拼接
    /*
    思路:
    1.定义一个方法 参数为字符串,索引开始的位置,索引结束的位置
    2.判断字符串是否为空
    3.第一部分截取从头到开始索引的位置(不包含开始索引的位置,左闭右开)
    4.第二部分for循环从结束索引往前遍历 条件为endIndex的索引位置>=startIndex索引位置 endIndex--
    5.返回索引字符串charAt()
    6.第三部分从endIndex+1的时候开始取取到结束
    7.返回字符串
     */
    public String reverse1(String str,int startIndex,int endIndex){
        if(str != null){
            //第1部分
            String reverseStr = str.substring(0,startIndex);
            //第2部分
            for(int i = endIndex;i >= startIndex;i--){
                reverseStr += str.charAt(i);
            }
            //第3部分
            reverseStr += str.substring(endIndex + 1);

            return reverseStr;

        }
        return null;
    }
    //方式三：使用StringBuffer/StringBuilder替换String
    public String reverse2(String str,int startIndex,int endIndex){
        if(str != null){
            StringBuilder builder = new StringBuilder(str.length());

            //第1部分
            builder.append(str.substring(0,startIndex));
            //第2部分
            for(int i = endIndex;i >= startIndex;i--){

                builder.append(str.charAt(i));
            }
            //第3部分
            builder.append(str.substring(endIndex + 1));

            return builder.toString();
        }
        return null;

    }

    @Test
    public void testReverse(){
        String str = "abcdefg";
        String reverse = reverse2(str, 2, 5);
        System.out.println(reverse);
    }

}
