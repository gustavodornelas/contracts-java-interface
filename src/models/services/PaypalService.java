package models.services;

public class PaypalService implements OnlinePaymentService {
	
	private static final double FEE_PERCENTAGE = 0.02; //2% tax
	private static final double MONTHLY_INTEREST = 0.01; //1% tax

	@Override
	public Double paymentFee(Double amount) {
		return amount * FEE_PERCENTAGE;
	}

	@Override
	public Double interest(Double amount, Integer mouths) {
		return amount * MONTHLY_INTEREST * mouths;
	}
}
