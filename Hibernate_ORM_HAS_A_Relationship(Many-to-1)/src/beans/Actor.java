package beans;

public class Actor {
	private int aid;
	private String actorname;
	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getActorname() {
		return actorname;
	}
	public void setActorname(String actorname) {
		this.actorname = actorname;
	}

	public Actor(int aid, String actorname) {
		super();
		this.aid = aid;
		this.actorname = actorname;
	}

	public Actor() {
	}
}
