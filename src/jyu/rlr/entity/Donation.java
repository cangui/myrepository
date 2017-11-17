package jyu.rlr.entity;

import jyu.rlr.enums.AuditState;
import jyu.rlr.enums.DonationState;




public class Donation {
	private long id;
	private DonationState donationstate;//捐助状态
	private AuditState aduitstate;//审核状态
	private User donator;//捐助者
	private User gainer;//受捐者
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public DonationState getDonationstate() {
		return donationstate;
	}
	public void setDonationstate(DonationState donationstate) {
		this.donationstate = donationstate;
	}
	public AuditState getAduitstate() {
		return aduitstate;
	}
	public void setAduitstate(AuditState aduitstate) {
		this.aduitstate = aduitstate;
	}
	public User getDonator() {
		return donator;
	}
	public void setDonator(User donator) {
		this.donator = donator;
	}
	public User getGainer() {
		return gainer;
	}
	public void setGainer(User gainer) {
		this.gainer = gainer;
	}
	
}
