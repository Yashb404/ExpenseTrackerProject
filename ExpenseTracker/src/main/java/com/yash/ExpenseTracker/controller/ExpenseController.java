package com.yash.ExpenseTracker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.ExpenseTracker.dto.ExpenseDTO;
import com.yash.ExpenseTracker.entity.Expense;
import com.yash.ExpenseTracker.services.expense.ExpenseService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("*/api/expense")
@RequiredArgsConstructor
@CrossOrigin("*")



public class ExpenseController {

    private final ExpenseService expenseService;
    public ResponseEntity<?> postExpense(@RequestBody ExpenseDTO dto){
        Expense createdExpense = expenseService.postExpense(dto);
        if(createdExpense != null){
            return ResponseEntity.status(HttpStatus.CREATED).body(createdExpense);
        }
        else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
