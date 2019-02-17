
public class CreditCardPayment extends Payment{

	private String name;
	private int creditCard;
	
	public CreditCardPayment(double moneyAmount, String paymentDate, String name, int creditCard)
	{
		super(moneyAmount, paymentDate);
		this.name = name;
		this.creditCard = creditCard;
	}
	
	// getters
	public String getName()
	{
		return name;
	}
	
	public int getCreditCard()
	{
		return creditCard;
	}
	
	// setters
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setCreditCard(int creditCard)
	{
		this.creditCard = creditCard;
	}
	
	//toString
	@Override
	public String toString()
	{
		String s = super.toString();
		s += "\nCredit Card Name: " + name + "\nCC Number: " + creditCard;
		return s;
	}
	
	// equals method
	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof Payment)
		{
			CreditCardPayment payment = (CreditCardPayment) obj;
			return this.getDate().equalsIgnoreCase(payment.getDate())
					&& this.name.equalsIgnoreCase(payment.name)
					&& this.getMoneyAmount() == (payment.getMoneyAmount())
					&& this.creditCard == payment.creditCard;
		}
		else
		{
			return false;
		}
	}
}
