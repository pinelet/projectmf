package com.apmsp.pmf.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseOrganizationDefWbsType<M extends BaseOrganizationDefWbsType<M>> extends Model<M> implements IBean {

	public void setOrganizationDefWbsTypesId(java.lang.Long organizationDefWbsTypesId) {
		set("organization_def_wbs_types_id", organizationDefWbsTypesId);
	}

	public java.lang.Long getOrganizationDefWbsTypesId() {
		return get("organization_def_wbs_types_id");
	}

	public void setDefWbsTypeId(java.lang.Long defWbsTypeId) {
		set("def_wbs_type_id", defWbsTypeId);
	}

	public java.lang.Long getDefWbsTypeId() {
		return get("def_wbs_type_id");
	}

}
