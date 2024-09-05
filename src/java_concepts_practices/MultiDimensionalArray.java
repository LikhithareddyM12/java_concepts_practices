package java_concepts_practices;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		//int a[][] =new int[3][2];
	   // a[0][0] =1;
	    //a[0][1] =2;
	    
	    //a[1][0]=3;
	    //a[1][1]=4;
	    
	    //a[2][0]=5;
	    //a[2][1]=6;
	    //System.out.println(a[0][0]);
	    //for(int i=0;i<a.length;i++) {
	    	//int[] singleRow = a[i];	
	    	//for(int j=0;j<singleRow.length;j++) {
	    	//	System.out.print(singleRow[j]+" ");
	    	//}
	    	//System.out.println();
	    	//}
		
	   // int a[][]= {{1,2},{3,4},{5,6}};
	   // int size=0;
	  //  for(int i =0; i< a.length;i++) {
	    //	for(int j=0;j<a[i].length;j++) {
	    		//System.out.print(a[i][j]+ " ");
	    		
	    	//}
	    	//System.out.println();
	    //}
		int a[][]= new int[3][];//jagged Arrays
	    a[0] = new int[2];
	    a[1] =new int[5];
	    a[2]= new int [3];
	    
	    a[0][0]=1;
	    a[0][1]=3;
	    
	    a[1][0]=31;
	    a[1][1]=21;
	    a[1][2]=41;
	    a[1][3]=51;
	    a[1][4]=61;
	 
	    a[2][0]=1;
	    a[2][1]=2;
	    a[2][2]=1;
	    
	    for(int i=0; i<a.length;i++) {
	    	for (int j=0;j<a[i].length;j++) {
	    		System.out.print(a[i][j] + " ");
	    	}
	   System.out.println();
	    }
	    
	    }

}
