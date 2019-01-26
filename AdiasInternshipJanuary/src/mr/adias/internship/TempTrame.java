package mr.adias.internship;

public class TempTrame {

	String idObjet;
	String heur;
	String[] ListePrelevements;


	public String getIdObjet(String trame) {
		idObjet="";
		for(int i=0;i<trame.indexOf("|");i++){
			idObjet.concat(trame.charAt(i));
		}
		return idObjet;
	}

	public String getHeur(String trame ) {
		heur="";
		for(int i=trame.indexOf("|");i<trame.indexOf("|", trame.indexOf("|") + 2);i++){
			heur.concat(trame.charAt(i));
		}
		return heur;
	}

	public String[] getListePrelevements(String trame) {

		return ListePrelevements;
	}

	public  TempTrame(String trame){
		this.trame=trame;

	}

}
