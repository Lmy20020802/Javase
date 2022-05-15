public class paiku {
    private  String nubemin;
    private String colck;
    private int max;


    public paiku(){

    }

    public paiku(String colck , String nubemin,int max) {/*这个类的最主要的作用是提供有参构造器，让牌类能组合起来*/
        this.nubemin = nubemin;
        this.colck = colck;
        this.max=max;
    }

    public String getNubemin() {
        return nubemin;
    }

    public void setNubemin(String nubemin) {
        this.nubemin = nubemin;
    }

    public String getColck() {
        return colck;
    }

    public void setColck(String colck) {
        this.colck = colck;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String toString(){//重写方法
        return colck+nubemin;
}
}
