package com.apmsp.pmf.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseProfileDefCategory<M extends BaseProfileDefCategory<M>> extends Model<M> implements IBean {

	public void setProfileDefCategorysId(java.lang.Long profileDefCategorysId) {
		set("profile_def_categorys_id", profileDefCategorysId);
	}

	public java.lang.Long getProfileDefCategorysId() {
		return get("profile_def_categorys_id");
	}

	public void setDefCategoryId(java.lang.Long defCategoryId) {
		set("def_category_id", defCategoryId);
	}

	public java.lang.Long getDefCategoryId() {
		return get("def_category_id");
	}

}
