package Finteche.Bank.BankService.rest;

import Finteche.Bank.BankService.dto.RegisterDto;
import Finteche.Bank.BankService.models.Errors;
import Finteche.Bank.BankService.models.User;
import Finteche.Bank.BankService.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/bank")
@Slf4j
public class RegisterController {

    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/register")
    public void register(@RequestBody RegisterDto registerDto) throws IllegalAccessException {
        userService.register(registerDto);
    }

    @ExceptionHandler(IllegalAccessException.class)
    public Errors handle(IllegalAccessException e){
        log.error(e.getMessage());
        Errors error = new Errors();
        error.setErrorMessage(e);
        return error;
    }

}
