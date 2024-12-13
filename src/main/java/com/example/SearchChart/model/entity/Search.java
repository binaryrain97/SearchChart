package com.example.SearchChart.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
public class Search {
    @Id
    private Long id;
    private String content;
    private LocalDate time;
}
