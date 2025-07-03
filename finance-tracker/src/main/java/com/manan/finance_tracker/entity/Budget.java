package com.manan.finance_tracker.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "budgets")
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;

    private Double limitAmount;

    private Double spentAmount;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
