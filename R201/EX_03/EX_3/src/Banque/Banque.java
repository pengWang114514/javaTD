package Banque;
//import Banque.Banque.Client;

public class Banque {

	private String nom;
	private final int tailleMax=10000;
	private Compte []compte=new Compte[tailleMax];
	private Client []client=new Client[tailleMax];
	int index=0;
	int index2=0;
	
	
	public Banque(String nom) 
	{
		this.nom=nom;
	}
	
	void add(Compte a)
	{
		this.compte[index]=a;
		index++;
	}
	
	void addClient(Client a)
	{
		client[index2]=a;
		index2++;
	}
	
	public void afficherCompteBanque()
	{
		
		for(int i=0;i<compte.length ;i++)
		{
			if (compte[i].getClientCompte()!= null) {
			System.out.println("le numero du compte "+compte[i].getNumero()+
			"le proprietaire "+compte[i].getClientCompte().getNomClient()+"le solde est "+
			compte[i].getSolde()+"le seuil découvert est de "+ compte[i].getSeuilDécouvert());
			}
		}
	}
	public void afficherCompteBanqueClient(String nomClient)
	{
		for(int i=0;i<compte.length && compte[i]!=null;i++)
		{
			if(nomClient==compte[i].getClientCompte().getNomClient())
			{
				System.out.println(nomClient+" : le numero du compte "+compte[i].getNumero()+
						"le proprietaire "+compte[i].getClientCompte().getNomClient()+" le solde est "+
						compte[i].getSolde()+" le seuil découvert est de "+ compte[i].getSeuilDécouvert());
			}
			
		}
	}
	public void afficherinfoProprietaire(int numero)
	{
		
		for(int i=0;i<compte.length && compte[i]!=null;i++)
		{
			if(numero==compte[i].getNumero())
			System.out.println("numéro client : "+compte[i].getClientCompte().getNumero()+" nom du client : "+compte[i].getClientCompte().getNomClient()+
					" adresse client :"+compte[i].getClientCompte().getAdresse());
		}
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	Banque LCL;
	public static void main(String args[])
	{
		Banque LCL=new Banque("LCL");
		Banque CIC=new Banque("CIC");
		Client ab=new Client(1,"LUC","a");
		Client bc=new Client(1,"personne2","a");
		Compte compte1=new Compte(200,500, ab);
		Compte compte2=new Compte(200,600,bc);
	
		
		//LCL.add(compte1);
		
		CIC.add(compte1);
		//CIC.add(compte2);
		CIC.afficherCompteBanque();
		//CIC.afficherCompteBanqueClient("LUC");
		//CIC.afficherinfoProprietaire(1);
		

		
	}

}