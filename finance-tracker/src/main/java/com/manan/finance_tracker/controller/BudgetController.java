package com.manan.finance_tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.manan.finance_tracker.entity.Budget;
import com.manan.finance_tracker.repository.BudgetRepository;
import java.util.List;

@RestController
@RequestMapping("/api/budgets")
public class BudgetController {

    @Autowired
    private BudgetRepository budgetRepository;

    @GetMapping("/user/{userId}")
    public List<Budget> getBudgetsByUser(@PathVariable Long userId) {
        return budgetRepository.findAllByUserId(userId);
    }

    @PostMapping
    public Budget createBudget(@RequestBody Budget budget) {
        return budgetRepository.save(budget);
    }
}
