package vendingMaching;

public class Main
{
	public static void main(String[] args)
	{
		Customer custOne = new Customer("Jane", 45.25);
		Customer custTwo = new Customer("Bob", 33.14);

		VendingMachine vendOne = new VendingMachine("Food");
		VendingMachine vendTwo = new VendingMachine("Drink");
		VendingMachine vendThree = new VendingMachine("Office");

		Snack snackOne = new Snack("Chips", 36, 1.75, vendOne.getId());
		Snack snackTwo = new Snack("Chocolate Bar", 36, 1.00, vendOne.getId());
		Snack snackThree = new Snack("Pretzel", 30, 2.00, vendOne.getId());

		Snack snackFour = new Snack("Soda", 24, 2.50, vendTwo.getId());
		Snack snackFive = new Snack("Water", 20, 2.75, vendTwo.getId());

		custOne.buySnack(snackFour.getCost(3));
		snackFour.boughtSnack(3);
		custOne.buySnack(snackThree.getCost(1));
		snackThree.boughtSnack(1);
		custTwo.buySnack(snackFour.getCost(2));
		snackFour.boughtSnack(2);
		custOne.addCash(10.00);
		custOne.printCash();
		custOne.buySnack(snackTwo.getCost(1));
		snackTwo.boughtSnack(1);
		snackThree.addQuantity(12);
		snackThree.getQuantity();
		custTwo.buySnack(snackThree.getCost(3));
		snackThree.boughtSnack(3);
	}
}
