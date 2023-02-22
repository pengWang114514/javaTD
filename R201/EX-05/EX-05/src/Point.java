
public class Point {
	
		  // Coordonnées du point
		 private double x;
		   private double y;

		  /**
		   * Constructeur d'un point acceptant ses deux coordonnées.
		   */
		  public Point(double x, double y) {
		    this.x = x;
		    this.y = y;
		  }

		  /**
		   * Constructeur d'un point sans argument; les coordonées sont mises à (0,0).
		   * Ce constrcuteur crée une surcharge: deux constrcuteurs ont même noms mais
		   * celui qui est appele est choisis grâce aux arguments qui sont passés à son appel.
		   */
		  public Point() {
		    this.x = 0;
		    this.y = 0;
		    // Ces deux instructions peuvent être remplacées par la seule suivante:
		    // this(0,0);
		    // qui appelle l'autre constructeur
		  }

		  /**
		   * Déplace un point de dx en abscisse et de dy en ordonnée.
		   */
		  public void translate(double dx, double dy) {
		    x = x + dx;
		    y = y + dy;
		  }

		  /**
		   * Déplace un point de d en abscisse et de d en ordonnée.
		   * Cette méthode est une surcharge de la précédente
		   */
		  /*public void translate(double d) {
		    // premier solution est la suivante :
		    // x = x + d;
		    // y = y + d;
		    // Une autre façon plus élégante est d'appeler l'autre méthode:
		    //translate(d,d);
		  }

		  /**
		   * Donne la représentation d'un point sous la forme (x,y).
		   */
		  public String toString() {
		    return "(" + x + "," + y + ")";
		  }

		  /**
		   * Retourne vrai si p a les same coordonnées que l'instance de cette
		   * classe, et faux sinon.
		   */
		  public boolean same(Point p) {
		    return ( (p.x == this.x) && (p.y == this.y) );
		  }
		  
		  /**
		   * return la distance entre ce point et p.
		   */
		  public double distance(Point p) {
		    return Math.sqrt((x - p.x)*(x - p.x) + (y - p.y)*(y - p.y));
		  }
		  
		  
		  
		  public static void main(String[] args) {
		    Point o = new Point(0,0.0);
		    System.out.println(o);
		    Point p = new Point(1.5,3.4);
		    System.out.println(p);
		    p.translate(0.5,-1.4);
		    System.out.println("Après translation: " + p.toString());
		    System.out.println("la distance entre ce point et p c'est: "+o.distance(p));

		    Point p1 = new Point();
		    Point p2 = new Point(1.1,0);
		     
		    System.out.println(p1.same(p2));    // affiche true
		  }
		}


