package br.edu.up;

public class BookFactory implements IFactoryBorrowable {
    private final String bookId;

    public BookFactory(String bookId){
        this.bookId = bookId;
    }
    @Override
    public IBorrowable create() {
        /*
         * Regras de negocios para criar o livro
         */
        return new Book(this.bookId);// o construtor de livro deve implementar
    }

}
