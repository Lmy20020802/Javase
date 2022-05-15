package Java基础编程练习题50道答案;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-22 15:50
 * @Description:
 **/
public class Test33 {
        public static void main(String[] args) {
//            //方法1：
//            //定义了一个长度为10，高度为10的二维数组，数组中的值都为0；
//            int[][] arr=new int[10][10];
//            for(int i=0;i<arr.length; i++) {
//                //由于只是给杨辉三角内的位置赋值，所以是j<=i
//                for(int j=0;j<=i;j++) {
//                    //根据规律，使用if else 赋值
//                    if(j==0||j==i) {
//                        arr[i][j]=1;
//                    }else {
//                        arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
//                    }
//				/*由于只是输出杨辉三角范围内的值，所以在内层循环就输出，这种方法不能全部赋值完之后再输出
//					"\t"的原因是10和小于10的数组的宽度不同，所以使用\t制表符能使数与数之间距离相等
//				*/
//                    System.out.print(arr[i][j]+"\t");
//                }
//                System.out.println();
//            }

            //方法2
                    int[][] arr=new int[10][];
                    for(int i=0;i<arr.length;i++) {
                        arr[i]=new int[i+1];
                    }
                    for(int i=0;i<arr.length;i++) {
                        for(int j=0;j<arr[i].length;j++) {
                            if(j==0 || i==j) {
                                arr[i][j]=1;
                            }else {
                                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
                            }
                        }
                    }
                    for(int i=0;i<arr.length;i++) {
                        int num=(arr.length-i)/2;
                        for(int k=0;k<=num;k++) {
                            System.out.print("\t");
                        }
                        for(int j=0;j<arr[i].length;j++) {
                            System.out.print(arr[i][j]+"\t");
                        }
                        System.out.println();
                    }
                }
            }
