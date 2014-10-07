package creational.abstractFactory;

public class PepsiContainer implements AbstractContainer{

	@Override
	public void pour(AbstractWater water) {
		System.out.println("Залита вода фирмы "+ water.getClass().getSimpleName().replace("Water", ""));		
	}
}
