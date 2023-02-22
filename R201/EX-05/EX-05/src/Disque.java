
public class Disque {
  
   private Point centre;
  private double rayon;      
  
  
  /**
   * Construit une disque � partir du centre et du rayon passe en arguments.
   */
  public Disque(Point centre, double rayon) {
    this.centre = centre;
    this.rayon = rayon;
  }

  /**
   * Construit un disque dont le centre est un Point par d�faut et
   * dont le rayon est 1.
   */
  public Disque() {
    this.centre = new Point();
    this.rayon = 1;
  }

  /**
   * Donne la repr�sentation d'un disque sous la forme:
   * Disque - centre: (x,y) rayon: r.
   */
  public String toString() {
    // La repr�sentation du centre est de la responsabilit� de la classe Point
    // Il est donc important de lui "d�l�guer" cette t�che en appelant la m�thode
    // toString() sur l'objet centre. 
    return "Disque - centre: " + centre.toString() + " rayon: " + rayon;
  }

  /**
   * D�place le disque de dx en abscisse et de dy en ordonn�e.
   */
  public void translate(double dx, double dy) {
	    // Pour d�placer le disque, il suffit de d�placer son centre. 
		  
	    centre.translate(dx,dy);
	  }

  /**
   * Retourne la surface du disque.
   */ 
  public double surface() {
   
    return  Math.PI * rayon * rayon;
  }
  //retourne le perimetre du disque
  public double perimetre()
  {
	  return Math.PI*rayon*2;
  }
 
	 

  /**
   * Retourne vrai si les deux disques ont des centres de m�mes
   * coordonn�es et un m�me rayon.
   * On d�l�gue le test d'�galit� des centres � la classe Point.
   */
  public boolean same(Disque d) {
    return ((centre.same(d.centre)) && (rayon == d.rayon) );
  }

  public static void main(String[] args) {
	 
    Point p1 = new Point(3.4, 5.7);
    Point p2 = new Point(5,5);
    Disque d = new Disque(p1,4);
    System.out.println(d.toString());
    System.out.println("Surface du disque : " + d.surface());
    System.out.println("Perimetre du disque : " + d.perimetre());
    d.translate(1.6, -0.7);
    System.out.println("Apr�s translation : " + d.toString());

    Disque d2 = new Disque(p2,4);
    
    System.out.println(d.same(d2));       // affiche true
  }
}