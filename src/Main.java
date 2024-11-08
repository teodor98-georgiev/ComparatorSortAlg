import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Selfmade works at home", "Kile Petersen",2012),
                new Book("Fahrenheit 451", "Ray Bradbury", 1953),
                new Book("Mathematics: language of nature","Olaf Hunafsson", 2023),
                new Book ("Aleatory systems", "Carlo Cattai", 2006));
        System.out.println("books sorted by title with comparable");
        library.books.sort(null);
        for (Book book : library.books){
            System.out.println(book);
        }
        System.out.println();
        System.out.println("books sorted by author or publication year");;
        library.books.sort(new CustomComparator());
        for (Book book : library.books){
            System.out.println(book);
        }
        System.out.println();
        System.out.println("books sorted in reversed way");
        library.books.sort(new CustomComparator().reversed());
        for (Book book : library.books){
            System.out.println(book);
        }
    }
}