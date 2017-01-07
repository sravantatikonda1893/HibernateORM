package beans;

import java.util.Date;

public class Vote {

	private int vtId;
	private String partyName;
	private Date castDate;
	private Voter voter;
	public int getVtId() {
		return vtId;
	}
	public void setVtId(int vtId) {
		this.vtId = vtId;
	}
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	public Date getCastDate() {
		return castDate;
	}
	public void setCastDate(Date castDate) {
		this.castDate = castDate;
	}
	public Voter getVoter() {
		return voter;
	}
	public void setVoter(Voter voter) {
		this.voter = voter;
	}
	
	public Vote() {
	}
}
