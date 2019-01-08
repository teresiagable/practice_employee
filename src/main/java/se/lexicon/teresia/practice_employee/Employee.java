package se.lexicon.teresia.practice_employee;

import java.time.LocalDate;

public abstract class Employee {

	private int id;
	private String name;
	public static final int baseSalary = 25000;
	private int salary;
	private LocalDate dateHired;

	
	/**
	 * @param id
	 * @param name
	 */
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
		salary = baseSalary;
	}

	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {

		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public LocalDate getDateHired() {
		return dateHired;
	}

	public void setDateHired(LocalDate dateHired) {
		this.dateHired = dateHired;
	}	

	public abstract void calculateSalary();
}
	