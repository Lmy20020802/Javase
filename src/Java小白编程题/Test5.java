package Java小白编程题;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 李铭洋
 * @company 王自立有限公司
 * @date 2021-12-05 19:35
 * @Description:
 **/
/*
其实我们可以通过父母的身高大致推断出子女的身高，假定父母与子女的身高遗传关系如下：
​ 儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
​ 女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
那已知：现有父亲身高175CM,母亲身高160CM。
请将预测的子女身高打印输出
 */
public class Test5 {
    public static void main(String[]args)
    {
        double father=175;
        double mather=160;
        double sun=(father+mather)*1.08/2;
        double daughter=((father*0.923)+mather)/2;
        System.out.println("儿子的身高:"+sun);
        System.out.println("女儿的身高:"+daughter);
    }
}
