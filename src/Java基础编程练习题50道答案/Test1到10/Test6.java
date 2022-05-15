package Java基础编程练习题50道答案.Test1到10;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-19 15:59
 * @Description:
 **/
public class Test6 {
    public static void main(String[] args) {
        gcdlcm a =new gcdlcm();
        System.out.println("兩數的最大公約數是："+a.gcd(10, 16));
        System.out.println("兩數的最小公倍數是："+a.lcm(16, 10));
    }
}
class gcdlcm{
    int gcd(int m,int n){
        if(m<n){   //這個判斷是爲了將大數放在前面
            int temp=n;
            n=m;
            m=temp;
        }
        if(m%n==0){
            return n;
        }
        else{
            m%=n;
            return gcd(m,n);
            //這裡也可以寫成gcd(n,m)，就省掉了前面的判斷了，會快一點
        }
    }
    int lcm(int m,int n){
        int i=1;
        if(m<n){   //這個判斷是爲了將大數放在前面
            int temp=n;
            n=m;
            m=temp;
        }
        int lcm=m;
        while(lcm%n!=0){
            lcm=m*i;
            i++;
        }
        return lcm;
    }
}
