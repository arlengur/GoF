package creational.prototype;

public class Test {

	public static void main(String[] args) {
		Car bmw = new Car("BMW", "Very cool car");
		for (int i = 0; i < 10; i++) {
			try {
				Car copy = (Car) bmw.clone();
				copy.setName("BMW " + i);
				System.out.println("Car:" + copy.getName() + ", info:"
						+ copy.getInfo());
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		}
	}
}
