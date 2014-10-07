package creational.factoryMethod;

public class Mazda implements Car {

	@Override
	public String getInfo() {
		return "Марка автомобиля: " + JapanCarCreator.MAZDA;
	}

}
