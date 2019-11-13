package fr.gtm.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Voyageur implements Serializable{
private long id;   
private String civilite;
private String prenom;
private String nom;
private LocalDateTime dateNaissance;
//coucouc
public Voyageur() {}
public Voyageur(long id, String civilite, String prenom, String nom, LocalDateTime dateNaissance) {
	super();
	this.id = id;
	this.civilite = civilite;
	this.prenom = prenom;
	this.nom = nom;
	this.dateNaissance = dateNaissance;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getCivilite() {
	return civilite;
}
public void setCivilite(String civilite) {
	this.civilite = civilite;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public LocalDateTime getDateNaissance() {
	return dateNaissance;
}
public void setDateNaissance(LocalDateTime dateNaissance) {
	this.dateNaissance = dateNaissance;
}
@Override
public String toString() {
	return "Voyageur [id=" + id + ", civilite=" + civilite + ", prenom=" + prenom + ", nom=" + nom + ", dateNaissance="
			+ dateNaissance + "]";
}


}
