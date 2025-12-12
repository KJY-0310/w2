package com.example.jdbcex.domain;

import lombok.*;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TodoVO {
    private long tno;
    private String title;
    private LocalDate dueDate;
    private boolean finished;
}
