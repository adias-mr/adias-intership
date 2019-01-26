package mr.adias.internship;

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
