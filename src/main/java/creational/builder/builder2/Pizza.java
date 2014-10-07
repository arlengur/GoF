package creational.builder.builder2;

/** Product */

class Pizza {
	private String dough = "";
	private String sauce = "";
	private String topping = "";

	public void setDough(String dough) {
		this.dough = dough;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("тесто = " + dough + ", ");
		sb.append("соус = " + sauce + ", ");
		sb.append("верх = " + topping);

		return sb.toString();
	}
}
