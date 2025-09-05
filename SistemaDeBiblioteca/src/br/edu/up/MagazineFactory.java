package br.edu.up;

public class MagazineFactory implements IFactoryBorrowable {

    @Override
    public Borrowable create() {
        return new Magazine();
    }

}
