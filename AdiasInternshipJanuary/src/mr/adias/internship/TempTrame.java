package mr.adias.internship;

import java.util.ArrayList;
import java.util.List;

public class TempTrame {
	
	private static List<TempTrame> trames =new ArrayList<>();
	private String donne;
	@SuppressWarnings("deprecation")
	public TempTrame MethodeUne(String trame){
		
		this.setDonne(trame);
		
		try {
			return TempTrame.class.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	
	}
	
	public void Affichage( List<TempTrame> trames) {
		
		for (TempTrame tempTrame : trames) {
			System.out.println("["+trames.toString()+"]"+" ");
			
		}
		
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TempTrame temp1 = new TempTrame();
		temp1 = temp1.MethodeUne("0T0001|0137.2|38.2|36.2|35.4|30.9|37.2");
		trames.add(temp1);
		temp1.Affichage(trames);
		
		

	}

	public String getDonne() {
		return donne;
	}

	public void setDonne(String donne) {
		this.donne = donne;
	}
	
	

}
