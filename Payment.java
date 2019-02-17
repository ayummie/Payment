
public class Payment {
	protected double moneyAmount;
	protected String date;
	
	public Payment(double moneyAmount, String date)
	{
		this.moneyAmount = moneyAmount;
		this.date = date;
	}
	
	// getters
	public double getMoneyAmount()
	{
		return moneyAmount;
	}
	
	public String getDate()
	{
		return date;
	}
	
	// setters
	public void setMoneyAmount(double moneyAmount)
	{
		this.moneyAmount = moneyAmount;
	}
	
	public void setDate(String date)
	{
		this.date = date;
	}
	
	@Override
	public String toString()
	{
		return "$" + moneyAmount + " on " + date;
	}
}
