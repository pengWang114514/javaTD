package Banque;
//import Banque.Banque.Client;

public class Compte {
 /*static final int SEUIL_SECURITE = 1000;
	Client[] client;
	private int num�ro;
	private double solde;
	 int numeroCompteur = 1;
	private Client properite;
	
	
	public Compte(int SEUIL,int solde,Client properite)
	{
		setNum�ro(numeroCompteur);
		numeroCompteur++;
		setSolde(solde);
		
	}
	
	
	
	public Client[] getClient() {
		return client;
	}
	public void setClient(Client[] client) {
		this.client = client;
	}
	public int getNum�ro() {
		return num�ro;
	}
	public void setNum�ro(int num�ro) {
		this.num�ro = num�ro;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
		if(solde>SEUIL_SECURITE)
		{
			System.out.println("ATTENTION tentative d�affectation suspecte d�un nouveau solde : compte no � ");
		}else
		{
			this.solde =solde;
		}
			
		
	}
	public double getSeuil() {
		return seuil;
	}
	public void setSeuil(double seuil) {
		this.seuil = seuil;
	}
	private double seuil;
	/*Cr�ez une classe Banque dans laquelle vous mettrez un main (). Dans ce main(), 
	 * d�clarez et cr��z quelques instances des classes Client et CompteCourant. 
	 * Initialisez les attributs de ces comptes et de ces clients � l�aide de leurs constructeurs. 
     */
	private int numero;
	private double Solde=0;
	private double seuilD�couvert;
	double montant;
	private Client proprietaire;
	static int numerocompteur=1;
	static final int SEUIL_SECURITE=1000;
	
	public Compte(int seuilD�couvert,int Solde,Client proprietaire)
	{
		this.numero=numerocompteur;
		numerocompteur++;
		this.seuilD�couvert=seuilD�couvert;
		if(Solde>SEUIL_SECURITE)
		{
			System.out.println("ATTENTION tentative d�affectation suspecte d�un nouveau solde : compte n�"+numero);
		this.proprietaire=proprietaire;
		}
		else 
		{
			this.Solde = Solde;
		}	
	}
	
	public int getNumero() 
	{
		return numero;
	}
	
	public void setNumero(int numero)
	{
		this.numero = numero;
	}
	
	public double getSolde()
	{
		return Solde;
	}
	
	public void setSolde(double Solde) 
	{

		if(Solde>SEUIL_SECURITE)
		System.out.println("ATTENTION tentative d�affectation suspecte d�un nouveau solde : compte n�"+numero);
		else 
		{
		this.Solde = Solde;
		}
	}
	
	public double getSeuilD�couvert() 
	{
		return seuilD�couvert;
	}
	
	public void setSeuilD�couvert(double seuilD�couvert) 
	{
		this.seuilD�couvert = seuilD�couvert;
	}
	
	public Client getClientCompte()
	{
		return proprietaire;
	}
	
	public void cr�diter(double montant)
	{
		Solde+=montant;
	}
	
	public void d�bit�(double montant)
	{
		boolean veref=(Solde-montant>seuilD�couvert);
		if(veref==true)
			{
				Solde-=montant;
			}
	}
	
}