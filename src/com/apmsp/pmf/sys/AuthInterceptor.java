package com.apmsp.pmf.sys;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

public class AuthInterceptor implements Interceptor {

	//验证是否可以登录
	@Override
	public void intercept(Invocation inv) {
		
		//验证用户会话是否存在
		//验证当前功能是否用户有权限访问
		inv.invoke();
	}

}
