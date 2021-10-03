package com.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 private String EmpID;
	 private String Name;
	 private String Desig;
	 private int Salary;
	 private int Bonus;
	 private int TotalSal;
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpID() {
		return EmpID;
	}
	public void setEmpID(String empID) {
		EmpID = empID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDesig() {
		return Desig;
	}
	public void setDesig(String desig) {
		Desig = desig;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public int getBonus() {
		return Bonus;
	}
	public void setBonus(int bonus) {
		Bonus = bonus;
	}
	public int getTotalSal() {
		return TotalSal;
	}
	public void setTotalSal(int totalSal) {
		TotalSal = totalSal;
	}
	
	public Employee(int id, String empID, String name, String desig, int salary, int bonus, int totalSal) {
		super();
		this.id = id;
		EmpID = empID;
		Name = name;
		Desig = desig;
		Salary = salary;
		Bonus = bonus;
		TotalSal = totalSal;
	}
	
	public Employee() {
		
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", EmpID=" + EmpID + ", Name=" + Name + ", Desig=" + Desig + ", Salary=" + Salary
				+ ", Bonus=" + Bonus + ", TotalSal=" + TotalSal + "]";
	}
	 
	 
	 

}
