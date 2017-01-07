package beans;

public class Movies {
private int mid;
private String moviename;
public Movies() {
}
public Movies(int mid, String moviename) {
	super();
	this.mid = mid;
	this.moviename = moviename;
}
public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public String getMoviename() {
	return moviename;
}
public void setMoviename(String moviename) {
	this.moviename = moviename;
}

}
