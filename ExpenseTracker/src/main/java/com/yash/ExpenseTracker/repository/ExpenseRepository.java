package com.yash.ExpenseTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.ExpenseTracker.entity.Expense;

@Repository

public interface ExpenseRepository extends JpaRepository<Expense, Long>{

}
