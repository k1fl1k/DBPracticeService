package com.k1fl1k.dbpractice.persistance.service.validation;

import java.util.ArrayList;
import java.util.List;

public class SectionsValidation {
    private String name;
    private String inside;
    private int value;
    private int searchId;
    private final List<String> errors;

    public SectionsValidation(){
        this.errors = new ArrayList<>();
    }

    public List<String> validate(){
        errors.clear();
        validateInside();
        validateName();
        validateValue();
        validateSearchId();

        return errors;
    }

    public SectionsValidation name(String name){
        this.name = name;
        return this;
    }
    public SectionsValidation inside(String inside){
        this.inside = inside;
        return this;
    }


    public SectionsValidation value(int value){
        this.value = value;
        return this;
    }

    public SectionsValidation searchId(int searchId){
        this.searchId = searchId;
        return this;
    }

    private void validateName() {
        if (name == null || name.trim().isEmpty()) {
            errors.add("Name cannot be empty");
        }
    }

    private void validateInside() {
        if (inside == null || inside.trim().isEmpty()) {
            errors.add("Inside cannot be empty");
        }
    }

    private void validateValue() {
        if (value < 0) {
            errors.add("Value must be 0 or more");
        }
    }

    private void validateSearchId() {
        if (searchId <= 0) {
            errors.add("Search ID must be a positive number");
        }
    }
}
