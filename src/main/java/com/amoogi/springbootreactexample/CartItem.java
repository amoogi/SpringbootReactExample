package com.amoogi.springbootreactexample;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public class CartItem {
    private Item item;
    private int quantity;

    private CartItem() {}

    CartItem(Item item) {
        this.item = item;;
        this.quantity = 1;
    }

    public void increment() {
        this.quantity++;
    }
}
