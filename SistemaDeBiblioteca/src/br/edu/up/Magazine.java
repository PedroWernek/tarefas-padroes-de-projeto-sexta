package br.edu.up;

public class Magazine extends LibraryItem {

    public int issueNumber;

    public void flipPages() {

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
