package com.apmsp.pmf.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseWbs<M extends BaseWbs<M>> extends Model<M> implements IBean {

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

	public void setDefPriorityId(java.lang.Long defPriorityId) {
		set("def_priority_id", defPriorityId);
	}

	public java.lang.Long getDefPriorityId() {
		return get("def_priority_id");
	}

	public void setDefWbsTypeId(java.lang.Long defWbsTypeId) {
		set("def_wbs_type_id", defWbsTypeId);
	}

	public java.lang.Long getDefWbsTypeId() {
		return get("def_wbs_type_id");
	}

	public void setDescription(java.lang.String description) {
		set("description", description);
	}

	public java.lang.String getDescription() {
		return get("description");
	}

	public void setIsKeyNode(java.lang.Boolean isKeyNode) {
		set("is_key_node", isKeyNode);
	}

	public java.lang.Boolean getIsKeyNode() {
		return get("is_key_node");
	}

	public void setLastSaved(java.util.Date lastSaved) {
		set("last_saved", lastSaved);
	}

	public java.util.Date getLastSaved() {
		return get("last_saved");
	}

	public void setMethodTcpId(java.lang.Long methodTcpId) {
		set("method_tcp_id", methodTcpId);
	}

	public java.lang.Long getMethodTcpId() {
		return get("method_tcp_id");
	}

	public void setMethodWcpId(java.lang.Long methodWcpId) {
		set("method_wcp_id", methodWcpId);
	}

	public java.lang.Long getMethodWcpId() {
		return get("method_wcp_id");
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

	public void setParentWbsId(java.lang.Long parentWbsId) {
		set("parent_wbs_id", parentWbsId);
	}

	public java.lang.Long getParentWbsId() {
		return get("parent_wbs_id");
	}

	public void setProjectPhaseId(java.lang.Long projectPhaseId) {
		set("project_phase_id", projectPhaseId);
	}

	public java.lang.Long getProjectPhaseId() {
		return get("project_phase_id");
	}

	public void setResponsibleUserId(java.lang.Long responsibleUserId) {
		set("responsible_user_id", responsibleUserId);
	}

	public java.lang.Long getResponsibleUserId() {
		return get("responsible_user_id");
	}

	public void setWbsLevel(java.lang.Integer wbsLevel) {
		set("wbs_level", wbsLevel);
	}

	public java.lang.Integer getWbsLevel() {
		return get("wbs_level");
	}

	public void setWbsMask(java.lang.String wbsMask) {
		set("wbs_mask", wbsMask);
	}

	public java.lang.String getWbsMask() {
		return get("wbs_mask");
	}

	public void setWbsModel(java.lang.Integer wbsModel) {
		set("wbs_model", wbsModel);
	}

	public java.lang.Integer getWbsModel() {
		return get("wbs_model");
	}

	public void setWbsOutline(java.lang.String wbsOutline) {
		set("wbs_outline", wbsOutline);
	}

	public java.lang.String getWbsOutline() {
		return get("wbs_outline");
	}

	public void setWbsPosition(java.lang.Integer wbsPosition) {
		set("wbs_position", wbsPosition);
	}

	public java.lang.Integer getWbsPosition() {
		return get("wbs_position");
	}

	public void setWbsScheduleId(java.lang.Long wbsScheduleId) {
		set("wbs_schedule_id", wbsScheduleId);
	}

	public java.lang.Long getWbsScheduleId() {
		return get("wbs_schedule_id");
	}

	public void setWbsWorkloadId(java.lang.Long wbsWorkloadId) {
		set("wbs_workload_id", wbsWorkloadId);
	}

	public java.lang.Long getWbsWorkloadId() {
		return get("wbs_workload_id");
	}

}
