package fr.gtm.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

public class DatesVoyage implements Serializable{
private long id;
private LocalDateTime dateDepart;
private LocalDateTime dateRetour;
private float prixHT;
private int deleted;
private int nbPlaces;

public DatesVoyage() {}
public DatesVoyage(long id, LocalDateTime dateDepart, LocalDateTime dateRetour, float prixHT, int deleted,
		int nbPlaces) {
	super();
	this.id = id;
	this.dateDepart = dateDepart;
	this.dateRetour = dateRetour;
	this.prixHT = prixHT;
	this.deleted = deleted;
	this.nbPlaces = nbPlaces;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public LocalDateTime getDateDepart() {
	return dateDepart;
}
public void setDateDepart(LocalDateTime dateDepart) {
	this.dateDepart = dateDepart;
}
public LocalDateTime getDateRetour() {
	return dateRetour;
}
public void setDateRetour(LocalDateTime dateRetour) {
	this.dateRetour = dateRetour;
}
public float getPrixHT() {
	return prixHT;
}
public void setPrixHT(float prixHT) {
	this.prixHT = prixHT;
}
public int getDeleted() {
	return deleted;
}
public void setDeleted(int deleted) {
	this.deleted = deleted;
}
public int getNbPlaces() {
	return nbPlaces;
}
public void setNbPlaces(int nbPlaces) {
	this.nbPlaces = nbPlaces;
}
@Override
public String toString() {
	return "DatesVoyage [id=" + id + ", dateDepart=" + dateDepart + ", dateRetour=" + dateRetour + ", prixHT=" + prixHT
			+ ", deleted=" + deleted + ", nbPlaces=" + nbPlaces + "]";
}


}
