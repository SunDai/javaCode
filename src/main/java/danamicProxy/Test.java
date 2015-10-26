package danamicProxy;

/**
 * Created by xh on 2015/10/19.
 */
public class Test {
    public static void main(String[] args){
        ProxyExample p = new ProxyExample();
        Books books = (Books) p.bind(new BooksImpl());
        books.addBook();

    }
}
