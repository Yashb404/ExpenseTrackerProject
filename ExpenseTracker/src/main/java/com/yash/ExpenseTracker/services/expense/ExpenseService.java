package com.yash.ExpenseTracker.services.expense;

import com.yash.ExpenseTracker.dto.ExpenseDTO;
import com.yash.ExpenseTracker.entity.Expense;

public interface ExpenseService {

    Expense postExpense(ExpenseDTO expenseDTO);

}
