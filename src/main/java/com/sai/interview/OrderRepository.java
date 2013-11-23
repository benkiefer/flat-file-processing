package com.sai.interview;

import com.sai.interview.domain.Order;
import com.sai.interview.domain.OrderItem;
import com.sai.interview.domain.PaymentType;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class OrderRepository {
    private List<Order> orders;

    public OrderRepository() {
        DateTime transactionDate = new DateTime(2013, 11, 11, 0, 0);

        orders = new ArrayList<Order>();
        orders.add(
                new Order("Kiefer", "1234", PaymentType.CREDIT, transactionDate,
                        asList(new OrderItem(new BigDecimal("2.00"), "701"),
                                new OrderItem(new BigDecimal("0.05"), "convenience-fee"))));
        orders.add(
                new Order("Gooden", "2222", PaymentType.ECHECK, transactionDate,
                        asList(new OrderItem(new BigDecimal("4.00"), "705"),
                                new OrderItem(new BigDecimal("0.11"), "convenience-fee"))));
        orders.add(
                new Order("Wilson", "4444", PaymentType.CREDIT, transactionDate,
                        asList(
                                new OrderItem(new BigDecimal("2.00"), "706"),
                                new OrderItem(new BigDecimal("0.05"), "convenience-fee"))));
        orders.add(
                new Order("James", "5555", PaymentType.ECHECK, transactionDate,
                        asList(
                                new OrderItem(new BigDecimal("4.00"), "707"),
                                new OrderItem(new BigDecimal("0.11"), "convenience-fee"))));
        orders.add(
                new Order("Adams", "6666", PaymentType.CREDIT, transactionDate,
                        asList(
                                new OrderItem(new BigDecimal("12.00"), "401"),
                                new OrderItem(new BigDecimal("0.32"), "convenience-fee"))));
        orders.add(
                new Order("Lincoln", "7777", PaymentType.CREDIT, transactionDate,
                        asList(new OrderItem(new BigDecimal("8.00"), "501"),
                                new OrderItem(new BigDecimal("0.21"), "convenience-fee"))));
    }

    public List<Order> findAll() {
        return orders;
    }
}
