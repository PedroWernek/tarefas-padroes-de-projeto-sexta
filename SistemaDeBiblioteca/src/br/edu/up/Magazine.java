package br.edu.up;

public class Magazine extends AbsLibraryItem {

    public int issueNumber;

    public void flipPages() {

    }

    @Override
    public void borrow(IBorrowable item, User user) {
        user.borrowedItems.add(item);
    }

    @Override
    public void returnItem(IBorrowable item, User user) {
        user.borrowedItems.remove(user.borrowedItems.indexOf(item));
    }

}
