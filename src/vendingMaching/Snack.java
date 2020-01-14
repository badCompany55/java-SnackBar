package vendingMaching;

public class Snack
{
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int machineId;

	public Snack(String name, int quantity, double cost, int machineId)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.machineId = machineId;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getCost()
	{
		return cost;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}

	public int getVendingMachineId()
	{
		return machineId;
	}
	
	public void setVendingMachingId(int machineId)
	{
		this.machineId = machineId;
	}

	public int getQuantity()
	{
		System.out.println(name + " " + "Quantity: " + quantity);
		return quantity;
	}

	public void addQuantity(int add)
	{
		quantity = quantity + add;
	}

	public void boughtSnack(int num)
	{
		quantity = quantity - num;
		System.out.println("Name: " + name + "\n" + 
				"Quantity: " + quantity);
	}

	public double getCost(int num)
	{
		double returnCost = cost * num;
		return returnCost;
	}
}
