package java_interfaces;

public class Hp implements Laptop {

	@Override
	public void copy() {
		System.out.println("Hp copy code");
		
		
	}

	@Override
	public void paste() {
		System.out.println("Hp paste code");
		
	}

	@Override
	public void cut() {
	System.out.println("Hp cut code");	
	}

	@Override
	public void keyboard() {
		System.out.println("Hp keyword code");
		
	}
	public void printing() {
		System.out.println("hp printing code");
	}

}
