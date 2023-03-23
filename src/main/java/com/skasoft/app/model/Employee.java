package com.skasoft.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Employee {
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private int age;

}
