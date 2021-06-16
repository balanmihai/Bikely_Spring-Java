package com.wad.fils.course6.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class Product {
    private Long id;
    private String name;
    private int prize;

    public Product(String name, int prize) {
        this.name = name;
        this.prize = prize;
    }

    public Product() {
    }

    public Product(Long id, String name, int prize) {
        this.id = id;
        this.name = name;
        this.prize = prize;
    }
}
