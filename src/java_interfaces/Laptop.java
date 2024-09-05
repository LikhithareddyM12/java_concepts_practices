package java_interfaces;
/*
 *interface are blue print of class
 *class is implementator for interface..
 *interface is not only an abstract method
 *until java 7 there are only abstract method in the java after java 8 there also a implemented methods in the java
 * default are used in the inside the world.
 * static method are use in the outside of the world.. 
 * private method are used for duplication in the code..
 * we can  add extract method after implementing the interfaces...
 * */

public interface Laptop {
	
	public void copy();
	
	public void paste();
	
	public  void cut();
	
	public void keyboard();
	
	default void secuirty() {
		 System.out.println("please implement");
	}
	static void audio() {
		System.out.println("Audio code");
	}
	
	private void commonCode() {
		System.out.println("commonCode");
	}
	
}
