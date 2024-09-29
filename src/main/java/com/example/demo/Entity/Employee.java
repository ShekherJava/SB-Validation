package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="EMP")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
	@Id
	@NotNull
	private Integer empno;
	
	@NotEmpty
	@Size(min = 4, max = 20)
	private String ename;
	
	@NotNull
	private Double sal;
	

}
