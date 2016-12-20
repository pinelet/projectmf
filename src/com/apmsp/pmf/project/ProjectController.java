package com.apmsp.pmf.project;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.apmsp.pmf.Constants;
import com.apmsp.pmf.model.SystemProfile;
import com.apmsp.pmf.model.User;
import com.apmsp.pmf.service.ProjectService;
import com.jfinal.aop.Before;
import com.jfinal.core.Controller;

public class ProjectController extends Controller {
	
	private static Logger loger = Logger.getLogger(ProjectController.class);
	
	public void list() {
		getPara();
	}
	
	//从plist.jsp跳转到pinfo.jsp
	public void info() {
		renderJsp("pinfo.jsp");
	}
	
	//plist.jsp到addproject.jsp 增加项目信息
	public void add() {
		renderJsp("addproject.jsp");
	}
	
	//保存项目基本信息，并取得项目ID
	@Before(ProjectBaseValidator.class)
	public void saveBase() throws ParseException {
		long wbsid = ProjectService.service.saveProject(getParaMap());
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("status", true);
		//FIXME 
		result.put("id", wbsid);
		getSession().setAttribute("wbsid", wbsid);
		renderJson(result);	
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
	 * 当前项目的所有用户成员
	 */
	public void puser() {
		String projectID = getPara();
		if (projectID == null || projectID.isEmpty())
			return;
		List<User> upw = User.dao.find("select upw.user_id as pid, u.pname from user_project_wbs upw, user u where project_id=? and u.id = upw.user_id", Long.parseLong(projectID));
		renderJson(upw);
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
