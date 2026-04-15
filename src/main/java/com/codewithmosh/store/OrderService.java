package com.codewithmosh.store;

public class OrderService {
    private PaymentService paymentService;
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.processPayment(10);
        // Look how we removed the tighly coupled payment service
//        var paymentService = new StripePaymentService();
//        paymentService.processPayment(10);
    }
}
