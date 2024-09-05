package java_interfaces;

public class User {
	public static void main(String []args) {
		Lenovo lenovo = new Lenovo();
		lenovo.copy();
		lenovo.paste();
		lenovo.cut();
		lenovo.capture();
		lenovo.security();
		Laptop.audio();
		
		Hp hp = new Hp();
		hp.printing();
	}
	      
 
}
