import java.util.Scanner;
import java.util.ArrayList;
public class base_Aliment {
	public static void main(String args[])
    {
		Scanner scanner = new Scanner(System.in);
		//test1
        Riz rice = new Riz(100);
        System.out.println( rice.getAmount() + " grams of rice has " + rice.getCalorie() + " calories.");
        
        Egg egg = new Egg(30);
        System.out.println( egg.getAmount() + " grams of egg has " + egg.getCalorie() + " calories.");
        
        Baouf baouf = new Baouf(300);
        System.out.println( baouf.getAmount() + " grams of baouf has " + baouf.getCalorie() + " calories.");
        
        Carrot carrot = new Carrot(100);
        System.out.println( carrot.getAmount() + " grams of carrot has " + carrot.getCalorie() + " calories.");  
        
        String[] food = new String [] {"rice","egg","baouf","carrot"};
        //rrayList repas =new ArrayList();//mettre le narriture
        String [] [] repas = {
        		{ "Baouf_au_carrot","entier", "proteines=10.39","glucides=3.05 ","lipides=11.2","calories =153","baouf","carrot"},
        		{ "bouille_de_riz","liquide","proteines=1.02","glucides=0.54 ","lipides=0.11","calories =12.3","rice"},
        		{ "omelette","entier","proteines=21.2","glucides=5.89 ","lipides=9.56","calories =125.3","egg"},
        		{ "sauce_de_carrot","liquide","proteines=1.47","glucides=3.54 ","lipides=5.11","calories =10.3","carrot"}
        }
        
      //choisir un aliment
        System.out.println( "Nom de l'aliment consomm¨¦: ");
       int name = scanner.nextInt();
        System.out.println("Vous avez saisi : "+food[name]);
        //touver le nom d'aliment
        for(int i=0;int j=0;i<repas.length()) {
        	
        }
        
        //afficher l'information d'aliment,mais je pas tous compris le relation entre repas et aliment
        
        
        //test 2 
        Repas economy = new Repas();
        economy.add(new Riz(200));
        economy.add(new Baouf(250));
        System.out.println("Total calories of an repas are " + economy.getCalorie() +".");
        
        Repas valuedChoice = new Repas();
        valuedChoice.add(new Riz(200));
        valuedChoice.add(new Egg(30));
        valuedChoice.add(new Carrot(100));
        valuedChoice.add(new Baouf(300));
        System.out.println("Total calories of a valued-choice lunch box are " + valuedChoice.getCalorie()+".");
}
}
