package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.time.LocalDate;

@Entity
@Builder(toBuilder = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo {
	@Id @GeneratedValue
	//private final Long id;
	//private final Long id;
	//private  String title;
	//private  String description;
	//private  LocalDate dueDate;
	
	private Long id;
	private String title, description;
	private LocalDate dueDate;
}
