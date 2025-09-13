package br.edu.up;

import java.util.List;

public class User {

    public List<IBorrowable> borrowedItems;

    public void borrow(IBorrowable item) {
        item.borrow(item, this);
    }

    public void returnItem(IBorrowable item) {
        item.returnItem(item, this);
    }
}
