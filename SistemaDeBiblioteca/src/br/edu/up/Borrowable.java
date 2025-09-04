package br.edu.up;

public interface Borrowable {

    void borrow(Borrowable item, User user);

    void returnItem(Borrowable item, User user);
}
