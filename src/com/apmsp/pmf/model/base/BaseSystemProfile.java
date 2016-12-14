package com.apmsp.pmf.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSystemProfile<M extends BaseSystemProfile<M>> extends Model<M> implements IBean {

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

	public void setCriticalSlackLimit(java.lang.Integer criticalSlackLimit) {
		set("critical_slack_limit", criticalSlackLimit);
	}

	public java.lang.Integer getCriticalSlackLimit() {
		return get("critical_slack_limit");
	}

	public void setCurrencyDigits(java.lang.Integer currencyDigits) {
		set("currency_digits", currencyDigits);
	}

	public java.lang.Integer getCurrencyDigits() {
		return get("currency_digits");
	}

	public void setDefCalendarId(java.lang.Long defCalendarId) {
		set("def_calendar_id", defCalendarId);
	}

	public java.lang.Long getDefCalendarId() {
		return get("def_calendar_id");
	}

	public void setDefCurrencyId(java.lang.Long defCurrencyId) {
		set("def_currency_id", defCurrencyId);
	}

	public java.lang.Long getDefCurrencyId() {
		return get("def_currency_id");
	}

	public void setDefDurationFormat(java.lang.Integer defDurationFormat) {
		set("def_duration_format", defDurationFormat);
	}

	public java.lang.Integer getDefDurationFormat() {
		return get("def_duration_format");
	}

	public void setDefFixedCostAccrual(java.lang.Integer defFixedCostAccrual) {
		set("def_fixed_cost_accrual", defFixedCostAccrual);
	}

	public java.lang.Integer getDefFixedCostAccrual() {
		return get("def_fixed_cost_accrual");
	}

	public void setDefWorkFormat(java.lang.Integer defWorkFormat) {
		set("def_work_format", defWorkFormat);
	}

	public java.lang.Integer getDefWorkFormat() {
		return get("def_work_format");
	}

	public void setDefaultOvertimeRate(java.lang.Float defaultOvertimeRate) {
		set("default_overtime_rate", defaultOvertimeRate);
	}

	public java.lang.Float getDefaultOvertimeRate() {
		return get("default_overtime_rate");
	}

	public void setDefaultStandarRate(java.lang.Float defaultStandarRate) {
		set("default_standar_rate", defaultStandarRate);
	}

	public java.lang.Float getDefaultStandarRate() {
		return get("default_standar_rate");
	}

	public void setEditableActualCosts(java.lang.Boolean editableActualCosts) {
		set("editable_actual_costs", editableActualCosts);
	}

	public java.lang.Boolean getEditableActualCosts() {
		return get("editable_actual_costs");
	}

	public void setHonorConstraints(java.lang.Boolean honorConstraints) {
		set("honor_constraints", honorConstraints);
	}

	public java.lang.Boolean getHonorConstraints() {
		return get("honor_constraints");
	}

	public void setMethodCostId(java.lang.Long methodCostId) {
		set("method_cost_id", methodCostId);
	}

	public java.lang.Long getMethodCostId() {
		return get("method_cost_id");
	}

	public void setMethodEvmId(java.lang.Long methodEvmId) {
		set("method_evm_id", methodEvmId);
	}

	public java.lang.Long getMethodEvmId() {
		return get("method_evm_id");
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

	public void setMultipleCriticalPaths(java.lang.Boolean multipleCriticalPaths) {
		set("multiple_critical_paths", multipleCriticalPaths);
	}

	public java.lang.Boolean getMultipleCriticalPaths() {
		return get("multiple_critical_paths");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setPertFactorId(java.lang.Long pertFactorId) {
		set("pert_factor_id", pertFactorId);
	}

	public java.lang.Long getPertFactorId() {
		return get("pert_factor_id");
	}

	public void setScheduleFromStart(java.lang.Boolean scheduleFromStart) {
		set("schedule_from_start", scheduleFromStart);
	}

	public java.lang.Boolean getScheduleFromStart() {
		return get("schedule_from_start");
	}

	public void setSplitTasks(java.lang.Boolean splitTasks) {
		set("split_tasks", splitTasks);
	}

	public java.lang.Boolean getSplitTasks() {
		return get("split_tasks");
	}

	public void setTaskType(java.lang.Integer taskType) {
		set("task_type", taskType);
	}

	public java.lang.Integer getTaskType() {
		return get("task_type");
	}

	public void setClazz(java.lang.String clazz) {
		set("clazz", clazz);
	}

	public java.lang.String getClazz() {
		return get("clazz");
	}

	public void setProjectControlMethodId(java.lang.Long projectControlMethodId) {
		set("project_control_method_id", projectControlMethodId);
	}

	public java.lang.Long getProjectControlMethodId() {
		return get("project_control_method_id");
	}

	public void setBelongTo(java.lang.Integer belongTo) {
		set("belong_to", belongTo);
	}

	public java.lang.Integer getBelongTo() {
		return get("belong_to");
	}

	public void setBelongId(java.lang.Long belongId) {
		set("belong_id", belongId);
	}

	public java.lang.Long getBelongId() {
		return get("belong_id");
	}

}
