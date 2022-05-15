package Java基础Day03数组.多维数组;

public class 多维数组的练习 {
    public static void main(String[] args) {
        /*
        杨辉三角思路:
        1.声明初始化一个二维数组   int[][] yangHui = new int[10][];
        2.给数组的元素 赋值    yangHui[i] = new int[i + 1];
        3.给首末元素赋值  yangHui[i][0]==yangHui[i][i]==1;
        4.给每行的非首末元素赋值
        yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
        5.遍历数组
         */
        //1.声明并初始化二维数组
        int[][] yangHui = new int[10][];

        //2.给数组的元素赋值
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];

            //2.1 给首末元素赋值
            yangHui[i][0] = yangHui[i][i] = 1;
            //2.2 给每行的非首末元素赋值
            //if(i > 1){
            for (int j = 1; j < yangHui[i].length - 1; j++) {
                yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
            }
            //}
        }


        //3.遍历二维数组
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + "  ");
            }
            System.out.println();
        }

        //方法2:
//        2.给数组的元素复制
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new int[i + 1];
//        }
//        //遍历数组
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                //判断是否为第一个和最后一个
//                if (j == 0 || i == j) {
//                    arr[i][j] = 1;     //2.1给首末元素赋值
//                } else {
//                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];   //2.2给每行的非首末元素赋值
//                }
//            }
//        }
//
//        // 3.遍历
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

//        扩展创建一个长度为6的int型数组，要求数组元素的值都在1-30之间，且是随机赋值。同时，要求元素的值各不相同。

    }
}



