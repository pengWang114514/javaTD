package Banque;
//import Banque.Banque.Client;

public class Compte {
 /*static final int SEUIL_SECURITE = 1000;
	Client[] client;
	private int numéro;
	private double solde;
	 int numeroCompteur = 1;
	private Client properite;
	
	
	public Compte(int SEUIL,int solde,Client properite)
	{
		setNuméro(numeroCompteur);
		numeroCompteur++;
		setSolde(solde);
		
	}
	
	
	
	public Client[] getClient() {
		return client;
	}
	public void setClient(Client[] client) {
		this.client = client;
	}
	public int getNuméro() {
		return numéro;
	}
	public void setNuméro(int numéro) {
		this.numéro = numéro;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
		if(solde>SEUIL_SECURITE)
		{
			System.out.println("ATTENTION tentative d’affectation suspecte d’un nouveau solde : compte no … ");
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
	/*Créez une classe Banque dans laquelle vous mettrez un main (). Dans ce main(), 
	 * déclarez et crééz quelques instances des classes Client et CompteCourant. 
	 * Initialisez les attributs de ces comptes et de ces clients à l’aide de leurs constructeurs. 
     */
	private int numero;
	private double Solde=0;
	private double seuilDécouvert;
	double montant;
	private Client proprietaire;
	static int numerocompteur=1;
	static final int SEUIL_SECURITE=1000;
	
	public Compte(int seuilDécouvert,int Solde,Client proprietaire)
	{
		this.numero=numerocompteur;
		numerocompteur++;
		this.seuilDécouvert=seuilDécouvert;
		if(Solde>SEUIL_SECURITE)
		{
			System.out.println("ATTENTION tentative d’affectation suspecte d’un nouveau solde : compte n°"+numero);
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
		System.out.println("ATTENTION tentative d’affectation suspecte d’un nouveau solde : compte n°"+numero);
		else 
		{
		this.Solde = Solde;
		}
	}
	
	public double getSeuilDécouvert() 
	{
		return seuilDécouvert;
	}
	
	public void setSeuilDécouvert(double seuilDécouvert) 
	{
		this.seuilDécouvert = seuilDécouvert;
	}
	
	public Client getClientCompte()
	{
		return proprietaire;
	}
	
	public void créditer(double montant)
	{
		Solde+=montant;
	}
	
	public void débité(double montant)
	{
		boolean veref=(Solde-montant>seuilDécouvert);
		if(veref==true)
			{
				Solde-=montant;
			}
	}
	
}