package creational.factoryMethod;

public class Toyota implements Car {

	@Override
	public String getInfo() {
		return "Марка автомобиля: " + JapanCarCreator.TOYOTA;
	}

}
