package com.apmsp.pmf.project;

import java.util.ArrayList;
import java.util.List;

import com.apmsp.pmf.Constants;
import com.apmsp.pmf.model.SystemProfile;
import com.apmsp.pmf.model.User;
import com.jfinal.core.Controller;

public class ProjectController extends Controller {
	
	public void list() {
		getPara();
	}
	
	//从plist.jsp跳转到pinfo.jsp
	public void info() {
		renderJsp("pinfo.jsp");
	}
	
	//plist.jsp到addproject.jsp 增加项目信息
	public void add() {
		//
		renderJsp("addproject.jsp");
	}
	
	/**
	 * 当前用户所在公司的所有人员列表
	 */
	public void user() {
		User user = (User)getSessionAttr("user");
		List<User> users = user.dao.find("select id as pid,pname from user where org_id=?", user.getLong("org_id"));
		renderJson(users);
	}
	
	/**
	 * 当前公司定义的项目类型
	 */
	public void psimfile() {
		User user = (User)getSessionAttr("user");
		List<SystemProfile> profile = SystemProfile.dao.find("select id, name from system_profile where belong_to=? and belong_id=?", Constants.Belong.Org.ordinal(), user.getLong("org_id"));
		renderJson(profile);
	}
}
