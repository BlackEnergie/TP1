import java.util.ArrayList;

public class DemoArrayList 
{
	public static void main(String[] args){
		MyArrayList<Pays> LesPays = new MyArrayList<Pays>();
		
		Pays France = new Pays("France");
		LesPays.ajouter(France);
		
		Pays Allemagne = new Pays("Allemagne");
		LesPays.ajouter(Allemagne);
		
		Pays USA = new Pays("Etats-Unis");
		LesPays.ajouter(USA);
		
		Pays Chine = new Pays("Chine");
		LesPays.ajouter(Chine);
		
		int nbPays = LesPays.size();
		
		System.out.println("La collection contient " + LesPays.taille() + " pays");
		for(int i=0; i<nbPays; i++) {
			afficher(LesPays.get(i));
		}

	}
	
	public static void afficher(Object object) {
		System.out.println(((Pays) object).getNom());
	}
	
}
