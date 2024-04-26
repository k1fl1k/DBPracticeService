package com.k1fl1k.dbpractice.persistance.service.validation;

import java.util.ArrayList;
import java.util.List;

public class StoragesValidation {

    private String name;
    private String street;
    private int sections;
    private int searchId;
    private final List<String> errors;

    public StoragesValidation name(String name){
        this.name = name;
        return this;
    }

    public StoragesValidation street(String street){
        this.street = street;
        return this;
    }

    public StoragesValidation sections(int sections){
        this.sections = sections;
        return this;
    }

    public StoragesValidation searchId(int searchId){
        this.searchId = searchId;
        return this;
    }

    public StoragesValidation(){
        this.errors = new ArrayList<>();
    }

    public List<String> validate(){
        errors.clear();

        validateName();
        validateSearchId();
        validateStreet();
        validateSections();

        return errors;
    }

    private void validateName() {
        if (name == null || name.trim().isEmpty()) {
            errors.add("Name cannot be empty");
        }
    }

    private void validateStreet() {
        if (street == null || street.trim().isEmpty()) {
            errors.add("Street cannot be empty");
        }
    }

    private void validateSections() {
        if (sections <= 0) {
            errors.add("Sections must be a positive integer");
        }
    }

    private void validateSearchId() {
        if (searchId <= 0) {
            errors.add("Search ID must be a positive number");
        }
    }
}
