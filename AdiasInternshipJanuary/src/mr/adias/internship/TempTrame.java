package mr.adias.internship;

import java.util.List;

public class TempTrame {
	
	private String typeDeCodage;
	private int nombreDePosition;
	private String description;
	
	
	public TempTrame getTrame(String trame) {
		if(trame.equals("0000001"))
			typeDeCodage = "alphanumerique";
		nombreDePosition= 6;
		description = "identifiant d'objet";
		
		return new TempTrame(); 
	}
	
	
	public void afficherTrame(List<TempTrame> trames){
		for(TempTrame tr: trames){
			TempTrame tr1 = this.getTrame(tr);
			System.out.println(tr1 + "/n"); 
		}
		
	}
	
	
	public String getTypeDeCodage() {
		return typeDeCodage;
	}

	public void setTypeDeCodage(String typeDeCodage) {
		this.typeDeCodage = typeDeCodage;
	}

	public int getNombreDePosition() {
		return nombreDePosition;
	}

	public void setNombreDePosition(int nombreDePosition) {
		this.nombreDePosition = nombreDePosition;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
