import java.util.List;

public class FavoriteBooks {
    List<Book> favorites;

    public void merge(List<Book> books){
        assert books != null : "The list of books is null";
        assert favorites != null : "The favorites list is null";

        books.removeAll(favorites);

        List<Book> newBooks  = books;

        if (!newBooks.isEmpty()) {
            favorites.addAll(newBooks);
        }
        assert favorites.containsAll(books) : "Not all books were added to favorites";
    }
}
