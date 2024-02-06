package jasonmarques98.Paymentsystem.dto;

import jasonmarques98.Paymentsystem.entity.User;

public record UserRequest(String name, String email, String password) {
    public User toModel(){
       return new User(name,email,password);
    }

}
