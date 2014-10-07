package creational.builder.builder2;

/** A customer ordering a pizza. */

class Test {
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		HawaiianPizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
		SpicyPizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

		waiter.setPizzaBuilder(hawaiianPizzaBuilder);
		waiter.constructPizza();

		Pizza pizza = hawaiianPizzaBuilder.getResult();
		
		System.out.println("HawaiianPizzaBuilder: "+ pizza);
		
		waiter.setPizzaBuilder(spicyPizzaBuilder);
		waiter.constructPizza();

		pizza = spicyPizzaBuilder.getResult();
		
		System.out.println("SpicyPizzaBuilder: "+ pizza);
	}
}
