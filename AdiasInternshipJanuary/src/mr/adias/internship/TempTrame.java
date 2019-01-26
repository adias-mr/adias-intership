package mr.adias.internship;

import java.util.ArrayList;
import java.util.List;

public class TempTrame {
 private String  id;
 private int numero_heur;
 String prelevement;
 
 private List <TempTrame> listprelevement = new ArrayList();
 
 
 
// Les accesseurs 
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public int getNumero_heur() {
	return numero_heur;
}
public void setNumero_heur(int numero_heur) {
	this.numero_heur = numero_heur;
}
public String getPrelevement() {
	return prelevement;
}
public void setPrelevement(String prelevement) {
	this.prelevement = prelevement;
}
public List<TempTrame> getList() {
	return listprelevement;
}
public void setList(List<TempTrame> list) {
	this.listprelevement = list;
}

public TempTrame(String id, int numero_heur, String prelevement) {
	this.id = id;
	this.numero_heur = numero_heur;
	this.prelevement = prelevement;
	
}
 
public void afficher_trame() {
	
}
}
