package com.example.demo;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder(toBuilder = true)
@Data
public class Todo {
  private final Long id;
  private  String title;
  private  String description;
  private  LocalDate dueDate;
}
