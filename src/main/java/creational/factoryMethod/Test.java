package creational.factoryMethod;

public class Test {

	public static void main(String[] args) {
		CarCreator japanCarCreator = new JapanCarCreator();
		Car infinity = japanCarCreator.createCar(JapanCarCreator.INFINITY);
		Car toyota = japanCarCreator.createCar(JapanCarCreator.TOYOTA);
		Car mazda = japanCarCreator.createCar(JapanCarCreator.MAZDA);
		
		System.out.println(infinity.getInfo());
		System.out.println(toyota.getInfo());
		System.out.println(mazda.getInfo());

	}

}
