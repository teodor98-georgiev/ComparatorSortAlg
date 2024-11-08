import java.util.Comparator;

public class CustomComparator implements Comparator<Book> {
    @Override
    public int compare (Book b1, Book b2){
        int result = b1.getAuthor().compareTo(b2.getAuthor());
        if (result == 0){
            result = Integer.compare(b1.getPublicationYear(),b2.getPublicationYear());
        }
        return result;
    }
}
