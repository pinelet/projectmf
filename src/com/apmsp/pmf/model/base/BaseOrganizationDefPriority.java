package com.apmsp.pmf.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseOrganizationDefPriority<M extends BaseOrganizationDefPriority<M>> extends Model<M> implements IBean {

	public void setOrganizationDefPriorityId(java.lang.Long organizationDefPriorityId) {
		set("organization_def_priority_id", organizationDefPriorityId);
	}

	public java.lang.Long getOrganizationDefPriorityId() {
		return get("organization_def_priority_id");
	}

	public void setDefPriorityId(java.lang.Long defPriorityId) {
		set("def_priority_id", defPriorityId);
	}

	public java.lang.Long getDefPriorityId() {
		return get("def_priority_id");
	}

}
