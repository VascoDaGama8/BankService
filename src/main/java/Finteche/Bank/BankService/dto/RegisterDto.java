package Finteche.Bank.BankService.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.Pattern;

@Data
public class RegisterDto {
    private String username;

    @Pattern(regexp = "^[a-zA-Z0-9]{6,12}$",
            message = "password must be of 6 to 12 length with no special characters")
    private String password;
    @Pattern(regexp = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9.-]+$",
            message = "email must have normal view")
    private String email;
    @Pattern(regexp = "^[a-zA-Z]$",
            message = "firstname must be with latin letters")
    private String firstName;
    @Pattern(regexp = "^[a-zA-Z]$",
            message = "lastname must be with latin letters")
    private String lastName;
    @Pattern(regexp = "^[a-zA-Z]$",
            message = "patronymic must be with latin letters")
    private String patronymic;
}
