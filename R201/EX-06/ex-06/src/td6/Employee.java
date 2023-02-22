package td6;

public abstract class Employee {
	/*Un employé est caractérisé par 
	son nom, son prénom, son âge, son année d’entrée dans l'entreprise ; 
	
	une méthode calculerSalaire (ce calcul dépend du type de l'employé) ; 
	
	une méthode getNom retournant une chaîne de caractères obtenue en concaténant la chaîne de caractères "L'employé " avec le prénom et le nom ; 
	si cela est faisable, un constructeur permettant d’initialiser les attributs. */
	
	private String nom;
	private String prenom;
	private int age;
	private int anneeEntre;
	
	public Employee(String nom,String prenom,int age,int anneeEntre)
	{
		this.nom = nom;
		this.prenom =prenom;
		this.age = age;
		this.anneeEntre = anneeEntre;
	}
	
	public double calculerSalaire()
	{
		return 0;
	}
	
	
}
