package com.apmsp.pmf.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDefCurrency<M extends BaseDefCurrency<M>> extends Model<M> implements IBean {

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

	public void setChinaName(java.lang.String chinaName) {
		set("china_name", chinaName);
	}

	public java.lang.String getChinaName() {
		return get("china_name");
	}

	public void setCode(java.lang.String code) {
		set("code", code);
	}

	public java.lang.String getCode() {
		return get("code");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setNumber(java.lang.String number) {
		set("number", number);
	}

	public java.lang.String getNumber() {
		return get("number");
	}

	public void setSymbol(java.lang.String symbol) {
		set("symbol", symbol);
	}

	public java.lang.String getSymbol() {
		return get("symbol");
	}

}
