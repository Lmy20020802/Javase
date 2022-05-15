package Java基础Day03数组.数组中常见的算法;

public class 冒泡排序 {
    public static void main(String[] args) {
        /*
        冒泡排序思路：
        1.初始化一个数组并赋值
        2.for循环i控制循环的次数为长度-1次
        3.for循环j 一一比较 第一次循环长度-1 次  第二次就是-2次 第三次就是-3次  所以j<arr.length-1-i
        4.判断如果后一个比前一个大我们就交换
        5.遍历数组
         */
        int[] arr = new int[]{43, 32, 76, -98, 0, 64, 33, -21, 32, 99};
        //冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 1; i < arr.length; i++) {
             System.out.print(arr[i] + "\t");
        }
    }
}

