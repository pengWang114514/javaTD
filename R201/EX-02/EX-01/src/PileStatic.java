
public class PileStatic {



static int nbValeur=0;

static final int NB_MAX=100;

static int pile[]=new int[NB_MAX];

static void empiler(int i)
{
	pile[nbValeur]=i;
	nbValeur++;
}

static void afficherSommet()
{
	int nbValeur=pile[0];
	for(int i=0;i<NB_MAX-1;i++)
	{
		if (nbValeur<pile[i]) {
		nbValeur=pile[i];
		}
	}
	System.out.println(nbValeur);
}

static void empiler (int i, int j)
{
	pile[nbValeur]=i;
	nbValeur++;
	pile[nbValeur]=j;
	nbValeur++;
}

static void depiler (int j) 
{
	int nbValeur=pile[0];
	for(int i=0;i<NB_MAX-1;i++)
	{
		if(pile[i]==j) {
			pile[i]=0;
	}
}
	pile[nbValeur]=0;
}

static void delete( ) {
	int nbValeur = pile[0];
	int indiucesommet=0;
	for(int i = 0;i<NB_MAX-1;i++) {
		if (nbValeur<pile[i]) {
			nbValeur=pile[i];
			indiucesommet=i;
			}
	
	}
	pile[indiucesommet]=0;
}
public static void main(String[]args)
{
	 empiler(70);
	 empiler(100);
	 
	 afficherSommet();
	 

	 delete();
	 afficherSommet();
}
}