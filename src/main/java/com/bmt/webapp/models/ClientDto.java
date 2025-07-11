package com.bmt.webapp.models;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientDto {
    
    @NotEmpty(message = "The First Nme is required")
    private String firstName;

    @NotEmpty(message ="The last name is required")
    private String lastName;

    @NotEmpty(message ="The email name is required")
    @Email
    private String email;

    private String phone;
    private String adresse;

    @NotEmpty(message ="The last name is required")
    private String status;

    




}
