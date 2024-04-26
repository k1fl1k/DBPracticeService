package com.k1fl1k.dbpractice.persistance.service.validation;


import java.util.ArrayList;
import java.util.List;

public class UsersValidation {

    private String name;
    private String surname;
    private String post;
    private int searchId;
    private final List<String> errors;

    public UsersValidation(){
        this.errors = new ArrayList<>();
    }

    public UsersValidation name(String name){
        this.name = name;
        return this;
    }
    public UsersValidation surname(String surname){
        this.surname = surname;
        return this;
    }
    public UsersValidation post(String post){
        this.post = post;
        return this;
    }
    public UsersValidation searchId(int searchId){
        this.searchId = searchId;
        return this;
    }

    public List<String> validate(){
        errors.clear();

        validateName();
        validateSearchId();
        validatePost();
        validateSurname();

        return errors;
    }

    private void validateName() {
        if (name == null || name.trim().isEmpty()) {
            errors.add("Name cannot be empty");
        }
    }


    private void validateSurname() {
        if (surname == null || surname.trim().isEmpty()) {
            errors.add("Surname cannot be empty");
        }
    }

    private void validatePost() {
        if (post == null || post.trim().isEmpty()) {
            errors.add("Post cannot be empty");
        }
    }
    private void validateSearchId() {
        if (searchId <= 0) {
            errors.add("Search ID must be a positive number");
        }
    }
}

