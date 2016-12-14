<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<div class="easyui-layout" data-options="fit:true">
		<div data-options="region:'center'" style="padding:1px">
			<div class="easyui-accordion" data-options="fit:true, border:false">
				<div title="重要任务" style="padding:1px">
				 	<!-- 已延迟任务列表 -->
					<table id="carddatalist" class="easyui-datagrid" data-options="fit:true,
																				url:'<c:url value="/user/querycardlist"/>',
																				border:false,
																				idField:'gprscode',
																	    		striped: true,
																	    		pagination: true,  
																	            rownumbers:true,
																	            fitColumns:false,
																	            singleSelect:true,
																	            pageSize:15,
																	            frozenColumns:[[
																	                {field:'ck',checkbox:true}
																				]]"														            
					 >  
				        <thead>  
				            <tr>  
				                <th field="cardcode">名称</th>  
				                <th field="cardname" width="100">计划完成</th>
				                <th field="phone" width="50">操作3</th>  
				            </tr>  
				        </thead>  
				    </table> 
				</div>
				<div data-options="collapsed:true" title="重要风险" style="padding:1px">
				  查询当前风险列表
				</div>
				<div data-options="collapsed:true" title="重要事件" style="padding:1px">
				 查询当前事件列表
				</div>
			</div>
		</div>
		<div data-options="region:'east'" style="padding:1px" class="east">
			<div id="plist" title="驾驶台" class="easyui-panel" fit="true" border=false>
				<div title="项目1" data-options="fit:true,closable:true" style="padding:2px;">

				</div>
			</div>		
		</div>
	</div>
</body>
</html>