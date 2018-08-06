package tech.heartin.projects.set.domain;

import java.util.Set;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;


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
    private GroupOfCategories groupOfCategories;
}
