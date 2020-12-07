package Bookstore;

public class EpubBook extends Book implements CanBeRead {

    public EpubBook(String name) {
        this.name = name;
        this.type = BookType.EPUB;
    }

    @Override
    public String read() {
        return null;
    }
}
