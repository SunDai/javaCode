package danamicProxy;

/**
 * Created by xh on 2015/10/19.
 */
public class BooksImpl {
    public void addBook() {
        System.out.println(" add book from booksImpl"+this.getClass().getName());
    }
}
