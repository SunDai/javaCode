/**
 * Created by xh on 2015/11/4.
 */
public class SetId{
    static class Ob{
        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args){
        Ob ob= new Ob();
        ob.setName("ssklrejklsf");
        setId(ob);
        System.out.println(ob.getName()+"===="+ob.getId());
    }

    public static void setId(Ob ob){
        ob.setId(333);
    }
}
