package com.apmsp.pmf.sys;

import org.apache.log4j.Logger;

import com.apmsp.pmf.Constants;
import com.apmsp.pmf.model.User;
import com.jfinal.aop.Before;
import com.jfinal.aop.Clear;
import com.jfinal.core.Controller;

public class SystemController extends Controller implements Constants{
	
	private static Logger loger = Logger.getLogger(SystemController.class);
			
	@Clear
	@Before(LoginValidator.class)
	public void index() {
		String uname = getPara("username");
		String pwd = getPara("password");
		//取得用户的信息
		if (!auth(uname, pwd)) {
			keepPara("username");		
			renderJsp("/login.jsp");
			return;
		}
		renderJsp("/layout.jsp");
	}
	
	private boolean auth(String name, String pwd) {
		//验证密码
		User user = User.dao.findFirst("select * from user where bid = ? limit 1", name);
		
		if (user == null || !pwd.equals(user.getStr("pwd"))) {
			setAttr(showerr, "账户或密码错误");
			return false;
		}
		//会话中加入用户信息，显示对应用户角色的菜单
		setSessionAttr("user", user);
		setAttr("user",user);
		//页面数据
		return true;
	}

}
