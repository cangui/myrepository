package jyu.rlr.dao;

import java.util.List;

import jyu.rlr.entity.Card;

public interface CardDao {
	public void addCard(Card card);//添加银行卡
	public void deleteCard(Card card);//删除银行卡
	public List<Card> showCard();//显示银行卡
	public void chooseCard(Card card);//选择银行卡
}
