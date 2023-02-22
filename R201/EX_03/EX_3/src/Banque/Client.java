package Banque;
//import Banque;
//import Compte;

public class Client {

	/*Compte compte;
	Banque banque;
	private int numéro;
	private String nom;
	private String adresse;*/
	
	private int numeroClient;
	private String nomClient;
	private String adresse;
	Client(int numeroClient,String nomClient,String adresse)
	{
		this.numeroClient=numeroClient;
		this.nomClient=nomClient;
		this.adresse=adresse;
	}
	
	public void afficherInfoCompteClient()
	{
		
	}
	
	public int getNumero()
	{
		return numeroClient;
	}
	
	public void setNumero(int numero) 
	{
		this.numeroClient = numero;
	}
	
	public String getNomClient() 
	{
		return nomClient;
	}
	
	public void setNomClient(String nomClient) 
	{
		this.nomClient = nomClient;
	}
	
	public String getAdresse() 
	{
		return adresse;
	}
	
	public void setAdresse(String adresse) 
	{
		this.adresse = adresse;
	}

}