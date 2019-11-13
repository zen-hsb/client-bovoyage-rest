package fr.gtm.entities;

import java.io.Serializable;

public class Voyage implements Serializable{
private long id;
private String region;
private String descriptif;

public Voyage() {}
public Voyage(long id, String region, String descriptif) {
	super();
	this.id = id;
	this.region = region;
	this.descriptif = descriptif;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getRegion() {
	return region;
}
public void setRegion(String region) {
	this.region = region;
}
public String getDescriptif() {
	return descriptif;
}
public void setDescriptif(String descriptif) {
	this.descriptif = descriptif;
}
@Override
public String toString() {
	return "Voyage [id=" + id + ", region=" + region + ", descriptif=" + descriptif + "]";
}


}
