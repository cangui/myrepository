package jyu.rlr.entity;

import java.io.File;
import java.util.Date;


import jyu.rlr.enums.ApplicationState;



public class Application {
	private long id;
	private ApplicationState state;//申请状态
	private User applicationUser;//申请者 
	private String applicationReason;//申请理由
	private File proofMaterial;//证明材料
	private Date applicationDate;//申请日期
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public ApplicationState getState() {
		return state;
	}
	public void setState(ApplicationState state) {
		this.state = state;
	}
	public User getApplicationUser() {
		return applicationUser;
	}
	public void setApplicationUser(User applicationUser) {
		this.applicationUser = applicationUser;
	}
	public String getApplicationReason() {
		return applicationReason;
	}
	public void setApplicationReason(String applicationReason) {
		this.applicationReason = applicationReason;
	}
	public File getProofMaterial() {
		return proofMaterial;
	}
	public void setProofMaterial(File proofMaterial) {
		this.proofMaterial = proofMaterial;
	}
	public Date getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}
}
