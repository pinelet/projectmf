package com.apmsp.pmf;

import com.apmsp.pmf.model._MappingKit;
import com.apmsp.pmf.project.ProjectController;
import com.apmsp.pmf.service.WBSService;
import com.apmsp.pmf.sys.AuthInterceptor;
import com.apmsp.pmf.sys.SystemController;
import com.apmsp.pmf.task.TaskController;
import com.apmsp.pmf.wbs.WBSController;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;

public class ProjectConfig extends JFinalConfig {

	@Override
	public void configConstant(Constants me) {
		me.setDevMode(true);
		me.setViewType(ViewType.JSP);
		WBSService.init();
	}

	@Override
	public void configHandler(Handlers arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configInterceptor(Interceptors me) {
		// 添加控制层全局拦截器
		me.addGlobalActionInterceptor(new AuthInterceptor());
		// 添加业务层全局拦截器
		//me.addGlobalServiceInterceptor(new GlobalServiceInterceptor());
		
	}

	@Override
	public void configPlugin(Plugins me) {
		loadPropertyFile("resourcesconfig.properties");
		C3p0Plugin c3p0Plugin = new C3p0Plugin(getProperty("jdbc.url"),
		getProperty("jdbc.username"), getProperty("jdbc.password"));
		me.add(c3p0Plugin);
		ActiveRecordPlugin arp = new ActiveRecordPlugin(c3p0Plugin);
		_MappingKit.mapping(arp);
		me.add(arp);
	}

	@Override
	public void configRoute(Routes me) {
		me.add("/login", SystemController.class);
		me.add("/project", ProjectController.class);
		me.add("/project/wbs", WBSController.class);
		me.add("/project/task", TaskController.class);
	}

}
