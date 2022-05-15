package Java基础Day01基本语法.基本语法;

public class eightString使用的强化说明 {
    public static void main(String[]args)
    {
//        String str1=4; 错
        String str2=3.5f+""; //对
        System.out.println(str2);
        System.out.println(3+4+ "hello"); //7hello
        System.out.println("hello" +3+4); //hello34
        System.out.println('a'+1+ "hello");//98hello
        System.out.println("hello" +'a'+1);//helloa1
        short s=5;
//        s=s-2;  错
        byte b=3;
//        b=b+4;   错
        b=(byte)(b+4); //对
        char c='a';
        int i=5;
        float d=.314F;
        double result=c+i+d; //对

        byte b1=5;
        short s1=3;
//        short t=s+b; //错
    }
}
