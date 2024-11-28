package com.yash.ExpenseTracker.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ExpenseDTO {

    private Long id;
    private String title;
    private LocalDate date;
    private String description;
    private String category;
    private Integer amount;
    
}
