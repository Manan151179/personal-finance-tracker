package com.manan.finance_tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.manan.finance_tracker.entity.Budget;
import java.util.List;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
    List<Budget> findAllByUserId(Long userId);
}
