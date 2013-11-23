package com.sai.interview.domain;

import org.joda.time.DateTime;

import java.util.List;

public class Order {
    private String lastName;
    private String customerId;
    private PaymentType paymentType;
    private DateTime transactionDate;
    private List<OrderItem> orderItems;

    public Order() {
    }

    public Order(String lastName, String customerId, PaymentType paymentType, DateTime transactionDate, List<OrderItem> orderItems) {
        this.lastName = lastName;
        this.customerId = customerId;
        this.paymentType = paymentType;
        this.transactionDate = transactionDate;
        this.orderItems = orderItems;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public DateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(DateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}
