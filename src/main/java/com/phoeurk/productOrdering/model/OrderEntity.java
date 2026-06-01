package com.phoeurk.productOrdering.model;

import java.time.LocalDateTime;

public class OrderEntity {
    private Long id;
    private String orderNumber;
    private double totalAmount;
    private LocalDateTime orderDate;

    // Constructor
    public OrderEntity(Long id, String orderNumber, double totalAmount) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.totalAmount = totalAmount;
        this.orderDate = LocalDateTime.now(); // ចាប់យកម៉ោងបច្ចុប្បន្នស្វ័យប្រវត្ត
    }

    // Encapsulation: Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getOrderNumber() { return orderNumber; }
    public void setOrderNumber(String orderNumber) { this.orderNumber = orderNumber; }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }

    public LocalDateTime getOrderDate() { return orderDate; }
}