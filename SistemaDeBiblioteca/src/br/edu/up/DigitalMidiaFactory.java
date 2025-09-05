package br.edu.up;

public class DigitalMidiaFactory implements IFactoryBorrowable {

    @Override
    public IBorrowable create() {
        return new DigitalMedia();
    }

}
