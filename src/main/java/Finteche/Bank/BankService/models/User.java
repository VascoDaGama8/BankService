package Finteche.Bank.BankService.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Data
public class User extends BaseEntity{

    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "patronymic")
    private String patronymic;
    @Column(name = "account_number")
    private String accountNumber;
    @Column(name = "balance")
    private String balance;
}
