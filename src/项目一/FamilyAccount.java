package 项目一;
import java.io.ByteArrayInputStream;

/*
思路：
1.while(true) 一直循环
2.本金的变量 balance
3.目录
4.用switch-case循环 分别写出1,2,3,4不同的功能
4.1 收支明细  String details="收支\t账户金额\t收支金额\t说明\n"; 定义格式和相应的语句
4.2 收入金额  键盘输入收入、说明 把本金+收入=现在的钱 按照格式写在收支名字里
4.3 支出金额  键盘输入支出、说明 判断支出的钱是否大于本金 如果大于则输出本金不够 如果小于 本金-支出=现在的钱 按照格式写在收支名字里
4.4. if判断退出如果输出的是Y 则退出 否则继续执行
 */
public class FamilyAccount {
    public static void main(String[]args)
    {
        boolean isFlag=true;
        //用于记录用户的收入和详情
        String details="收支\t账户金额\t收支金额\t说明\n";
        int balance=10000;
        while (isFlag){
            System.out.println("----------------家庭收支明细----------------");
            System.out.println("                 1.收支明细"                );
            System.out.println("                 2.登记收入"                );
            System.out.println("                 3.登记支出"                );
            System.out.println("                 4. 退 出  "                );
            System.out.println("                 请选择(1-4) "                );
            //获取用户的选择
            char selection=Utility.readMenuSelection();
            switch (selection){
                case '1':
//                  System.out.println("收支明细:");
                    System.out.println("-------------当前收支明细记录-------------");
                    System.out.println(details);
                    System.out.println("----------------------------------------");
                    break;
                case '2':
//                  System.out.println("登记收入:");
                    System.out.print("本次收入金额:");
                    int money=Utility.readNumber();
                    System.out.print("本次收入说明:");
                    String info=Utility.readString();
                    //处理balance
                    balance+=money;
                    //处理details
                    details+="收入\t"+balance+"\t\t"+money+"\t"+info+"\n";
                    System.out.println("---------------登记完成---------------\n");
                    break;
                case '3':
//                    System.out.println("登记支出:");
                    System.out.print("本次支出金额:");
                    int money1 = Utility.readNumber();
                    System.out.print("本次支出说明:");
                    String info1=Utility.readString();
                    if(balance>=money1)
                    {
                        balance-=money1;
                    }else {
                        System.out.println("支出超出额度，付款失败");
                    }
                    details+="支出\t"+balance+"\t\t"+money1+"\t"+info1+"\n";
                    System.out.println("---------------登记完成---------------\n");
                    break;
                case '4':
//                    System.out.println("退出:");
                    System.out.println("确认是否退出(y/n)");
                    char isExit=Utility.readConfirmSelection();
                    if(isExit=='Y'){
                        isFlag=false;
                    }
                    break;
            }
        }
    }
}
