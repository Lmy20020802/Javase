package Java基础编程练习题50道答案.Test11到20;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-21 13:04
 * @Description:
 **/
public class Test20 {
        public static void main(String[] args) {
            double mu = 1, zi = 2;
            double sum = 0;

            for(int num = 0; num < 20; num++) {
                sum += (double)zi / mu;		//将分子的类型强制转换成double,否则两个int相除，结果还是int会将小数点后都舍弃。
                zi = mu + zi;
                //此时新分子已经是原分子分母的和了，只需要再减去原分母。即可将原分子赋给新分母。
                mu = zi - mu;
            }

            System.out.println(sum);
        }
    }
