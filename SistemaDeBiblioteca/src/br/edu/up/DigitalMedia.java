package br.edu.up;

public class DigitalMedia extends AbsLibraryItem {

    public String fileFormat;

    public void play() {
        System.out.println("Playing:" + super.title + this.fileFormat + "\nAuthor:" + super.author);
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
