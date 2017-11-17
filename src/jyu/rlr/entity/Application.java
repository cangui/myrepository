package jyu.rlr.entity;

import java.io.File;
import java.util.Date;
import java.util.List;

import jyu.rlr.enums.ApplicationState;



public class Application {
	private ApplicationState state;//申请状态
	private User applicationUser;//申请者 
	private String applicationReason;//申请理由
	private File proofMaterial;//证明材料
	private Date applicationDate;//申请日期xin
}
