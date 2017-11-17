package jyu.rlr.entity;

public class Account {
	private Change change;//零钱
	private Card bankaccount;//银行卡
	
	
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
