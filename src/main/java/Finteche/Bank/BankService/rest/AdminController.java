package Finteche.Bank.BankService.rest;

import Finteche.Bank.BankService.dto.AcNumDto;
import Finteche.Bank.BankService.dto.ErrorDto;
import Finteche.Bank.BankService.dto.TransferDto;
import Finteche.Bank.BankService.models.User;
import Finteche.Bank.BankService.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/bank/admin")
@Slf4j
public class AdminController extends UserController{
    @Autowired
    private UserService userService;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getUsers")
    public ResponseEntity<List<User>> getAll(){
        return ResponseEntity.ok().body(userService.getAll());
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/deletUser")
    public ResponseEntity<?> deletUser(@RequestBody AcNumDto accountNumber) throws IllegalAccessException {
        userService.deleteUser(accountNumber.getAccountNumber());
        return ResponseEntity.ok().build();
    }
    @ExceptionHandler
    public ResponseEntity<ErrorDto> handle(Exception e){
        log.error(e.getMessage());
        ErrorDto error = new ErrorDto();
        error.setErrorMessage(e);
        return ResponseEntity.ok().body(error);
    }

}
