package uz.jasur.cafe.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.jasur.cafe.models.templates.AbsUUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderItem extends AbsUUID {
    @Column(nullable = false)
    @ManyToOne
    private Order order;

    private int amount;

    @Column(nullable = false)
    @ManyToOne
    private Meal meal;
}
