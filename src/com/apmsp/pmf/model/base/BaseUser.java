package com.apmsp.pmf.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUser<M extends BaseUser<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setBid(java.lang.String bid) {
		set("bid", bid);
	}

	public java.lang.String getBid() {
		return get("bid");
	}

	public void setPname(java.lang.String pname) {
		set("pname", pname);
	}

	public java.lang.String getPname() {
		return get("pname");
	}

	public void setOrgId(java.lang.Long orgId) {
		set("org_id", orgId);
	}

	public java.lang.Long getOrgId() {
		return get("org_id");
	}

	public void setTelephone(java.lang.String telephone) {
		set("telephone", telephone);
	}

	public java.lang.String getTelephone() {
		return get("telephone");
	}

	public void setRoleId(java.lang.String roleId) {
		set("roleId", roleId);
	}

	public java.lang.String getRoleId() {
		return get("roleId");
	}

	public void setPwd(java.lang.String pwd) {
		set("pwd", pwd);
	}

	public java.lang.String getPwd() {
		return get("pwd");
	}

	public void setIsActived(java.lang.Boolean isActived) {
		set("is_actived", isActived);
	}

	public java.lang.Boolean getIsActived() {
		return get("is_actived");
	}

	public void setIsDeleted(java.lang.Boolean isDeleted) {
		set("is_deleted", isDeleted);
	}

	public java.lang.Boolean getIsDeleted() {
		return get("is_deleted");
	}

	public void setIsLogin(java.lang.Boolean isLogin) {
		set("is_login", isLogin);
	}

	public java.lang.Boolean getIsLogin() {
		return get("is_login");
	}

	public void setRamark(java.lang.String ramark) {
		set("ramark", ramark);
	}

	public java.lang.String getRamark() {
		return get("ramark");
	}

}
