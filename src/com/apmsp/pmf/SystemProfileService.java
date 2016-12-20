package com.apmsp.pmf;

public class SystemProfileService implements Constants {

	public final static SystemProfileService service = new SystemProfileService();
	
	/**
	 * 计算工期时间，转化为小时
	 * @param duration
	 * @param timeUnit
	 * @return
	 */
	public float getDuration(String duration, String timeUnit) {
		float d = Float.valueOf(duration);
		switch (DurationTimeUnit.valueOf(timeUnit)) {
		case Hour:
			return d;
		case WDay:
			return d * 8;
		case Week:
			return d * 8 * 5;
		case Mouth:
			return d * 8 * 22;
		case Quarter:
			return d * 8 * 66;
		case Year:
			return d * 8 * 22 * 12;
		default:
			return d;
		}
	}
	
	/**
	 * @param size
	 * @param sizeUnit
	 * @return
	 */
	public int getWorkload(String size, String sizeUnit) {
		float d = Integer.valueOf(size);
		switch (SizeTimeUnit.valueOf(sizeUnit)) {
		case PHour:
			return Math.round(d);
		case PDay:
			return Math.round(d * 8);
		case PMouth:
			return Math.round(d * 8 * 22);
		case PYear:
			return Math.round(d * 8 * 22 * 12);
		default:
			return Math.round(d);	
		}	
	}
}
