import java.util.ArrayList;

public class DemoArrayList 
{
	public static void main(String[] args){
		ArrayList<Pays> LesPays = new ArrayList<Pays>();
		
		Pays France = new Pays("France");
		LesPays.add(France);
		
		Pays Allemagne = new Pays("Allemagne");
		LesPays.add(Allemagne);
		
		Pays USA = new Pays("Etats-Unis");
		LesPays.add(USA);
		
		Pays Chine = new Pays("Chine");
		LesPays.add(Chine);
		
		int nbPays = LesPays.size();
		
		System.out.println("La collection contient " + LesPays.size() + " pays");
		for(int i=0; i<nbPays; i++) {
			System.out.println(LesPays.get(i).getNom());
		}
		
		LesPays.get(1).setNom("Russie");
	}
}
