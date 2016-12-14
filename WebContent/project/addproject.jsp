<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
	<div id="addprojectpanel" class="easyui-accordion" data-options="fit:true, border:false">
		<div title="基本信息" style="padding:0px">
			<form id="ff" method="post">
			<table border="0" class="normal">
				<caption>基本信息</<caption>
				<tr class="normal">
					<td class="normal"><label for="name">项目编号:</label></td>
					<td class="normal"><input class="easyui-validatebox" type="text" name="name" data-options="required:true" /></td>
					<td class="normal"><label for="email">项目名称:</label></td>
					<td class="normal"><input class="easyui-validatebox" type="text" name="email" data-options="validType:'email'"/></td>
				</tr>
				<tr class="normal">
					<td class="normal"><label for="sd">预计开始:</label></td>
					<td class="normal"><input id="sd" name="sd" type="text" class="easyui-datebox" required="required"></td>
					<td class="normal"><label for="ed">预计完成:</label></td>
					<td class="normal"><input id="ed" name="ed" type="text" class="easyui-datebox" required="required"></td>
				</tr>
				<tr class="normal">
					<td class="normal"><label for="edur">预计工期:</label></td>
					<td class="normal"><input type="text" name="edur" class="easyui-numberbox" value="100" data-options="min:0">
						<select name="select" id="select">
		                  <option value="小时">小时</option>
		                  <option value="日历天">日历天</option>
		                  <option selected="selected" value="工作日">工作日</option>
		                  <option value="周">周</option>
		                  <option value="月">月</option>
		                  <option value="季">季</option>
		                  <option value="年">年</option>
		                </select>
                	</td>
					<td class="normal"><label for="esize">预计规模:</label></td>
					<td class="normal"><input type="text" name="esize" class="easyui-numberbox" value="100" data-options="min:0">
						<select name="select2" id="select2">
		                  <option value="人时">人时</option>
		                  <option selected="selected" value="人天">人天</option>
		                  <option value="人月">人月</option>
		                  <option value="人年">人年</option>
		                </select>
					</td>
				</tr>
				<tr class="normal">
					<td class="normal"><label for="pname">项目经理</label></td>
					<td class="normal"><input id="pname" class="easyui-combobox" name="pname" data-options="valueField:'pid',
																							 textField:'pname',
																							 url:'<c:url value='/project/user'/>',
																							 width:'100',
																							 panelHeight:'100',
																							 onLoadSuccess:function() {$('#pname').combobox('select','请选择');}"></td>
					<td class="normal"><label for="pfile">项目类型</label></td>
					<td class="normal"><input id="pfile" name="pfile" class="easyui-combobox" data-options="valueField:'id',
																							 textField:'name',
																							 url:'<c:url value='/project/psimfile'/>',
																							 width:'100',
																							 panelHeight:'60',
																							 onLoadSuccess:function() {$('#pfile').combobox('select','请选择');}"><a href="#">模板预览</a></td>
				</tr>
				<tr class="normal">
					<td class="normal"><label for="pfile">项目描述</label></td>
					<td class="normal" colspan="3"><textarea rows="8" cols="100" placeholder="简要说明"></textarea> </td>
				</tr>
				<tr class="normal">
					<td> </td>
					<td> </td>
					<td> </td>
					<td class="normal">
					<a href="#" onclick="javascript:$('#addprojectpanel').accordion('select',1);">下一步</a>
					<a href="#">保存并离开</a>
					</td>
				</tr>
			</table>
			</form>
		</div>
		<div title="初始计划" style="padding:0px">
			<table id="wbstg" class="easyui-treegrid" data-options="fit:true, 
											        			 url:'<c:url value='/project/wbs/0'/>',
											        			 rownumbers: true,
														         idField:'id',
														         treeField:'name',
														         lines: true,
														         onDblClickRow:clickRow,
														         singleSelect: true,
																 toolbar: '#tb',
																 onContextMenu: onContextMenu,
														         onLoadSuccess:function(row, data) {
														         	rooIdIndex = data[0].id;
														         },
														         onLoadError:function(XMLHttpRequest, textStatus, errorThrown){
														         	console.log(XMLHttpRequest);
														         	console.log(textStatus);
														         	console.log(errorThrown);
														         }">
			    <thead>
			        <tr>
			            <th data-options="field:'name',width:200,editor:'text'">任务名称</th>
			            <th data-options="field:'sdate',width:100,editor:'datebox'">计划开始</th>
			            <th data-options="field:'edate',width:100,editor:'datebox'">计划完成</th>
			            <th data-options="field:'pid',width:120,align:'right',
			            				  formatter:function(value,row){
			            				  	return row.pname;
			            				  },
			            				  editor:{
											type:'combobox',
											options:{
												valueField:'pid',
												textField:'pname',
												method:'get',
												url:'<c:url value='/project/user'/>',
												required:true
											}
										}">资源名称</th>
			        </tr>
			    </thead>
			</table>
			<div id="tb" style="height:auto">
				<a href="javascript:void(0)" class="easyui-linkbutton" onclick="append()" data-options="iconCls:'icon-add',plain:true">增加节点</a>
				<a href="javascript:void(0)" class="easyui-linkbutton" onclick="removeIt()" data-options="iconCls:'icon-remove',plain:true">删除节点</a>
				<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-save',plain:true" onclick="accept()">保存</a>
				<!--a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onclick="getChanges()">提交</a-->
			</div>
			<div id="rmenu" class="easyui-menu" style="width:120px;">
				<div onclick="append()" data-options="iconCls:'icon-add'">增加节点</div>
				<div onclick="removeIt()" data-options="iconCls:'icon-remove'">删除节点</div>
				<!--div class="menu-sep"></div-->
			</div>
			<!--div t="template" class="easyui-panel" fit="true">
				<a href="#" onclick="javascript:$('#addprojectpanel').accordion('select',2);">下一步</a>
				<a href="#">保存并离开</a>
			</div-->
		</div>
		<div title="项目团队" style="padding:0px">
			<div id="ulistout" style="float: left; width: 40%">
				<div class="easyui-datalist" title="可选成员" style="float: right; fit:true" data-options="url:'<c:url value='/project/user'/>', 
					method:'get',
					valueField:'pid',
					textField:'pname',
					singleSelect: false,
					onLoadSuccess:function(data) {console.log(data);}">
				</div>
			</div>
			<div style="float: left; width: 20%">
				<a href="#">》》》</a><br><a href="#">《《《</a>
			</div>
			<div id="ulistin" style="float:left; width: 40%">
				<div class="easyui-datalist" title="已选成员" style="float: right; fit:true" data-options="url:'<c:url value='/project/user'/>', 
					method:'get',
					valueField:'pid',
					textField:'pname',
					singleSelect: false,
					onLoadSuccess:function(data) {console.log(data);}">
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		var editIndex = undefined;
		function endEditing(){
			if (editIndex == undefined){return true;}
			var eid = editIndex.id;
			if ($('#wbstg').treegrid('validateRow', eid)){			
				var ed = $('#wbstg').treegrid('getEditor', {index:eid,field:'pid'});//offical document have a mistake.
				var pname = $(ed.target).combobox('getText');
				editIndex.pname = pname;
				$('#wbstg').treegrid('endEdit', editIndex.id);
				editIndex = undefined;
				return true;
			} else {
				alert("请完善信息.");
				return false;
			}
		}
		//双击行记录修改
		function clickRow(index){
			console.log("click row id: " + index.id);
			if (editIndex != index){
				if (endEditing()){
					$('#wbstg').treegrid('select', index.id).treegrid('beginEdit', index.id);
					editIndex = index;
				} else {
					$('#wbstg').treegrid('select', editIndex.id);
				}
			}
		}
		//提交保存修改
		function accept(){
			if (endEditing()){
				var data = $('#wbstg').treegrid('getData');
				//var datan = $('#wbstg').treegrid('acceptChanges').treegrid('getData');
				console.log("now data: " + JSON.stringify(data));
			}
		}
		//显示右键菜单
		function onContextMenu(e,row){
			if (row){
				e.preventDefault();
				$(this).treegrid('select', row.id);
				$('#rmenu').menu('show',{
					left: e.pageX,
					top: e.pageY
				});				
			}
		}
		var rooIdIndex;
 		var idIndex;
		//增加节点操作
		function append(){
			//必须结束上一个节点的编辑
			if (!endEditing()) {
				$('#wbstg').treegrid('select', editIndex.id);
				return;
			}
			idIndex = new Date().getTime() + '' + getRndInt(100, 999);//生成靠谱的唯一ID数
			var d1 = new Date();
			var d2 = new Date();
			d2.setMonth(d2.getMonth()+1);
			var node = $('#wbstg').treegrid('getSelected');
			if (!node) {
				alert("请选择一个任务节点."); 
				return;
			}
			$('#wbstg').treegrid('append',{
				parent: node.id,
				data: [{
					id: Number(idIndex),
					name: 'New Task'+idIndex,
					pid: 0,
					sdate: $.fn.datebox.defaults.formatter(d1),
					edate: $.fn.datebox.defaults.formatter(d2)
				}]
			})
		}
		//删除节点操作
		function removeIt(){
			var node = $('#wbstg').treegrid('getSelected');
			if (node){
				$.messager.confirm('确认','您确认要删除此任务节点吗?',function(r){  
                    if (r){  
                    	$('#wbstg').treegrid('remove', node.id); 
                    }  
                }); 
			}
			else alert("请选择一个任务节点."); 
		}
	</script>
</body>
</html>