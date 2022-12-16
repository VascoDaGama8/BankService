package Finteche.Bank.BankService.dto;

import lombok.Data;

import javax.persistence.Column;
@Data
public class RegisterDto {
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String patronymic;
    private boolean userType;
}
