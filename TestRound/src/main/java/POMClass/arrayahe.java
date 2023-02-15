package POMClass;

public class arrayahe {

     public static void stay() {
    	 int a[] = {1,2,3,4};
    	 int b[]= {1,4,6,8};
    	 int c[]= new int[a.length+b.length];
    	 
    	 for(int i = 0;i<=a.length-1;i++) {
    		 for(int j = 0;j<=b.length-1;j++) {
    		 
    		 c[i]=a[i]+b[j];
    		 }
    	 }
    	 for(int k =0;k<=c.length-1;k++) {
    		 System.out.print(c[k]+",");
    	 }
    	 
     }
	
	public static void main(String[] args) {
		
		arrayahe.stay();
	}

}
