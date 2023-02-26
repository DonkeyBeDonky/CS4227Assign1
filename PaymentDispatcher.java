package com.company;


public class PaymentDispatcher extends Rental {
    public void processPayment(PaymentMethod method) {
        double amount = getCharge();
        switch (method) {
            case CASH:
                handleCashPayment(amount);
                break;
            case CREDIT_CARD:
                handleCreditCardPayment(amount);
                break;
            case PAYPAL:
                handlePaypalPayment(amount);
                break;
            default:
                throw new IllegalArgumentException("Invalid payment method: " + method);
        }
    }

    private void handleCashPayment(double amount) {
        System.out.println("Received cash payment of $" + amount);
    }

    private void handleCreditCardPayment(double amount) {
        System.out.println("Charging credit card for $" + amount);
    }

    private void handlePaypalPayment(double amount) {
        System.out.println("Sending $" + amount + " to Paypal");
    }
}
