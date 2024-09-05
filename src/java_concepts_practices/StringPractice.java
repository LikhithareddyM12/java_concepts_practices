package java_concepts_practices;

import java.util.Arrays;

/*String is a sequence of character and it is a class in java but considered as a literal because of its
  unique behaviour..
 * 
 * 
 * 
 * 
 * */
public class StringPractice {

	public static void main(java.lang.String[] args) {
		//String s1 = "Likhitha Reddy";
		//String emailid = "likhithareddy@gmail.com";
		//String s3 = "Hello";
		//String s2 = new String("Hello");
		//System.out.println(s1);
		//System.out.println(emailid);
		//System.out.println(s2);
		
		//System.out.println(s2.equals(s3));
		String s1 = "HeLlo guys How are  u all";
		String s2 = "hello";
		String s3 = "HELLO";
		String s4 = "12434";
		String s5 ;
		String s6 = "  "; 
		String s7 = "";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains("l"));
		System.out.println(s1.startsWith("H"));
		System.out.println(s3.endsWith("LO"));
		System.out.println(s1.length());
		System.out.println(s1.trim().length());
		System.out.println(s2.toUpperCase());
		System.out.println(s3.toLowerCase());
		System.out.println(s1.toCharArray());//it change entire string as character array..
		System.out.println(s1.indexOf("l"));
		System.out.println(s1.lastIndexOf("o"));
		System.out.println(s1.substring(2,5));
		System.out.println(s1.split(" "));
		System.out.println(Arrays.toString(s1.split(" ")));
		System.out.println(Arrays.toString(s1.split("\\^")));// when we want separate with special character we use "\\"..
		System.out.println(s1.charAt(9));
		System.out.println(s1.replace("u", "you"));//replaceAll() is used to replace all the statement..
		System.out.println(Integer.valueOf(s4));
		System.out.println(s6.isEmpty());
		System.out.println(s6.isBlank());
		
	}

}
