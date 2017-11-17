package jyu.rlr.entity;

public class DonationProposal {
	private long id;
	private DonationCash donationcash;//捐款箱

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public DonationCash getDonationcash() {
		return donationcash;
	}

	public void setDonationcash(DonationCash donationcash) {
		this.donationcash = donationcash;
	}
	
}
