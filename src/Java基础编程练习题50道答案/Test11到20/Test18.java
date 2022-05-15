package Java基础编程练习题50道答案.Test11到20;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-20 21:54
 * @Description:
 **/
public class Test18 {
    public static void main(String[] args) {
        for(char i ='x';i<='z';i++){
            for(char j ='x';j<='z';j++){
                if(i!=j)//这里放一个判断，比赛队员不能重复比赛，判断写在外面又可以减少循环次数
                    for(char k = 'x';k<='z';k++){
                        if(i!=k&&j!=k)//同上，排除相同
                            if(i!='x'&&k!='x'&&k!='z')//这里根据题意排除掉不符合的名单
                                System.out.println("a和"+i+"\n"+"b和"+j+"\n"+"c和"+k+"\n");
                    }
            }
        }
    }
}
