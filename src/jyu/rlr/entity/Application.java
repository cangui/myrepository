package jyu.rlr.entity;

import java.util.List;

import jyu.rlr.enums.ApplicationState;



public class Application {
	private List<Role> roles;
	private ApplicationState state;//申请状态
	private User applicationuser;//申请者 
}
