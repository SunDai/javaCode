import java.util.Random;

/**
 * Created by xh on 2016/5/26.
 */
public class Randomint {
    public static void main(String[] args){
        Random random = new Random();
        for (int i = 0; i<100;i++){
            System.out.println(random.nextInt(100)+1);
        }
    }
}
