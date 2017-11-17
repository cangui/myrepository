package jyu.rlr.entity;

import jyu.rlr.enums.AuditState;



public class Auditiem<T> {
	private long id;
	private T itiemRef;//
	private AuditState state;//审核状态
	private User approver;//批准人
	private String info;//驳回提示
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public T getItiemRef() {
		return itiemRef;
	}
	public void setItiemRef(T itiemRef) {
		this.itiemRef = itiemRef;
	}
	public AuditState getState() {
		return state;
	}
	public void setState(AuditState state) {
		this.state = state;
	}
	public User getApprover() {
		return approver;
	}
	public void setApprover(User approver) {
		this.approver = approver;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
}
