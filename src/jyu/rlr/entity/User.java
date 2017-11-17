package jyu.rlr.entity;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class User {
	private List<Role> roles = new ArrayList<Role>();
	private String username;//用户名
	private long userid;//用户身份证
	private String userphone;//用户手机号
	private String useremail;//用户邮箱
	private File userimage;//用户图片
	private Account useraccount;//用户账户
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public File getUserimage() {
		return userimage;
	}
	public void setUserimage(File userimage) {
		this.userimage = userimage;
	}
	public Account getUseraccount() {
		return useraccount;
	}
	public void setUseraccount(Account useraccount) {
		this.useraccount = useraccount;
	}
	
}
