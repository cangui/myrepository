package jyu.rlr.dao;

import jyu.rlr.entity.User;

public interface UserDao {
	public void addUser(User user);//添加用户
	public void updateUser(User user);//修改用户
	public void showUser(User user);//显示用户信息
}
