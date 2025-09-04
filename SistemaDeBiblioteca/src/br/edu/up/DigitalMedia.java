package br.edu.up;

public class DigitalMedia extends LibraryItem {

    public String fileFormat;

    public void play() {

    }

    @Override
    public void borrow(ILibraryFactory factory, User user) {
        Borrowable item = factory.create();
        user.borrowedItems.add(item);
    }

    @Override
    public void returnItem(Borrowable item, User user) {
        user.borrowedItems.remove(user.borrowedItems.indexOf(item));
    }

}
