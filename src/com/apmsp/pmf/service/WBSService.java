package com.apmsp.pmf.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

import com.alibaba.fastjson.JSONReader;
import com.jfinal.kit.PropKit;

public class WBSService {

	private static ConcurrentHashMap<Long, String> WBSJson = new ConcurrentHashMap<Long, String>(); 
	private static Logger loger = Logger.getLogger(WBSService.class);
	
	/**
	 * 此访求需要将项目中所有的WBS结构JSON文件全部读取，其中默认的为0.json
	 * 其它使用对应的项目id做为其文件名
	 * @throws Exception
	 */
	public static void init() {
		String local = PropKit.use("resourcesconfig.properties").get("wbs.json.local");
		//TODO 查询所有当前已有项目列表
		//读取对应的WBS结构文件
		String json = readerWBSFile(local, 0L);
		WBSJson.put(0L, json);
		
	}
	
	/**
	 * 读取WBS记录文件
	 * @param local 文件目录位置
	 * @param pid wbsid 系统默认的wbs的ID为0
	 * @return
	 */
	private static String readerWBSFile(String local, Long pid) {
		StringBuffer json = null;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(local + "/" + pid + ".json"));
			json = new StringBuffer();
			String temp = null;  
			   while ((temp = reader.readLine()) != null) {  
				   json.append(temp);  
			   }
			  reader.close();
		} catch (Exception e) {
			loger.error("json file : " + local, e);
		} 
		return json.toString();
	}
	public static String getWBS(Long key) {
		return WBSJson.get(key);
	}
}
