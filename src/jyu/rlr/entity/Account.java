package jyu.rlr.entity;

public class Account {
	private long id;
	private Change change;//零钱
	private Card bankaccount;//银行卡
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Change getChange() {
		return change;
	}
	public void setChange(Change change) {
		this.change = change;
	}
	public Card getBankaccount() {
		return bankaccount;
	}
	public void setBankaccount(Card bankaccount) {
		this.bankaccount = bankaccount;
	}

}
