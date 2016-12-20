package com.apmsp.pmf.wbs;

import org.apache.log4j.Logger;

import com.apmsp.pmf.service.WBSService;
import com.jfinal.core.Controller;

public class WBSController extends Controller {

	private Logger loger = Logger.getLogger(getClass());
	
	public void index() {
		String req = getPara();
		loger.debug("get wbs info: " + req);
	
		//当读取为默认的WBS结构，则生成唯一的根节点ID(再后继的节点由前端生成)
		String wbs = WBSService.getWBS(Long.parseLong(req));
		long rootid = Long.parseLong(req);
		if (rootid == 0L) {
			//目前默认配置的wbs根节点id为0
			long wbsid = (long)getSession().getAttribute("wbsid");
			wbs = wbs.replaceFirst(":0,", ":" + wbsid + ",");
		}
		renderJson(wbs);
	}
}
