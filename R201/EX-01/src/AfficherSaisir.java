import java.util.Random;
import java.util.Scanner;

public class AfficherSaisir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EXA
		System.out.println ("Bonjour");
		System.out.printf ("PI: %1.3f", Math.PI) ;
		
		System.out.println ("Donne-moi un chiffre n pour "
				+ "afficher un nombre aléatoire entre 0 et n");
		//method 1
		Scanner n = new Scanner(System.in);
		int d1 = n.nextInt();
		
		//method 2
		Random random=new Random();
		int nmb= random.nextInt(d1);
		System.out.println ("afficher un nombre aléatoire entre 0 et n\t" +nmb);
		System.out.println ("afficher un nombre aléatoire entre 0 et n\t" +d1);
	}

}

/**
import java.util.Scanner;

public class AfficherSaisir {
    
	public static void main(String[] args) {
		System.out.println("Bonjour !");

		System.out.printf ("Affichage formate de Math.PI: %3.3f \n", Math.PI); 
		System.out.println();
		
		// Saisir un nombre n
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Vous avez saisi le nombre : " + n);
		
		// Tirer au hasard un nombre entre 0 et n
		double m = Math.random()*n;
		System.out.println("Nombre aleatoire entre 0 et " + n + " : " + m);

		// On ferme le scanner avant de quitter le programme
		sc.close();
	}
}**/