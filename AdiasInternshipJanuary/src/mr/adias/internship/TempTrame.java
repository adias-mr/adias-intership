package mr.adias.internship;

import java.util.List;

public class TempTrame {
	
	@SuppressWarnings("deprecation")
	public TempTrame MethodeUne(String trame){
		
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
			System.out.println("["+trames+"]"+" ");
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
