package creational.factoryMethod;

public class JapanCarCreator implements CarCreator {
	public final static String INFINITY = "Infinity";
	public final static String TOYOTA = "Toyota";
	public final static String MAZDA = "Mazda";

	@Override
	public Car createCar(String carName) {
		if (carName.equals(INFINITY)) {
			return new Infinity();
		} else if (carName.equals(TOYOTA)) {
			return new Toyota();
		} else if (carName.equals(MAZDA)) {
			return new Mazda();
		}
		return null;
	}
}
