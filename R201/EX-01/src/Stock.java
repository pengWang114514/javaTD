
public class Stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int y = 3;
		char t[];
		double v[];
		t = new char [y] ;
		v = new double[y];
		 t[0]= 'A';
		 t[1]= 'B';
		 t[2] = 'C';
		 
		 v[0]=1.1;
		 v[1]=1.2;
		 v[2]=1.3;
		 
		 /*for (char code : t) {
				System.out.print ("" +code +'\t');
		}*/
	 for (int a = 0 ; a < t.length ; a++) {
				System.out.print (t[a]);
				System.out.print("   ");
				
		 }
	 System.out.println(" ");
	 for (int a = 0 ; a < t.length ; a++) {
		 System.out.print (v[a]);
		 System.out.print(" ");
	 }
	 
	 System.out.println(" ");
		 boolean fini = false;
		 int i = 0;
		 while (! fini)
		 {
			 System.out.print (t[i]);
			 System.out.print(" -");
	           System.out.print (v[i]);
	           System.out.print(" Euros");
	           System.out.println();
               i++;
               fini = i ==t.length;

	     }

}
}
