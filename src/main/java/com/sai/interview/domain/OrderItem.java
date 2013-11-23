package com.sai.interview.domain;

import java.math.BigDecimal;

public class OrderItem {
    private BigDecimal amount;
    private String itemCode;

    public OrderItem() {
    }

    public OrderItem(BigDecimal amount, String itemCode) {
        this.amount = amount;
        this.itemCode = itemCode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
}
