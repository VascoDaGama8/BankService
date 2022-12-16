package Finteche.Bank.BankService.rest;

import Finteche.Bank.BankService.models.User;
import Finteche.Bank.BankService.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/bank/admin")
@Slf4j
public class AdminController {
    @Autowired
    private UserService userService;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/get_users")
    public  @ResponseBody List<User> getAll(){
        return userService.getAll();
    }
}
