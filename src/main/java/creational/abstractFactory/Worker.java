package creational.abstractFactory;

public class Worker {
	
	private AbstractWater water;
	private AbstractContainer container;

	public Worker(AbstractFactory factory) {
		water = factory.createWater();
		container = factory.createContainer();
	}
	
	public void run(){
		container.pour(water);		
	}
}
