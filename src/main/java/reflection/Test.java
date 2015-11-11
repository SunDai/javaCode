package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by xh on 2015/10/26.
 */
public class Test {

    public static void main(String[] args){
        try {
            Class candy = Class.forName("reflection.Candy");
            Field[] fields = candy.getFields();
            for (int i = 0;i<fields.length;i++){
                Field field = fields[i];
                System.out.println("field is "+field.getName()+" accessable flag is "+field.isAccessible()+" modifier is "+ Modifier.toString(field.getModifiers()));
            }
            Method[] methods = candy.getMethods();
            for (int i = 0;i<methods.length;i++){
                Method method = methods[i];
                System.out.println("method is "+method.getName()+" accessable flag is "+method.isAccessible()+" modifier is "+Modifier.toString(method.getModifiers()));
            }
            Field[] dfields = candy.getDeclaredFields();
            for (int i = 0;i<dfields.length;i++){
                Field field = dfields[i];
                System.out.println("declared field is "+field.getName()+" accessable flag is "+field.isAccessible()+" modifier is "+Modifier.toString(field.getModifiers()));
            }

            Method[] dmethods = candy.getDeclaredMethods();
            for (int i = 0;i<dmethods.length;i++){
                Method method = dmethods[i];
                System.out.println("declared method is "+method.getName()+" accessable flag is "+method.isAccessible()+" modifier is "+Modifier.toString(method.getModifiers()));
            }
            Object o = candy.newInstance();
            Package p =o.getClass().getPackage();
            System.out.println("o 's package is " + p.getName());

            Method getNum = candy.getDeclaredMethod("getNum");

            Method setNum = candy.getDeclaredMethod("setNum",Integer.TYPE);
            setNum.invoke(o,10);
            getNum.invoke(o);
            Method increase =candy.getDeclaredMethod("increase", Integer.TYPE);
            increase.setAccessible(true);
            increase.invoke(o,3);
            getNum.invoke(o);

            String returnType = setNum.getReturnType().getName();
            System.out.println("returnType is "+returnType);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
