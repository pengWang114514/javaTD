
public class Table {

	
		 int nbPieds;
		 String couleur;	
	     static String NOIR = "NOIR";
		 double prix;
		//1)
		Table(){
			this.nbPieds =4;
			this.couleur="Maroon";
			
		}
		
		Table(int nbPieds){
			this.nbPieds= nbPieds;
			
			
		}
		
		 Table(int nbPieds,String NOIR){
			this.nbPieds= nbPieds;
			this.couleur=NOIR;
			
		}
	
		 //2)
		 
		 //3
		 
		 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1)
		
		
		System.out.println ();
		Table t = new Table ();
    	System.out.println (t.nbPieds);
    	System.out.println (t.couleur);
    	System.out.println (t.prix);
    	System.out.println ();
   	 
    	Table t2 = new Table (3);
    	System.out.println (t2.nbPieds);
    	System.out.println (t2.couleur);
    	System.out.println (t2.prix);
    	System.out.println ();
   	 
    	Table t3 = new Table (6, Table.NOIR);
    	System.out.println (t3.nbPieds);
    	System.out.println (t3.couleur);
    	System.out.println (t3.prix);
    	System.out.println ();
    	
    	//2)
    	Table t4 = new Table ();
    	t4=t3;
    	t4.prix =80;
    	System.out.println (t4.nbPieds);
    	System.out.println (t4.couleur);
    	System.out.println (t4.prix);
    	System.out.println ();
    	
    	
    	//3.1
    	Table[] tab =new Table[4];
    	
    	Table tab0 = new Table();
    	tab0.prix = 10.0;
    	
    	Table tab1 = new Table();
    	tab1.prix=11.0;
    	
    	Table tab2 = new Table();
    	tab2.prix=12.0;
    	
    	tab [0]=tab0;
    	tab [1]=tab1;
    	tab [2]=tab2;
    	
    	
    	int i=0;
    	double totalprix = 0;
    	//for(int i =0;i<tab.length;i++)
    	for(Table tab77 : tab)
    	{
    		if (tab[i]==null) {
    			System.out.println(false);
    		}else {
    		totalprix=totalprix+tab[i].prix;
    		System.out.println ("le prix de tab"+i+" c'est"+tab[i].prix);
    		}
    		i++; 
    		System.out.println(tab77);//tab77会显示出tab[i]的地址
    		
    	}
    	System.out.println ("le prix total c'est "+totalprix);
    		
   
    	
    	
    	
    	
    	
    	
    	
    	
    	
	}   	 

		
	}


