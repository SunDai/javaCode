package reflection;

/**
 * Created by xh on 2015/10/26.
 */
public class Candy extends Sweet{

    static{
        System.out.println("Loading Candy");
    }

    private String name;

    private int num;

    private final String id = "sundai_candy_001";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        System.out.println("this candy num is "+this.num);
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    void init(){
        System.out.println("call invisible init method");
    }

    private void increase(int num){
        this.num += num;
    }



}
