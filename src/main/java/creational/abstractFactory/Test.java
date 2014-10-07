package creational.abstractFactory;

public class Test {	
	
	public static void main(String[] args){
		Worker pepsiWorker = new Worker(new Pepsi());
		Worker colaWorker = new Worker(new Cola());
		
		pepsiWorker.run();
		colaWorker.run();
	}
}
