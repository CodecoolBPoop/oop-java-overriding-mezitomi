package com.codecool.uml.overriding;

import java.util.ArrayList;
import java.util.List;

class CheckoutProcess extends AbstractProcess {

    private static int nextID = 0;
    private List<CheckoutProcess> checkoutProcesses = new ArrayList<>();

    private int id;

    public CheckoutProcess() {
        this.id = nextID++;
        checkoutProcesses.add(this);
    }

    public void action(Orderable item) {
        item.checkout();
        System.out.println("action() of checkoutProcess called!");
    }
}
