package java_concepts_practices;
/*Objects:
 * objects are instance of the class..
 * objects are used create memory allocation for variable and method.
 * objects creation involves in adding constructors and variable..
 * Syntax of an object is **className variable = new className();**
 * we can call object from different class through the reference object of the class..
 * object consist variable and method... 
 * */

public class ObjectCreation {
	int i = 10;
	int j = 20;

	public ObjectCreation() {
		i = 10;
		j = 20;
	}

	public ObjectCreation(int i ,int j) {
		this.i=i;
		this.j=j;
	}

	public static void main(String[] args) {
     ObjectCreation oc1 = new ObjectCreation();
     ObjectCreation oc2 = new ObjectCreation(15,25);
     ObjectCreation oc3 = new ObjectCreation(25,35);
     
     System.out.println(oc1.add());
     System.out.println(oc2.add());
     System.out.println(oc3.add());
     
	}
	public int add() {
		return i+j;
	}

}





