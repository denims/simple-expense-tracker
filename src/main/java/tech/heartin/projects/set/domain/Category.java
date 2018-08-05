package tech.heartin.projects.set.domain;

import java.util.Set;

import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Category for an expense.
 */
@Data
@EqualsAndHashCode(exclude = {"expenses"})
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Byte[] image;
    @OneToMany(mappedBy = "category")
    private Set<Expense> expenses;
    @Enumerated(value = EnumType.STRING)
    GroupOfCategories groupOfCategories;
}
