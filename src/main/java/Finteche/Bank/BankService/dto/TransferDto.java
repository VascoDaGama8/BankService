package Finteche.Bank.BankService.dto;

import lombok.Data;

@Data
public class TransferDto {
    private String to;
    private String from;
    private String amount;
}
