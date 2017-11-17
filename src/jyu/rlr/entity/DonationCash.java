package jyu.rlr.entity;

public class DonationCash {
	private long id;
	private double currentmoney;//当前金额
	private double targetmoney;//目标金额
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getCurrentmoney() {
		return currentmoney;
	}
	public void setCurrentmoney(double currentmoney) {
		this.currentmoney = currentmoney;
	}
	public double getTargetmoney() {
		return targetmoney;
	}
	public void setTargetmoney(double targetmoney) {
		this.targetmoney = targetmoney;
	}
	
}
