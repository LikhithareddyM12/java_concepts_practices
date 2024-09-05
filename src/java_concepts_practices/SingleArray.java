package java_concepts_practices;
/* Array is a non-primitive data type..  
 * We want create an object to use arrays..
 * An array is a container object thats holds a fixed number of values of single type..
 		1. Single dimensional Array
 		2.MultiDimensional Array
 			two dimensional array
 			jagged Array
 * Arrays are stored in the[]..
 * 
 * */

public class SingleArray {

	public static void main(String[] args) {
		//int a[]= new int[] {2,3,4,5};
		int a[];
		a=new int[]{2,4,5,6};
		
		//int a[]= {2,4,5,6};
		//int a[] = new int[5];
		//a[0]=1;
		//a[1]=2;
		//a[2]=3;
		//a[3]=4;
		//a[4]=5;
		//for(int i=0;i<a.length;i++) {
		//	System.out.println(a[i]);
			
	//	}
		//int sum = a[0] + a[1] + a[2] + a[3] + a[4];
		//System.out.println(sum);
		int i=0;
		while(i<a.length) {
			System.out.println(a[i]);
			i++;
		}
	}

}
