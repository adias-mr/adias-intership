package mr.adias.internship;

import java.util.List;

public class TempTrame {
	private String idObjet;
	private final String separateur = "|";
	private int heure;
	private String prelevement;

	public TempTrame() {
		super();
	}

	public TempTrame(String idObjet, int heure, String prelevement) {
		super();
		this.idObjet = idObjet;
		this.heure = heure;
		this.prelevement = prelevement;
	}

	public TempTrame retournerTempTrame(String trame) {
		boolean sepObject=false;
		boolean sepHeure=false;
		boolean sepPrel=false;
		TempTrame t = null;
		for (int i = 0; i < trame.length(); i++) {
			if(trame.charAt(i)!='|' && i<6)
				t.idObjet +=trame.charAt(i);
			if(i>6)
				if(trame.charAt(i)=='|' && i<6)
					t.heure +=trame.charAt(i);
		}
		return t;
	}

	public void retournerListeTempTrame(List<TempTrame> listeT) {
		for(TempTrame l: listeT) {
			System.out.println("["+l.idObjet+"]"+" ");
		}
		
	}
	
	public String getIdObjet() {
		return idObjet;
	}

	public void setIdObjet(String idObjet) {
		this.idObjet = idObjet;
	}

	public int getHeure() {
		return heure;
	}

	public void setHeure(int heure) {
		this.heure = heure;
	}

	public String getPrelevement() {
		return prelevement;
	}

	public void setPrelevement(String prelevement) {
		this.prelevement = prelevement;
	}

	public String getSeparateur() {
		return separateur;
	}

}
