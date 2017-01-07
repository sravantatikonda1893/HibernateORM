package model;

import java.util.Set;

public class Faculty {
private int fid;
private String fname;
private int exp;
//One faculty can teach set of courses
private Set<Course> courses;
public int getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public int getExp() {
	return exp;
}
public void setExp(int exp) {
	this.exp = exp;
}
public Set<Course> getCourses() {
	return courses;
}
public void setCourses(Set<Course> courses) {
	this.courses = courses;
}

public Faculty() {
}

}
