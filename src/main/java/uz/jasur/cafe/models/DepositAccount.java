package uz.jasur.cafe.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.jasur.cafe.models.templates.AbsUUID;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DepositAccount extends AbsUUID {
    @OneToOne
    private User user;

    private BigDecimal balance;
}
