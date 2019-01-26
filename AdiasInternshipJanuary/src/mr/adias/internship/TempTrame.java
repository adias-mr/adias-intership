package mr.adias.internship;

public class TempTrame {
	String objetId;
	int numHeure;
	String listPrelev;
	
	public String trame() {
		return  objetId + "|" + numHeure + "|" +listPrelev;
	}
	
	public TempTrame prendreTrame(objetId, numHeure, listPrelev) {
		return TempTrame.trame;
	}
}
}