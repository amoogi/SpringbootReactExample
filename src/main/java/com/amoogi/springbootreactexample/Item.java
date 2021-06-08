package com.amoogi.springbootreactexample;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.data.annotation.Id;


@EqualsAndHashCode
@Getter
public class Item {
    @Id
    private String id;
    private String name;
    private double price;

    private Item() {}

    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
