import java.util.Vector;

public  class Repas {
	int calorie;
	Vector<Aliment> content = new Vector();
	
	void add(Aliment aliment) {
		content.add(aliment);
	}
	
	int getCalorie() {
		int totalCalorie = 0;
		
		for(Aliment aliment : content)
			totalCalorie += aliment.getCalorie();
		return totalCalorie;
	}
	
	
	
	
	/*private int num;
	private String nom;//le nom du repas
	private String type;//declarer le type de repas
	public Repas(int num,String nom,String type)
	{
		System.out.println("Constuire un repas");
		this.num = num;
		this.nom =nom;
		this.type =type;
	}
	public  double compteCalorie()
	{
		System.out.println("Pour le compte calorie");
		return 0.0;
	}
	//creer un fonction pour regarder les repas 
	public void repasCherche()
	{
		System.out.println("Trouvee le repas: "+this.nom+" C'est: "+this.type );
	}
	//retourne valeur en String
	public String toString()
	{
		return num +" "+type+" "+nom;
	}
	//prendre le type de repas
	public String getType()
	{
		return type;
	}
	//prendre le nom de repas
	public String getNom()
	{
		return nom;
	}
	*/
	
	
	

}
