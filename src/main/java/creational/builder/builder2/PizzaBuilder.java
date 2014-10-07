package creational.builder.builder2;

/** interface Builder */

interface PizzaBuilder {
	public void createNewPizzaProduct();

	public void buildDough();

	public void buildSauce();

	public void buildTopping();
}
