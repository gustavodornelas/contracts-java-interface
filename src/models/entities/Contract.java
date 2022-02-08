package models.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	
	private Integer number;
	private Date date;
	private Double totalValue;
	
	List<Installment> list = new ArrayList<>();

	
	//Constructors
	public Contract() {
	}
	
	public Contract(Integer number, Date date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	//Getters
	public Integer getNumber() {
		return number;
	}

	public Date getDate() {
		return date;
	}

	public Double getTotalValue() {
		return totalValue;
	}
	
	public List<Installment> getInstallments(){
		return list;
	}
	
	//Methods
	public void addInstallment (Installment installment) {
		list.add(installment);
	}
	
}
