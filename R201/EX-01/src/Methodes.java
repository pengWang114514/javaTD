
public class Methodes {

	 public static char a;
      public static char b;
	static String echanger (char a, char b)
	{
		char temp;
		temp=b;
		b=a;
		a=temp;
		return "pendent echanger: a= " +a +" , b= " +b;
		
	}
	
	static void  tabModifier (float t[])
	{
		t[0]=150.7f ;
		
		
	}
	
	
	static void  adrModifier (int t[])
	{
		int tab = null;
		System.out.println("Changement de l'adresse de t" + tab)

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		a ='A';
	     b='B';
	//1	
    
      System.out.println("avant echanger: a= " +a +" , b= " +b);
      String temps = echanger (a,b);
      System.out.println(temps);
      System.out.println("apres echanger: a= " +a +" , b= " +b);
      //2
      float t[]= {1,2,3};
      System.out.println("avant echanger ");
      for ( float valeur :t)
    	  System.out.println(valeur);
      
     tabModifier(t);
     System.out.println("apres echanger");
     for ( float valeur :t)
   	  System.out.println(valeur);
     //3
     
      int c1[]=null;
      int d1[]=null;
     /* System.out.println("avant modifier");
      System.out.println(c1.hashCode());
      System.out.println(d1.hashCode());
     adrModifier(c1,d1);
     System.out.println("apres modifier");
     System.out.println(c1.hashCode());
     System.out.println(d1.hashCode());*/

}
}
