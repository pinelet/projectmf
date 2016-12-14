<!DOCTYPE html>
<%@ page language="java" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
	<!-- 主页面   -->
	<div class="easyui-layout" data-options="fit:true">
		<div data-options="region:'center'" style="padding:1px">
			<div class="easyui-layout" data-options="fit:true">
				<div data-options="region:'north'" title="已延迟任务" style="padding:1px;height:33%;">
				 	<!-- 已延迟任务列表 -->
					<table id="carddatalist" class="easyui-datagrid" data-options="fit:true,
																				url:'<c:url value="/user/list"/>',
																				idField:'gprscode',
																	    		striped: true,
																	    		toolbar:'#toolbar',
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
				                <th field="phone" width="50">操作</th>  
				            </tr>  
				        </thead>  
				    </table> 
				</div>
				<div data-options="region:'center'" title="今日任务" style="padding:1px">
				  查询当前任务列表
				</div>
				<div data-options="region:'south'" title="明日任务" style="padding:1px;height:33%;">
				 查询明日任务列表
				</div>
			</div>
		</div>
		<div data-options="region:'east'" style="padding:1px;width:70%;">
			<div id="plist" class="easyui-tabs" fit="true">
				<div title="项目1" data-options="closable:true" style="padding:2px;">
					<!-- 事件列表 -->
					<table id="carddatalist" class="easyui-datagrid" data-options="url:'<c:url value="/user/list"/>',
																				idField:'gprscode',
																	    		striped: true,
																	    		toolbar:'#toolbar',
																	    		pagination: true,  
																	            rownumbers:true,
																	            fitColumns:false,
																	            singleSelect:true,
																	            pageList:[10,20,50],
																	            pageSize:15,
																	            frozenColumns:[[
																	                {field:'ck',checkbox:true}
																				]]">  
				        <thead>  
				            <tr>  
				                <th field="cardcode">标题</th>  
				                <th field="cardname" width="100">执行人</th>
				                <th field="phone" width="100">发生时间</th>  
				                <th field="cardstatus" width="30" data-options="formatter:p_cardstatus">分类</th> 
				            </tr>  
				        </thead>  
				    </table> 
				</div>

			</div>		
		</div>
	</div>
	        
    <!-- 弹出的任务操作编辑对话框  -->
    <!--div id="dlguser" class="easyui-dialog" data-options="iconCls:'icon-save', border:true, cache:false" style="width:600px;height:370px;padding:10px 20px"  
            closed="true" buttons="#dlg-buttons" modal="true">  
        <form id="userfm" method="post">
        	<input id="roleid" name="roleid" type="hidden"/>
        	<table class="table" style="width:100%"  cellspacing = '0' cellpadding = '2'> 
        		<tr class="table_head" height="40px"><td  colspan="4">用户信息</td></tr>
        		<tr>
        			<td>客户厂家:</td>
            		<td  colspan="3"><input id="orgno" class="easyui-combobox" type="text" name="orgno" required="true" data-options="
							url:'<c:url value="/manage/orglist"/>',
							valueField:'orgno',
							width:'500',
							textField:'orgname',
							panelHeight:'auto'
					"/></td>  
        		</tr>
	            <tr class="table_odd">
	                <td>用户登录账号:</td>  
	               <td align="left"><input id="pid" name="pid" class="easyui-validatebox" required="true"></td>  
	                <td>用户姓名:</td>  
	               <td align="left"><input id="pname" name="pname" class="easyui-validatebox" required="true"/></td>
	            </tr>
	            <tr class="table_even">  
	                <td>用户状态:</td>  
	               <td align="left">
	               <select id="status" name="status">
	               		<option value="true" >正常</option>
	               		<option value="false" >冻结</option>
	               </select>
	               </td>  
	                <td>用户登录密码:</td>  
	                <td align="left"><input id="pwd" name="pwd" type="password" class="easyui-validatebox" required="true" value="888888">
	                </td>  
	            </tr>
	            <tr class="table_odd">  
	                <td>联系电话:</td>  
	                <td align="left"><input name="telephone"></td>   

 
	            </tr>
	            <tr class="table_even">
	            	<td>备注:</td>  
	                <td align="left"  colspan="3"><input name="ramark" size="80"></td>  
	            </tr>
            </table>
        </form> 
    </div-->  
 
    <script type="text/javascript">
   		//tab显示各项目的状态issues
	    $('#dg').datagrid({
	        url:'datagrid_data.json',
	        columns:[[
	            {field:'code',title:'Code',width:100},
	            {field:'name',title:'Name',width:100},
	            {field:'price',title:'Price',width:100,align:'right'}
	        ]]
	    });
    	
    </script> 
</body>
</html>