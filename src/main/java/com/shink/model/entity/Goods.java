package com.shink.model.entity;

import java.time.LocalDate;

public abstract class Goods {
    private String name;
    private Long price;
    private String type;
    private LocalDate localDate;
    private boolean isSold;
}
