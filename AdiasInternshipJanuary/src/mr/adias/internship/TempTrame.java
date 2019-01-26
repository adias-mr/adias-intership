package mr.adias.internship;

import java.util.ArrayList;

public class TempTrame {
	  private String tempTrame;
	  private String idetifiant;
	  private String heure;
	  private ArrayList<String> prelevements;
      
	public String getTempTrame() {
		return tempTrame;
	}
	
	public ArrayList<String> getPrelevements() {
		return prelevements;
	}
	
	public void setPrelevements(ArrayList<String> prelevements) {
		this.prelevements = prelevements;
	}
	
	public void setTempTrame(String tempTrame) {
		this.tempTrame = tempTrame;
	}
	
	public String getIdetifiant() {
		return idetifiant;
	}
	
	public void setIdetifiant(String idetifiant) {
		this.idetifiant = idetifiant;
	}
	
	public String getHeure() {
		return heure;
	}
	
	public void setHeure(String heure) {
		this.heure = heure;
	}
}
