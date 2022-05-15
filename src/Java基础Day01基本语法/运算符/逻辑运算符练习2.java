package Java基础Day01基本语法.运算符;

public class 逻辑运算符练习2 {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        short z = 42;
        //if(y == true)

        if ((z++ == 42) && (y = true)) z++; //44
        if ((x = false) || (++z == 45)) z++;//46
        System.out.println("z="+z);
    }
}

