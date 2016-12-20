package com.apmsp.pmf;

public interface Constants {

	public static final String showerr = "errormsg";
	
	/**
	 * profile对应的等级：系统级、公司级、项目级
	 * @author 晓松
	 *
	 */
	public static enum Belong{System, Org, Project};
	
	/**
	 * 工期等对应的时间单位
	 * <option value="Hour">小时</option>
      <option value="SDay">日历天</option>
      <option value="WDay">工作日</option>
      <option value="Week">周</option>
      <option value="Mouth">月</option>
      <option value="Quarter">季</option>
      <option value="Year">年</option>
	 * @author 晓松
	 */
	public static enum DurationTimeUnit{Hour, SDay, WDay, Week, Mouth, Quarter, Year};
	
	/**
	 * 项目对应的规模单位
	 *<option value="PHour">人时</option>
      <option value="PDay">人天</option>
      <option value="PMouth">人月</option>
      <option value="PYear">人年</option>
	 */
	public static enum SizeTimeUnit{PHour, PDay, PMouth, PYear};
}
