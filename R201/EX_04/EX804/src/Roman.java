public class Roman extends Livre {
			
			public Roman(String titre,int numero,String auteur,int nbpages)
			{
				_auteur=auteur;
				_nbpages=nbpages;
				_titre = titre;
				_numero = numero;
			}
			public static void main (String args[]) {
				Roman r = new Roman("roman",1,"vitor",10);
			}

		}
		