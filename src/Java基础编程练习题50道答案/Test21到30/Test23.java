package Java基础编程练习题50道答案.Test21到30;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-21 13:40
 * @Description:
 **/
public class Test23 {
        /**
         * 计算年龄的方法
         *
         * @param n
         * @return
         */
        public Integer getAge(Integer n) {
            // 第一个人年龄为10岁
            if (n == 1) {
                return 10;
            }
            // 当前人的岁数是前一个人的岁数+2,前一个人的岁数是getAge(n - 1)
            return getAge(n - 1) + 2;
        }

        public static void main(String[] args) {
            Test23 t = new Test23();
            System.out.println(t.getAge(5));
        }
    }

