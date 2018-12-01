package com.mallika.streams;

public class Department {
int deptNo;
String dName;
String loc;
public Department(int deptNo, String dName, String loc) {
	super();
	this.deptNo = deptNo;
	this.dName = dName;
	this.loc = loc;
}
public int getDeptNo() {
	return deptNo;
}
public void setDeptNo(int deptNo) {
	this.deptNo = deptNo;
}
public String getdName() {
	return dName;
}
public void setdName(String dName) {
	this.dName = dName;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
@Override
public String toString() {
	return "Department [deptNo=" + deptNo + ", dName=" + dName + ", loc=" + loc
			+ "]";
}

}
