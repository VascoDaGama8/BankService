package Finteche.Bank.BankService.repository;

import Finteche.Bank.BankService.models.Transfer;
import Finteche.Bank.BankService.models.User;
import antlr.collections.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferRepository extends JpaRepository<Transfer, Long> {}
