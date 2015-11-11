package annotation;

/**
 * Created by xh on 2015/11/4.
 */
public class Fruit {
    @FruitName("Apple")
    private String name;
    @FruitColor(fruitColor = FruitColor.Color.RED)
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display(){
        System.out.println("this is an"+this.name+" and it's color is "+this.color);
    }

}
