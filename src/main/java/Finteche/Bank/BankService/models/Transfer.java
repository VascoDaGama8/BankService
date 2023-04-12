package Finteche.Bank.BankService.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "transfer")
@Data
public class Transfer extends BaseEntity {
    @Column(name = "account_number_from")
    private int from;
    @Column(name = "account_number_to")
    private int to;
    @Column(name = "amount")
    private int amount;
    @Column(name = "comments")
    private String comments;
}