package com.apmsp.pmf.project;

import com.apmsp.pmf.Constants;
import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class ProjectBaseValidator extends Validator implements Constants {

	/**
	 * "projectbid"/"projectname"/"basesd"/"baseed"/"edur"/"timeunit"/"esize"/"sizeunit"/"pid"/"pfile"/"comment"
	 */
	@Override
	protected void validate(Controller c) {
		//projectbid必输
		validateRequiredString("projectbid", showerr, "请输入项目编号");

		// pfile是长整型，pid是长整型
		validateLong("pid", showerr, "人员编号格式有误");
		
		//
		validateLong("pfile", showerr, "策略格式有误");
	}

	@Override
	protected void handleError(Controller c) {
		c.render("addproject.jsp");
	}

}
