package br.edu.up;

public interface Borrowable {

    void borrow(ILibraryFactory factory, User user);

    void returnItem(Borrowable item, User user);
}
