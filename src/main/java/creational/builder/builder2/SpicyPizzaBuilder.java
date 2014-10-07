package creational.builder.builder2;

/** Concrete Builder */

class SpicyPizzaBuilder implements PizzaBuilder {
	private Pizza pizza;

	public Pizza getResult() {
		return pizza;
	}

	public void createNewPizzaProduct() {
		pizza = new Pizza();
	}

	public void buildDough() {
		pizza.setDough("pan baked");
	}

	public void buildSauce() {
		pizza.setSauce("hot");
	}

	public void buildTopping() {
		pizza.setTopping("pepperoni+salami");
	}
}
