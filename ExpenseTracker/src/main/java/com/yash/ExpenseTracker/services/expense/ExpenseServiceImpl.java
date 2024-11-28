package com.yash.ExpenseTracker.services.expense;

import org.springframework.stereotype.Service;

import com.yash.ExpenseTracker.dto.ExpenseDTO;
import com.yash.ExpenseTracker.entity.Expense;
import com.yash.ExpenseTracker.repository.ExpenseRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class ExpenseServiceImpl implements ExpenseService {

    private final ExpenseRepository expenseRepository;


    @Override
    public Expense postExpense(ExpenseDTO expenseDTO){
        return saveOrUpdateExpense(new Expense(), expenseDTO);
    }
    private Expense saveOrUpdateExpense(Expense expense,ExpenseDTO expenseDTO){
            expense.setTitle(expenseDTO.getTitle());
            expense.setDate(expenseDTO.getDate());
            expense.setAmount(expenseDTO.getAmount());
            expense.setCategory(expenseDTO.getCategory());
            expense.setDescription(expenseDTO.getDescription());

            return expenseRepository.save(expense);
    }
}
