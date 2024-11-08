import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Library {
    List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book...booksToAdd){
        for (Book element : booksToAdd){
            books.add(element);
        }
    }

    public void searchBook(String title){
        if (books.contains(title)){
            System.out.println("book found! operations to do:");
            System.out.printf("borrow: press B, nothing press N");
            Scanner writeInConsole = new Scanner(System.in);
            String opToDo = writeInConsole.nextLine();
            if (opToDo.equals("B")){
                borrrowBook(title);
            }
            else if (opToDo.equals("N")){
                System.out.println("operation declined");
            }
        }
    }
    public void borrrowBook(String title){
        books.remove(title);
    }
}
