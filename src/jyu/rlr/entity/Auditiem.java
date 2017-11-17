package jyu.rlr.entity;

import jyu.rlr.enums.AuditState;



public class Auditiem<T> {
	private T itiemRef;//
	private AuditState state;//审核状态
	private User approver;//批准人
	private String info;//驳回提示
}
