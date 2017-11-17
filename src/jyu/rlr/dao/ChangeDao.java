package jyu.rlr.dao;

import jyu.rlr.entity.Card;

public interface ChangeDao {
	public void showInfo();//零钱明细
	public void inFlow(Card card);//转入
	public void outFlow(Card card);//转出	
}
