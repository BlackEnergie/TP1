import java.util.ArrayList;

public class MyArrayList<T> extends ArrayList {
	
	public void ajouter(T T) {
		this.add(T);
	}
	
	public int taille() {
		return this.size();
	}
	
}
