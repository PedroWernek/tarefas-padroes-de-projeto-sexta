package br.edu.up;

public class DigitalMidiaFactory implements IFactoryBorrowable {

    @Override
    public Borrowable create() {
        return new DigitalMedia();
    }

}
