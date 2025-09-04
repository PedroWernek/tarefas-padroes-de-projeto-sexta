package br.edu.up;

public class Book extends LibraryItem {

    public String genre;

    public void readSample() {
    }

    @Override
    public void borrow(Borrowable item, User user) {
        user.borrowedItems.add(item);
    }

    @Override
    public void returnItem(Borrowable item, User user) {
        user.borrowedItems.remove(user.borrowedItems.indexOf(item));
    }

}
