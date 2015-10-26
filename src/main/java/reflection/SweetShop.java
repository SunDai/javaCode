package reflection;

/**
 * Created by xh on 2015/10/26.
 */
public class SweetShop {

    public static void main(String[] args){
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
            Class.forName("reflection.Gum");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("After Class.forName(\"Gum\")");

        new Cookie();
        System.out.println("After creating Cookie");

        try {
            Class c = Class.forName("");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
