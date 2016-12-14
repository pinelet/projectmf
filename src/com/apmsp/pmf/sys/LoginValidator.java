package com.apmsp.pmf.sys;

import com.apmsp.pmf.Constants;
import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class LoginValidator extends Validator implements Constants{

	@Override
	protected void validate(Controller c) {
		validateRequiredString("username", showerr, "请输入用户名");
		validateRequiredString("password", showerr, "请输入密码");
	}

	@Override
	protected void handleError(Controller c) {
		c.keepPara("username");
		//c.keepModel(modelClass);
		c.renderJsp("/login.jsp");

	}

}
