package jyu.rlr.entity;

import jyu.rlr.enums.AuditState;
import jyu.rlr.enums.DonationState;




public class Donation {
	private DonationState donationstate;//捐助状态
	private AuditState aduitstate;//审核状态
	private User donator;//捐助者
	private User gainer;//受捐者
}
