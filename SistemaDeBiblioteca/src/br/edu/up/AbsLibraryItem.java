package br.edu.up;

public abstract class AbsLibraryItem implements IBorrowable {

    public String title;
    public String author;
    public String publicationYear;

    @Override
    public abstract void borrow(IBorrowable factory, User user);

    @Override
    public abstract void returnItem(IBorrowable item, User user);

}
