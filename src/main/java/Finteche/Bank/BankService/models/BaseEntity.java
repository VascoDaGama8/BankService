package Finteche.Bank.BankService.models;

import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@Data
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_type")
    private boolean userType;
    @CreatedDate
    @Column(name = "created")
    private Date created;
    @LastModifiedDate
    @Column(name = "updated")
    private Date updated;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

}
