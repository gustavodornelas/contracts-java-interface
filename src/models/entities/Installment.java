package models.entities;

import java.util.Date;

public class Installment {
	
	private Date dueDate;
	private Double amount;
	
	
	//Constructors
	public Installment() {
	}

	public Installment(Date dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}
	
	//Getters
	public Date getDueDate() {
		return dueDate;
	}

	public Double getAmount() {
		return amount;
	}
	
}
