package java_concepts_practices;
/*
 * type inference:
 * type inference is a concept in which the complier infers the type of variable using the values provided.. 
 * This type inference is restricted to the local variables..
 * this feature is introduced in java 10 version..
 * var is keyword it not a data type..
 * var can only be used in the local variables.
 * var can't be used for only declaration purpose, instead it should be used along with initialization..
 * when used with the arrays ,should not used []brackets..
 * var cant be used in in-line array intialisation but specifying the data type..
 * var can be used as variable name...
 * */

public class TypeInference {

	public static void main(String[] args) {
		var i = 23;
		var s1 = "Likhitha Reddy";
		var b1 = true;
		System.out.println(i);
		System.out.println(s1);
		System.out.println(b1);

	}

}
