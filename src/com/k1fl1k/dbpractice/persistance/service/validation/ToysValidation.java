package com.k1fl1k.dbpractice.persistance.service.validation;

import java.util.ArrayList;
import java.util.List;

public class ToysValidation {

    private String type;
    private int value;
    private int price;
    private int searchId;
    private final List<String> errors;

    public ToysValidation(){
        this.errors = new ArrayList<>();
    }

    public ToysValidation type(String type){
        this.type = type;
        return this;
    }

    public ToysValidation value(int value){
        this.value = value;
        return this;
    }
    public ToysValidation price(int price){
        this.price = price;
        return this;
    }

    public ToysValidation searchId(int searchId){
        this.searchId = searchId;
        return this;
    }

    public List<String> validate(){
        errors.clear();

        validateType();
        validateValue();
        validatePrice();
        validateSearchId();

        return errors;
    }

    private void validateType() {
        if (type == null || type.trim().isEmpty()) {
            errors.add("Type cannot be empty");
        }
    }

    private void validateValue() {
        if (value < 0) {
            errors.add("Value must be 0 or more");
        }
    }

    private void validatePrice() {
        if (price <= 0) {
            errors.add("Price must be a positive number");
        }
    }

    private void validateSearchId() {
        if (searchId <= 0) {
            errors.add("Search ID must be a positive number");
        }
    }
}
