package vendingMaching;

public class Customer
{
	private static int maxId = 0;
	private int id;
	private String name;
	private double cash;

	public Customer(String name, double cash)
	{
		this.name = name;
		this.cash = cash;
	}

	public void addCash(double cash)
	{
		this.cash = cash + this.cash;
	}

	public void printCash()
	{
		System.out.println("Cash: " + cash);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void buySnack(double cost)
	{
		if (cash > cost) {
			cash = cash - cost;
			System.out.println("You " + "\'" + name + "\'" + " bought the Snack. Your cash is now " + cash);
		} else {
			System.out.print("You do not have enough money for this snack");
		}
	}

}
