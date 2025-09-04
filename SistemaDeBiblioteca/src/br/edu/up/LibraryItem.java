package br.edu.up;

public abstract class LibraryItem implements Borrowable {

    public String title;
    public String author;
    public String publicationYear;

    @Override
    public abstract void borrow(Borrowable factory, User user);

    @Override
    public abstract void returnItem(Borrowable item, User user);

}
