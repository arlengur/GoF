package creational.factoryMethod;

public class Infinity implements Car {

	@Override
	public String getInfo() {
		return "Марка автомобиля: " + JapanCarCreator.INFINITY;
	}

}
