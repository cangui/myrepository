package jyu.rlr.dao;

import jyu.rlr.entity.Account;

public interface AccountDao {
	public void showAccount();//显示账户信息
	public void pay(Account account);//支付
}
