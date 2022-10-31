package uz.jasur.cafe.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.jasur.cafe.models.enums.TransactionType;
import uz.jasur.cafe.models.templates.AbsUUID;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "transactions")
public class Transaction extends AbsUUID {

    private BigDecimal amount;
    private boolean input;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    @Column(nullable = false)
    @ManyToOne
    private User user;

    @ManyToOne
    private Order order;
}
