package java_interfaces;

public class Lenovo implements Laptop{

	@Override
	public void copy() {
		System.out.println("Lenovo copy code");
		
	}

	@Override
	public void paste() {
		System.out.println("Lenovo paste code");
		
	}

	
	public void cut() {
		System.out.println("lenovo cut code");
	}
	public void keyboard() {
		 System.out.println("Lenovo keyboard code");
		
	}
	public void capture() {
		System.out.println("Lenovo camera capture code");
	}
	

	public void security() {
		System.out.println(" lenovo security code");

}
}
