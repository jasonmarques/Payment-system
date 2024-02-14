package jasonmarques98.Paymentsystem.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jasonmarques98.Paymentsystem.entity.User;

public record UserRequest(

       @NotNull(message = "O nome não pode ser nulo")
       @NotBlank(message = "O nome não pode ser vazio")
       String name,

       @NotNull(message = "O E-mail não pode ser null")
       @NotBlank(message = "O E-mail não pode ser vazio")
       @Email
       String email,

       @NotNull(message = "Senha não pode ser nula")
       @NotBlank(message = "Senha não pode ser vazia")
       @Size(min = 8, message = "A senha precisa ter no mínimo 8 caracteres")
        String password) {

    public User toModel(){
       return new User(name,email,password);
    }

}
