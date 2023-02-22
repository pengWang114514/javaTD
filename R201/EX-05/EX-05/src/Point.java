
public class Point {
	
		  // Coordonn�es du point
		 private double x;
		   private double y;

		  /**
		   * Constructeur d'un point acceptant ses deux coordonn�es.
		   */
		  public Point(double x, double y) {
		    this.x = x;
		    this.y = y;
		  }

		  /**
		   * Constructeur d'un point sans argument; les coordon�es sont mises � (0,0).
		   * Ce constrcuteur cr�e une surcharge: deux constrcuteurs ont m�me noms mais
		   * celui qui est appele est choisis gr�ce aux arguments qui sont pass�s � son appel.
		   */
		  public Point() {
		    this.x = 0;
		    this.y = 0;
		    // Ces deux instructions peuvent �tre remplac�es par la seule suivante:
		    // this(0,0);
		    // qui appelle l'autre constructeur
		  }

		  /**
		   * D�place un point de dx en abscisse et de dy en ordonn�e.
		   */
		  public void translate(double dx, double dy) {
		    x = x + dx;
		    y = y + dy;
		  }

		  /**
		   * D�place un point de d en abscisse et de d en ordonn�e.
		   * Cette m�thode est une surcharge de la pr�c�dente
		   */
		  /*public void translate(double d) {
		    // premier solution est la suivante :
		    // x = x + d;
		    // y = y + d;
		    // Une autre fa�on plus �l�gante est d'appeler l'autre m�thode:
		    //translate(d,d);
		  }

		  /**
		   * Donne la repr�sentation d'un point sous la forme (x,y).
		   */
		  public String toString() {
		    return "(" + x + "," + y + ")";
		  }

		  /**
		   * Retourne vrai si p a les same coordonn�es que l'instance de cette
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
		    System.out.println("Apr�s translation: " + p.toString());
		    System.out.println("la distance entre ce point et p c'est: "+o.distance(p));

		    Point p1 = new Point();
		    Point p2 = new Point(1.1,0);
		     
		    System.out.println(p1.same(p2));    // affiche true
		  }
		}


