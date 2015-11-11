package annotation;

import java.lang.annotation.*;

/**
 * Created by xh on 2015/11/4.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
    public enum Color{BLUE,RED,GREEN};
    Color fruitColor() default Color.BLUE;
}
