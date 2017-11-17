package jyu.rlr.entity;



import jyu.rlr.enums.RoleState;
import jyu.rlr.enums.RoleType;

public class Role {
	private long id;//主键
	private RoleType type;//角色类型
	private RoleState roleState;//角色状态
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public RoleType getType() {
		return type;
	}
	public void setType(RoleType type) {
		this.type = type;
	}
	public RoleState getRoleState() {
		return roleState;
	}
	public void setRoleState(RoleState roleState) {
		this.roleState = roleState;
	}
	
}
