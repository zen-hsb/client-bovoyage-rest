package fr.gtm.entities;

import java.io.Serializable;

public class Destination implements Serializable{
private long id;
private String region;
private String description;
private int deleted;
//test
public Destination() {}
public Destination(long id, String region, String description, int deleted) {
	super();
	this.id = id;
	this.region = region;
	this.description = description;
	this.deleted = deleted;
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
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getDeleted() {
	return deleted;
}
public void setDeleted(int deleted) {
	this.deleted = deleted;
}
@Override
public String toString() {
	return "Destination [id=" + id + ", region=" + region + ", description=" + description + ", deleted=" + deleted
			+ "]";
}


}
