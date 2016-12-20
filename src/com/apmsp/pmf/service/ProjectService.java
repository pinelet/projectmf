package com.apmsp.pmf.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

import com.apmsp.pmf.Constants;
import com.apmsp.pmf.SystemProfileService;
import com.apmsp.pmf.model.Project;
import com.apmsp.pmf.model.Wbs;
import com.apmsp.pmf.model.WbsSchedule;
import com.apmsp.pmf.model.WbsWorkload;

public class ProjectService implements Constants {
	
	public final static ProjectService service = new ProjectService();
	DateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
	
	/**
	 * 以下为addproject页面请求端字段
	 *  "projectbid"/"projectname"/"basesd"/"baseed"/"edur"/"timeunit"/"esize"/"sizeunit"/"pid"/"pfile"/"comment"
	 * @param infos
	 * @return WBSID
	 * @throws ParseException 
	 */
	public long saveProject(Map<String, String[]> infos) throws ParseException {
		//新增项目
		Project project = new Project();
		project.setBid(infos.get("projectbid")[0]);
		project.setName(infos.get("projectname")[0]);
		project.setProjectManagerId(Long.parseLong(infos.get("pid")[0]));
		project.setDescription(infos.get("comment")[0]);
		
		//新增WBS与项目关联
		WbsSchedule wschedule = new WbsSchedule();
		wschedule.setStartDateExpected(formater.parse((infos.get("basesd")[0])));
		wschedule.setFinishDateExpected(formater.parse((infos.get("baseed")[0])));
		//工期转化
		float duration = SystemProfileService.service.getDuration(infos.get("edur")[0], infos.get("timeunit")[0]);
		wschedule.setDurationExpectedEditableValue(duration);
		wschedule.save();
		//规模转化
		WbsWorkload workload = new WbsWorkload();
		int size = SystemProfileService.service.getWorkload( infos.get("esize")[0], infos.get("sizeunit")[0]);
		workload.setExpectedEditableValue(size);
		workload.save();
		
		//新项目关联
		Wbs wbs = new Wbs();
		wbs.setWbsWorkloadId(workload.getId());
		wbs.setWbsScheduleId(wschedule.getId());
		wbs.save();
		
		project.setRootWbsId(wbs.getId());
		project.save();
		return wbs.getId();
	}

}
