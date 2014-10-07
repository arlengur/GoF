package creational.builder.builder1;

public class Test {

	public static void main(String[] args) {

		Water cola = new Water.WaterBuilder().name("Cola").sugar(true)
				.sodium(true).build();
		Water colaLight = new Water.WaterBuilder().name("ColaLight")
				.sugar(false).sodium(false).build();

		System.out.println(cola);
		System.out.println(colaLight);
	}

}
