package danamicProxy;

/**
 * Created by xh on 2015/10/19.
 */
public class CgTest {
    public static void main(String[] args){
        ProxyCg proxyCg = new ProxyCg();
        BooksImpl books = (BooksImpl) proxyCg.getInstance(new BooksImpl());
        books.addBook();
    }
}
