package com.manan.finance_tracker.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    private String description;

    private LocalDate transactionDate;

    private String type; // "INCOME" or "EXPENSE"

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
