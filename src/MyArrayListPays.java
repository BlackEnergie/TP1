import java.util.ArrayList;

public class MyArrayListPays<Pays> extends ArrayList {
	
	public void afficher() {
	this.forEach(System.out.println(Pays.getNom()));
	
	}
	
}
