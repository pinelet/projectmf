package com.apmsp.pmf.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseWbsSchedule<M extends BaseWbsSchedule<M>> extends Model<M> implements IBean {

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

	public void setCompletePercent(java.lang.Float completePercent) {
		set("complete_percent", completePercent);
	}

	public java.lang.Float getCompletePercent() {
		return get("complete_percent");
	}

	public void setCriticalSlackLimit(java.lang.Float criticalSlackLimit) {
		set("critical_slack_limit", criticalSlackLimit);
	}

	public java.lang.Float getCriticalSlackLimit() {
		return get("critical_slack_limit");
	}

	public void setDefDurationFormat(java.lang.Integer defDurationFormat) {
		set("def_duration_format", defDurationFormat);
	}

	public java.lang.Integer getDefDurationFormat() {
		return get("def_duration_format");
	}

	public void setDurationActualCollectedValue(java.lang.Float durationActualCollectedValue) {
		set("duration_actual_collected_value", durationActualCollectedValue);
	}

	public java.lang.Float getDurationActualCollectedValue() {
		return get("duration_actual_collected_value");
	}

	public void setDurationActualEditableValue(java.lang.Float durationActualEditableValue) {
		set("duration_actual_editable_value", durationActualEditableValue);
	}

	public java.lang.Float getDurationActualEditableValue() {
		return get("duration_actual_editable_value");
	}

	public void setDurationEstimatedCollectedValue(java.lang.Float durationEstimatedCollectedValue) {
		set("duration_estimated_collected_value", durationEstimatedCollectedValue);
	}

	public java.lang.Float getDurationEstimatedCollectedValue() {
		return get("duration_estimated_collected_value");
	}

	public void setDurationEstimatedEditableValue(java.lang.Float durationEstimatedEditableValue) {
		set("duration_estimated_editable_value", durationEstimatedEditableValue);
	}

	public java.lang.Float getDurationEstimatedEditableValue() {
		return get("duration_estimated_editable_value");
	}

	public void setDurationExpectedCollectedValue(java.lang.Float durationExpectedCollectedValue) {
		set("duration_expected_collected_value", durationExpectedCollectedValue);
	}

	public java.lang.Float getDurationExpectedCollectedValue() {
		return get("duration_expected_collected_value");
	}

	public void setDurationExpectedEditableValue(java.lang.Float durationExpectedEditableValue) {
		set("duration_expected_editable_value", durationExpectedEditableValue);
	}

	public java.lang.Float getDurationExpectedEditableValue() {
		return get("duration_expected_editable_value");
	}

	public void setDurationPlanedCollectedValue(java.lang.Float durationPlanedCollectedValue) {
		set("duration_planed_collected_value", durationPlanedCollectedValue);
	}

	public java.lang.Float getDurationPlanedCollectedValue() {
		return get("duration_planed_collected_value");
	}

	public void setDurationPlanedEditableValue(java.lang.Float durationPlanedEditableValue) {
		set("duration_planed_editable_value", durationPlanedEditableValue);
	}

	public java.lang.Float getDurationPlanedEditableValue() {
		return get("duration_planed_editable_value");
	}

	public void setFinishDateActual(java.util.Date finishDateActual) {
		set("finish_date_actual", finishDateActual);
	}

	public java.util.Date getFinishDateActual() {
		return get("finish_date_actual");
	}

	public void setFinishDateCalculate(java.util.Date finishDateCalculate) {
		set("finish_date_calculate", finishDateCalculate);
	}

	public java.util.Date getFinishDateCalculate() {
		return get("finish_date_calculate");
	}

	public void setFinishDateCollected(java.util.Date finishDateCollected) {
		set("finish_date_collected", finishDateCollected);
	}

	public java.util.Date getFinishDateCollected() {
		return get("finish_date_collected");
	}

	public void setFinishDateEarlyFinish(java.util.Date finishDateEarlyFinish) {
		set("finish_date_early_finish", finishDateEarlyFinish);
	}

	public java.util.Date getFinishDateEarlyFinish() {
		return get("finish_date_early_finish");
	}

	public void setFinishDateExpected(java.util.Date finishDateExpected) {
		set("finish_date_expected", finishDateExpected);
	}

	public java.util.Date getFinishDateExpected() {
		return get("finish_date_expected");
	}

	public void setFinishDateLateFinish(java.util.Date finishDateLateFinish) {
		set("finish_date_late_finish", finishDateLateFinish);
	}

	public java.util.Date getFinishDateLateFinish() {
		return get("finish_date_late_finish");
	}

	public void setFinishDateLimited(java.util.Date finishDateLimited) {
		set("finish_date_limited", finishDateLimited);
	}

	public java.util.Date getFinishDateLimited() {
		return get("finish_date_limited");
	}

	public void setFinishDatePlaned(java.util.Date finishDatePlaned) {
		set("finish_date_planed", finishDatePlaned);
	}

	public java.util.Date getFinishDatePlaned() {
		return get("finish_date_planed");
	}

	public void setFinishLimiteType(java.lang.Integer finishLimiteType) {
		set("finish_limite_type", finishLimiteType);
	}

	public java.lang.Integer getFinishLimiteType() {
		return get("finish_limite_type");
	}

	public void setFreeSlack(java.lang.Float freeSlack) {
		set("free_slack", freeSlack);
	}

	public java.lang.Float getFreeSlack() {
		return get("free_slack");
	}

	public void setIsCritical(java.lang.Boolean isCritical) {
		set("is_critical", isCritical);
	}

	public java.lang.Boolean getIsCritical() {
		return get("is_critical");
	}

	public void setReserveValue(java.lang.Float reserveValue) {
		set("reserve_value", reserveValue);
	}

	public java.lang.Float getReserveValue() {
		return get("reserve_value");
	}

	public void setShouldComplete(java.lang.Float shouldComplete) {
		set("should_complete", shouldComplete);
	}

	public java.lang.Float getShouldComplete() {
		return get("should_complete");
	}

	public void setStartDateActual(java.util.Date startDateActual) {
		set("start_date_actual", startDateActual);
	}

	public java.util.Date getStartDateActual() {
		return get("start_date_actual");
	}

	public void setStartDateCollected(java.util.Date startDateCollected) {
		set("start_date_collected", startDateCollected);
	}

	public java.util.Date getStartDateCollected() {
		return get("start_date_collected");
	}

	public void setStartDateEarlyStart(java.util.Date startDateEarlyStart) {
		set("start_date_early_start", startDateEarlyStart);
	}

	public java.util.Date getStartDateEarlyStart() {
		return get("start_date_early_start");
	}

	public void setStartDateExpected(java.util.Date startDateExpected) {
		set("start_date_expected", startDateExpected);
	}

	public java.util.Date getStartDateExpected() {
		return get("start_date_expected");
	}

	public void setStartDateLateStart(java.util.Date startDateLateStart) {
		set("start_date_late_start", startDateLateStart);
	}

	public java.util.Date getStartDateLateStart() {
		return get("start_date_late_start");
	}

	public void setStartDateLimited(java.util.Date startDateLimited) {
		set("start_date_limited", startDateLimited);
	}

	public java.util.Date getStartDateLimited() {
		return get("start_date_limited");
	}

	public void setStartDatePlaned(java.util.Date startDatePlaned) {
		set("start_date_planed", startDatePlaned);
	}

	public java.util.Date getStartDatePlaned() {
		return get("start_date_planed");
	}

	public void setStartLimiteType(java.lang.Integer startLimiteType) {
		set("start_limite_type", startLimiteType);
	}

	public java.lang.Integer getStartLimiteType() {
		return get("start_limite_type");
	}

	public void setTotalSlack(java.lang.Float totalSlack) {
		set("total_slack", totalSlack);
	}

	public java.lang.Float getTotalSlack() {
		return get("total_slack");
	}

}
