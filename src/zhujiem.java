//需要有牌类，用户类，牌要用静态代码块来装，让他运行主函数的同时执行代码块
import java.util.*;
//准备牌组
public class zhujiem{
    public static List<paiku>  cr=new ArrayList<>();//在主函数外可以定义静态集合，该集合专门用来装牌
    public static List<paiku> xipai(List<paiku> arr){//洗牌方法
        Collections.shuffle(arr);
        return arr;
    }
    static {//当在静态属性中写代码时，属性都要带上static

        //用来初始化牌组
        int max=0;
        String[] arr={"♥","♠","♣","♦"};
        String []crr={"3","4","5","6","7","8","9","10","J","Q","k","A","2"};
        for(String h:crr){
            max++;//当h为3时，且遍历完后max变为1，然后3的大小都是1
            for(String k:arr){
                paiku c=new paiku (k,h,max);//把花色和牌号都丢进去,封装成一个对象
                    cr.add(c);//组了一个放一个

            }
        }
        cr.add(new paiku("🃏","大王",++max));/*大王与小王具有唯一性，所以需要单独添加*/
        cr.add(new paiku("🃏","小王",++max));/*因为大小王是单独加上去的，如果和上面一样先执行后加一，那么大王的max值大小
        会和2的max大小相同，小王的max甚至会比大王大*/
    }


    public static void main(String[] args) {
        //System.out.println(zhujiem.cr);//静态方法的好处就是可以直接用类名调用静态的方法或集合，重写toString方法后可以打印集合内容
        zhujiem.xipai(cr);//调用洗牌方法

        //实现玩家类和发牌逻辑
        List<paiku> play1=new ArrayList<>();/*玩家用来放牌的集合*/
        List<paiku> play2=new ArrayList<>();
        List<paiku> play3=new ArrayList<>();
        //一共有54张牌，要留3张底牌，发51张牌，因为是List集合有索引，可以直接用普通的for循环遍历
        for (int i= 0; i<cr.size()-3; i++) {
//根据索引拿牌
          if(i%3==0){
              System.out.println("玩家一接牌");
              play1.add(cr.get(i));
          } else if (i%3==1) {
              System.out.println("玩家二接牌");
              play2.add(cr.get(i));

          } else if (i%3==2) {
              System.out.println("玩家三接牌");
              play3.add(cr.get(i));
          }

        }
        List<paiku> shengpai=cr.subList(cr.size()-3,cr.size());//截取字符串，得到三张底牌
        //因为玩家都是自己订的，随机数又不想写，所以默认玩家一是地主
        for (int i = 0; i < shengpai.size(); i++) {
            play1.add(shengpai.get(i));
        }

        zhujiem.paixu(play1);//排序方法
        zhujiem.paixu(play2);
        zhujiem.paixu(play3);
        }
        public static void paixu(List<paiku>t){//提供排序的方法
        Collections.sort(t, new Comparator<paiku>() {
            @Override
            public int compare(paiku o1, paiku o2) {
                return o1.getMax()-o2.getMax();
            }
        });
            System.out.println(t);
    }

    }

