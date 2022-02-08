package models.services;

import java.util.Calendar;
import java.util.Date;

import models.entities.Contract;
import models.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService ops;

	public ContractService(OnlinePaymentService ops) {
		this.ops = ops;
	}
	
	public void processContract(Contract contract, int months) {
		
		double quota = contract.getTotalValue() / months; //basic Quota
		
		for (int i = 1; i <= months; i++) {
			
			Date date = addMonths(contract.getDate(), i);
			
			double installmentQuota = quota + ops.interest(quota, i);
			installmentQuota += ops.paymentFee(installmentQuota);
			
			contract.addInstallment(new Installment(date, installmentQuota));
		}
		
	}
	
	private Date addMonths(Date date, int n) {
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}

}
