package POMClass;

public class strings {

	public static void main(String[] args) {
		
		
		String a ="omkar";
		char [] b = a.toCharArray();
		int h = b.length;
		for(int i =0;i<=b.length-1;i++)
		{
			System.out.print(b[i]);
		}
		System.out.println();
		String c = b.toString();
		System.out.println(b);
		System.out.println(c);
		System.out.println(h);
		
		char [] v = {'o','m','k','a','r'};
		
		String v1 = v.toString();
         System.out.println(v1.charAt(1));
		System.out.println(v1);
	}

}
