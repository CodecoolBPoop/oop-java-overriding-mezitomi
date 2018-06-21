package com.codecool.uml.overriding;

import java.util.ArrayList;
import java.util.List;

class PaymentProcess extends AbstractProcess {

    private static int nextID = 0;
    private static List<PaymentProcess> paymentProcesses = new ArrayList<>();

    private int id;

    public PaymentProcess() {
        this.id = nextID++;
        paymentProcesses.add(this);

    }

    @Override
    public void action(Orderable item) {
        item.pay();
        System.out.println("pay() of PaymentProcess called!");
    }
}
