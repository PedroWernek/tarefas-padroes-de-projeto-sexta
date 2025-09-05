package br.edu.up;

public interface IBorrowable {

    void borrow(IBorrowable item, User user);

    void returnItem(IBorrowable item, User user);
}
