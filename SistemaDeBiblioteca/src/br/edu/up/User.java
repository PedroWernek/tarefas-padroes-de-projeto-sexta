package br.edu.up;

import java.util.List;

public class User {

    public List<Borrowable> borrowedItems;

    public void borrow(Borrowable item) {
        item.borrow(item, this);
    }

    public void returnItem(Borrowable item) {
        item.returnItem(item, this);
    }
}
