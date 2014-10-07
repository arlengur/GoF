package creational.abstractFactory;

public class Cola implements AbstractFactory{

	@Override
	public AbstractWater createWater() {
		return new ColaWater();
	}

	@Override
	public AbstractContainer createContainer() {
		return new ColaConteiner();
	}

}
