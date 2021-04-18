package com.example.demo.constants;

public enum OrderStatus {

    Cancelled("ORDER CANCELLED"),
    Delivered("ORDER WILL BE DELIVERED"),
    Problem("ORDER PROBLEM"),
    Processing("ORDER PROCESSING"),
    Returned("ORDER RETURNED");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
