package uz.jasur.cafe.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.jasur.cafe.models.templates.AbsName;

import javax.persistence.Column;
import javax.persistence.Entity;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "meals")
public class Meal extends AbsName {
    @Column(nullable = false)
    private double price;

    private String description;
    private String ingredients;
}
