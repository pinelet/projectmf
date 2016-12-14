package com.apmsp.pmf.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseProjectDashboard<M extends BaseProjectDashboard<M>> extends Model<M> implements IBean {

	public void setProjectDashboardsId(java.lang.Long projectDashboardsId) {
		set("project_dashboards_id", projectDashboardsId);
	}

	public java.lang.Long getProjectDashboardsId() {
		return get("project_dashboards_id");
	}

	public void setDashboardId(java.lang.Long dashboardId) {
		set("dashboard_id", dashboardId);
	}

	public java.lang.Long getDashboardId() {
		return get("dashboard_id");
	}

}