package com.apmsp.pmf.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDefPriority<M extends BaseDefPriority<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setVersion(java.lang.Long version) {
		set("version", version);
	}

	public java.lang.Long getVersion() {
		return get("version");
	}

	public void setBid(java.lang.String bid) {
		set("bid", bid);
	}

	public java.lang.String getBid() {
		return get("bid");
	}

	public void setDescription(java.lang.String description) {
		set("description", description);
	}

	public java.lang.String getDescription() {
		return get("description");
	}

	public void setIsDefault(java.lang.Boolean isDefault) {
		set("is_default", isDefault);
	}

	public java.lang.Boolean getIsDefault() {
		return get("is_default");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setUseTo(java.lang.String useTo) {
		set("use_to", useTo);
	}

	public java.lang.String getUseTo() {
		return get("use_to");
	}

	public void setValue(java.lang.Integer value) {
		set("value", value);
	}

	public java.lang.Integer getValue() {
		return get("value");
	}

}
