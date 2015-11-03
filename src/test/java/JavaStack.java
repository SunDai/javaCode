import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

/**
 * Created by xh on 2015/11/2.
 */
public class JavaStack {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        String al = "(";
        String ar = ")";
        String bl = "[";
        String br = "]";
        String cl = "{";
        String cr = "}";
        Set<String> set = new HashSet<String>();
        set.add(al);
        set.add(ar);
        set.add(bl);
        set.add(br);
        set.add(cl);
        set.add(cr);
        Stack<String> stack = new Stack<String>();
        while (sc.hasNext()) {
            String input=sc.next();
            stack.clear();
            for (int i=0;i<input.length();i++){
                String str = String.valueOf(input.charAt(i));
                if (set.contains(str)){
                    if (stack.size() == 0){
                        stack.push(str);
                    }else {
                        if (str.equals(ar)){
                            if (stack.elementAt(stack.size()-1).equals(al)){
                                stack.pop();
                                continue;
                            }
                        }else if (str.equals(br)){
                            if (stack.elementAt(stack.size()-1).equals(bl)){
                                stack.pop();
                                continue;
                            }
                        }else if (str.equals(cr)){
                            if (stack.elementAt(stack.size()-1).equals(cl)){
                                stack.pop();
                                continue;
                            }
                        }
                        stack.push(str);

                    }
                }
            }
            if (!stack.isEmpty()){
                System.out.println("false");
            }else {
                System.out.println("true");
            }
        }

    }
}
