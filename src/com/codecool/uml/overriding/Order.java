package com.codecool.uml.overriding;

import java.util.ArrayList;
import java.util.List;

public class Order implements Orderable {

    private static int nextID = 0;
    private static List<Order> orders = new ArrayList<>();

    private int id;
    private String status;

    public Order() {
        this.id = nextID++;
        this.status = "new";
        orders.add(this);
    }

    public String getStatus() {
        return status;
    }

    @Override
    public boolean checkout() {
        this.status = "checked";
        return true;
    }

    @Override
    public boolean pay() {
        this.status = "payed";
        return true;
    }
}
