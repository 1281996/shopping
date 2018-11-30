package com.mallika.lambda;

public class UsingCollections {
int id;
String fName;
String lName;
public UsingCollections(int id,String fName,String lName) {
	this.id=id;
	this.fName=fName;
	this.lName=lName;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
@Override
public String toString() {
	return "UsingCollections [id=" + id + ", fName=" + fName + ", lName="
			+ lName + "]";
}
  


}
