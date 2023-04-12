package Finteche.Bank.BankService.service;

import Finteche.Bank.BankService.dto.AcNumDto;
import Finteche.Bank.BankService.dto.RegisterDto;
import Finteche.Bank.BankService.dto.TransferDto;
import Finteche.Bank.BankService.models.Transfer;
import Finteche.Bank.BankService.models.User;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;

import javax.validation.Valid;
import java.util.List;

public interface UserService {

    void register(RegisterDto registerDto) throws IllegalAccessException;

    List<Transfer> getAllTransfers();
    User findByUsername(String username) throws IllegalAccessException;

    User findByAccountNumber(int accountNumber) throws IllegalAccessException;

    void makeTransfer(TransferDto transferBlanace, String username) throws IllegalAccessException;

    List<AcNumDto>allAcNum();
}
