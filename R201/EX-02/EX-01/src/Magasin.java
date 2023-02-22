
//3.2
public class Magasin {

	String nomMagasin;
	Table[] table;
	int nbTab;
	Magasin(String n,int nb)
	{
		this.nomMagasin=n;
		this.nbTab =nb;
	};
	
	void add (Table t)
	{
	this.table[nbTab]=t;
	this.nbTab++;
	}
	
	public static void main(String[]args) {
		
	

	
	
	
	}
	
}
