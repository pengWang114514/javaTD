package td6;

public abstract class Employee {
	/*Un employ� est caract�ris� par 
	son nom, son pr�nom, son �ge, son ann�e d�entr�e dans l'entreprise ; 
	
	une m�thode calculerSalaire (ce calcul d�pend du type de l'employ�) ; 
	
	une m�thode getNom retournant une cha�ne de caract�res obtenue en concat�nant la cha�ne de caract�res "L'employ� " avec le pr�nom et le nom ; 
	si cela est faisable, un constructeur permettant d�initialiser les attributs. */
	
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
