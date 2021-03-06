package com.apmsp.pmf.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUserProjectWbs<M extends BaseUserProjectWbs<M>> extends Model<M> implements IBean {

	public void setProjectId(java.lang.Long projectId) {
		set("project_id", projectId);
	}

	public java.lang.Long getProjectId() {
		return get("project_id");
	}

	public void setWbsId(java.lang.Long wbsId) {
		set("wbs_id", wbsId);
	}

	public java.lang.Long getWbsId() {
		return get("wbs_id");
	}

	public void setUserId(java.lang.Long userId) {
		set("user_id", userId);
	}

	public java.lang.Long getUserId() {
		return get("user_id");
	}

}
