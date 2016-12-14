package com.apmsp.pmf.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseProject<M extends BaseProject<M>> extends Model<M> implements IBean {

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

	public void setBStatus(java.lang.String bStatus) {
		set("b_status", bStatus);
	}

	public java.lang.String getBStatus() {
		return get("b_status");
	}

	public void setBid(java.lang.String bid) {
		set("bid", bid);
	}

	public java.lang.String getBid() {
		return get("bid");
	}

	public void setCreationDate(java.util.Date creationDate) {
		set("creation_date", creationDate);
	}

	public java.util.Date getCreationDate() {
		return get("creation_date");
	}

	public void setCreatorId(java.lang.Long creatorId) {
		set("creator_id", creatorId);
	}

	public java.lang.Long getCreatorId() {
		return get("creator_id");
	}

	public void setDefCategoryId(java.lang.Long defCategoryId) {
		set("def_category_id", defCategoryId);
	}

	public java.lang.Long getDefCategoryId() {
		return get("def_category_id");
	}

	public void setDefPriorityId(java.lang.Long defPriorityId) {
		set("def_priority_id", defPriorityId);
	}

	public java.lang.Long getDefPriorityId() {
		return get("def_priority_id");
	}

	public void setDescription(java.lang.String description) {
		set("description", description);
	}

	public java.lang.String getDescription() {
		return get("description");
	}

	public void setIsTemplet(java.lang.Boolean isTemplet) {
		set("is_templet", isTemplet);
	}

	public java.lang.Boolean getIsTemplet() {
		return get("is_templet");
	}

	public void setLastSavedDate(java.util.Date lastSavedDate) {
		set("last_saved_date", lastSavedDate);
	}

	public java.util.Date getLastSavedDate() {
		return get("last_saved_date");
	}

	public void setModifierId(java.lang.Long modifierId) {
		set("modifier_id", modifierId);
	}

	public java.lang.Long getModifierId() {
		return get("modifier_id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setOrgnizationId(java.lang.Long orgnizationId) {
		set("orgnization_id", orgnizationId);
	}

	public java.lang.Long getOrgnizationId() {
		return get("orgnization_id");
	}

	public void setProjectManagerId(java.lang.Long projectManagerId) {
		set("project_manager_id", projectManagerId);
	}

	public java.lang.Long getProjectManagerId() {
		return get("project_manager_id");
	}

	public void setProjectProfileId(java.lang.Long projectProfileId) {
		set("project_profile_id", projectProfileId);
	}

	public java.lang.Long getProjectProfileId() {
		return get("project_profile_id");
	}

	public void setRevision(java.lang.Integer revision) {
		set("revision", revision);
	}

	public java.lang.Integer getRevision() {
		return get("revision");
	}

	public void setRootWbsId(java.lang.Long rootWbsId) {
		set("root_wbs_id", rootWbsId);
	}

	public java.lang.Long getRootWbsId() {
		return get("root_wbs_id");
	}

	public void setSaveVersion(java.lang.String saveVersion) {
		set("save_version", saveVersion);
	}

	public java.lang.String getSaveVersion() {
		return get("save_version");
	}

	public void setSubject(java.lang.String subject) {
		set("subject", subject);
	}

	public java.lang.String getSubject() {
		return get("subject");
	}

}