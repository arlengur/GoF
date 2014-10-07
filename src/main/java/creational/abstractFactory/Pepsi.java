package creational.abstractFactory;

public class Pepsi implements AbstractFactory{

	@Override
	public AbstractWater createWater() {
		return new PepsiWater();
	}

	@Override
	public AbstractContainer createContainer() {
		return new PepsiContainer();
	}

}
