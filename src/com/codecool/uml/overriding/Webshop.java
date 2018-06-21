package com.codecool.uml.overriding;

class Webshop {

    public static void main(String[] args) {
	// write your code here

        Order order = new Order();

        CheckoutProcess checkoutProcess = new CheckoutProcess();
        PaymentProcess paymentProcess = new PaymentProcess();
        System.out.println(order.getStatus());
        checkoutProcess.process(order);
        System.out.println(order.getStatus());
        paymentProcess.process(order);
        System.out.println(order.getStatus());
    }

}
