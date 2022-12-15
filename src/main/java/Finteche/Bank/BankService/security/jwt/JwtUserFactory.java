package Finteche.Bank.BankService.security.jwt;

import Finteche.Bank.BankService.models.Status;
import Finteche.Bank.BankService.models.User;

public class JwtUserFactory {

    public JwtUserFactory(){

    }

    public static JwtUser create(User user){
        return new JwtUser(
                user.getId(),
                user.getUsername(),
                user.getPassword(),
                user.getEmail(),
                user.getAccountNumber(),
                user.getFirstName(),
                user.getLastName(),
                user.getPatronymic(),
                user.isUserType(),
                user.getStatus().equals(Status.ACTIVE),
                user.getUpdated());
    }
}
