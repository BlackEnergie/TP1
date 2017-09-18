import java.util.ArrayList;

public class DemoArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> amis = new ArrayList<String>();
		amis.add("Marie");
		amis.add("Anne");
		amis.add("David");
		amis.add("Rémy");
		
		int nombreAmis = amis.size();
		
		for(int i=0; i<nombreAmis; i++) 
		{
			System.out.println(amis.get(i));
		}
	}
}
