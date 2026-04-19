package com.manu.inventory.exception;

@SuppressWarnings("serial")
public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
        super(message);
    }
}