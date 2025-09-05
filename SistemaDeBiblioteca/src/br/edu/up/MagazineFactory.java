package br.edu.up;

public class MagazineFactory implements IFactoryBorrowable {

    @Override
    public IBorrowable create() {
        return new Magazine();
    }

}
