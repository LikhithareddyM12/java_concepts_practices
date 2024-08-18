package java_concepts_practices;
/* constructors:
 * constructor is a block of code similar to the method.
  it called with instance(object)of class is created.. usually method are created after the object creation...
 * Constructor are created at the time of object creation...//
 * constructor name is always be  a class name .     
 * constructor cannot have a returntype like void etc..
 * we didn't return any value from the constructor..
 * default constructors are always public only. 
 * when we define a constructor those constructors are explicit constructor..
 * if java define a constructor those constructor are implicit constructors.these are always default..
 * when we didn't define a constructor java itself define a default constructor.once when we define a 
   constructor java don't define any constructor...
 * We can create n number constructors with same name but it be duplicated so we can overcome it by different
   parameter...
 * there are two type of implicit constructors- parameterized and unparameterized constructors..
 * Default constructors are always a unparameterized constructors.... 
 * Constructor are used for memory allocation..
 * Constructor always a public, private,protected or allowed we cannot define it as static or non-static
 * */

public class ConstructorDemo {
	public int i;
	public static void main(String[] args) {
		ConstructorDemo cd = new ConstructorDemo(); 
		System.out.println(cd.i);
	}
	public ConstructorDemo() { // explicit constructor-unparameterized
		i=20;
		System.out.println("constructor is called");
	}		
	public ConstructorDemo(int a) { // parameterized constructor
	
		i = a;
	}
}
